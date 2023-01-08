package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.ProductDetail;

import java.util.List;

@Slf4j
public class BillService {

    public Double getTotalBill(List<ProductDetail> products, Integer numberOfItems) {
        log.info("Calculating bill for number of items: {}", numberOfItems);
        return (double) products.stream().mapToInt(ProductDetail::getPrice).sum();
    }
}
