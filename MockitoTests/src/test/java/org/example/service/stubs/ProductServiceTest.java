package org.example.service.stubs;

import org.example.ProductDetail;
import org.example.dao.ProductDao;
import org.example.service.BillService;
import org.example.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.Arrays;
import java.util.Collections;

/**
 * ----------------------------------------------------------------------------
 * <p>
 * ********************* Kind of Stubbing **************************
 * <p>
 * ----------------------------------------------------------------------------
 * <p>
 * 1) when() thenReturn() example
 * - anyString()
 * - anyInt()
 * - anyMap()
 * <p>
 * 2) when() thenThrow() example
 * <p>
 * 3) doReturn() when() spy example
 * <p>
 * 4) doThrow() when() void example
 * <p>
 * 5) when() thenReturn() thenThrow() multiple call example
 * <p>
 * 6) when() thenCallRealMethod() example
 * <p>
 * 7) doAnswer() when() example
 */
class ProductServiceTest {
    @Mock
    private ProductDao productDao;

    @Spy
    private BillService billService;

    @InjectMocks
    private ProductService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * when() thenReturn() example with anyString()
     */
    @Test
    public void testWhenThenWithAnyString() {
        ProductDetail expectedProductDetail = new ProductDetail();
        expectedProductDetail.setId(1);
        expectedProductDetail.setName("test_order");
        expectedProductDetail.setDescription("test description");
        expectedProductDetail.setPrice(200);

        Mockito.when(productDao.get(ArgumentMatchers.anyString()))
                .thenReturn(expectedProductDetail);

        ProductDetail actualProductDetail = service.getProductDetailByName("test_order");

        Assertions.assertNotNull(actualProductDetail);
        Assertions.assertEquals(expectedProductDetail.getName(), actualProductDetail.getName());
    }

    /**
     * when() thenReturn() example with anyInt()
     */
    @Test
    public void testWhenThenWithAnyInt() {
        ProductDetail expectedProductDetail = new ProductDetail();
        expectedProductDetail.setId(1);
        expectedProductDetail.setName("test_order");
        expectedProductDetail.setDescription("test description");
        expectedProductDetail.setPrice(200);

        Mockito.when(productDao.getById(ArgumentMatchers.anyInt()))
                .thenReturn(expectedProductDetail);

        ProductDetail actualProductDetail = service.getProductById(1);

        Assertions.assertNotNull(actualProductDetail);
        Assertions.assertEquals(expectedProductDetail.getName(), actualProductDetail.getName());
    }

    /**
     * when() thenReturn() example with anyMap()
     */
    @Test
    public void testWhenThenWithAnyMap() {
        ProductDetail expectedProductDetail = new ProductDetail();
        expectedProductDetail.setId(1);
        expectedProductDetail.setName("test_order");
        expectedProductDetail.setDescription("test description");
        expectedProductDetail.setPrice(200);

        Mockito.when(productDao.getByMap(ArgumentMatchers.anyMap()))
                .thenReturn(expectedProductDetail);

        ProductDetail actualProductDetail = service.getDetail(Collections.singletonMap("test_order", 200));

        Assertions.assertNotNull(actualProductDetail);
        Assertions.assertEquals(expectedProductDetail.getName(), actualProductDetail.getName());
    }

    /**
     * when() thenThrow() example
     */
    @Test
    public void testWhenThenThrow() {
        Mockito.when(productDao.getById(ArgumentMatchers.anyInt()))
                .thenThrow(new NullPointerException());

        Assertions.assertThrows(NullPointerException.class, () -> service.getProductById(1));
    }

    /**
     * doReturn example with a spy
     */
    @Test
    public void testDoReturnWithSpy() {
        double expectBill = 200.0;
        Mockito.when(productDao.getAll()).thenReturn(Arrays.asList(new ProductDetail(), new ProductDetail()));
        Mockito.doReturn(expectBill).when(billService).getTotalBill(ArgumentMatchers.anyList(), ArgumentMatchers.anyInt());
        Double actualBill = service.getBill(2);

        Assertions.assertEquals(expectBill, actualBill);
    }

    /**
     * doThrow() when() void example
     */
    @Test
    public void testDoThrowWithVoidMethod() {
        Mockito.doThrow(new RuntimeException())
                .when(productDao).add(ArgumentMatchers.any());
        Assertions.assertThrows(RuntimeException.class, () -> service.addProduct(new ProductDetail()));
    }

    /**
     * when() thenReturn() thenThrow() multiple call example
     */
    @Test
    public void testWhenThenAndThenThrow() {
        Mockito.when(productDao.getById(ArgumentMatchers.anyInt()))
                .thenReturn(new ProductDetail())
                .thenThrow(new NullPointerException());
        Assertions.assertAll(
                () -> Assertions.assertNotNull(service.getProductById(1)),
                () -> Assertions.assertThrows(NullPointerException.class, () -> service.getProductById(2))
        );
    }

    /**
     * when() thenCallRealMethod() example
     */
    @Test
    public void testWhenThenCallRealMethod() {
        double expectBill = 200.0;
        ProductDetail productDetail = new ProductDetail();
        productDetail.setPrice(100);
        ProductDetail productDetail1 = new ProductDetail();
        productDetail1.setPrice(100);

        Mockito.when(productDao.getAll()).thenReturn(Arrays.asList(productDetail, productDetail1));
        Mockito.when(billService.getTotalBill(ArgumentMatchers.anyList(), ArgumentMatchers.anyInt())).thenCallRealMethod();
        Double actualBill = service.getBill(2);

        Assertions.assertEquals(expectBill, actualBill);
    }

    /**
     * doAnswer() when() example
     */
    @Test
    public void testDoAnswerExample() {
        Mockito.doAnswer(invocation -> {
                    ProductDetail product = invocation.getArgument(0);
                    Assertions.assertNotNull(product);
                    Assertions.assertEquals(1, product.getId());
                    Assertions.assertEquals("test_product", product.getName());
                    return null;
                })
                .when(productDao).add(ArgumentMatchers.any());
        ProductDetail product = new ProductDetail();
        product.setId(1);
        product.setName("test_product");
        service.addProduct(product);
    }
}