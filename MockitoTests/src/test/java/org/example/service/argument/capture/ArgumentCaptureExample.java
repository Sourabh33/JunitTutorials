package org.example.service.argument.capture;

import org.example.dao.ProductDao;
import org.example.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ArgumentCaptureExample {
    @Mock
    private ProductDao productDao;
    @InjectMocks
    private ProductService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testDeleteProductWithArgumentCapture() {
        ArgumentCaptor<String> nameArgumentCaptor = ArgumentCaptor.forClass(String.class);

        service.deleteProduct();

        Mockito.verify(productDao).deleteByName(nameArgumentCaptor.capture());
        String value = nameArgumentCaptor.getValue();

        Assertions.assertEquals("product-name", value);
    }
}
