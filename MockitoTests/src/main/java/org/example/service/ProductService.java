package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.ProductDetail;
import org.example.dao.ProductDao;

import java.util.List;
import java.util.Map;

/**
 * Product Service
 */
@Slf4j
public class ProductService {
    private final ProductDao productDao;
    private final BillService billService;

    public ProductService(ProductDao productDao, BillService billService) {
        this.productDao = productDao;
        this.billService = billService;
    }

    public ProductDetail getProductDetailByName(String name) {
        log.info("ProductService::getProductDetailByName() with name: {}", name);
        ProductDetail productDetail = productDao.get(name);
        System.out.println("product name: " + productDetail.getName());
        return productDetail;
    }

    public ProductDetail getProductById(Integer productId) {
        log.info("ProductService::getProductById() with productId: {}", productId);
        return productDao.getById(productId);
    }

    public Double getBill(Integer numberOfItems) {
        log.info("ProductService::getBill() with numberOfItems: {}", numberOfItems);
        List<ProductDetail> products = productDao.getAll();
        return billService.getTotalBill(products, numberOfItems);
    }

    public ProductDetail getDetail(Map<String, Integer> nameToPrice) {
        log.info("ProductService::getDetail()");
        return productDao.getByMap(nameToPrice);
    }

    public void addProduct(ProductDetail product) {
        log.info("ProductService::addProduct()");
        productDao.add(product);
    }

    public String getDescription(String name) {
        log.info("ProductService::getDescription() with name: {}", name);
        ProductDetail productDetail = productDao.get(name);
        return productDetail.getDescription();
    }

    public void deleteProduct(String name) {
        log.info("deleting product with name: {}", name);
        productDao.deleteByName(name);
    }
}
