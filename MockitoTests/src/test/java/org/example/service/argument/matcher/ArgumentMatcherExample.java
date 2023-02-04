package org.example.service.argument.matcher;

import org.example.dao.ProductDao;
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

import java.util.concurrent.atomic.AtomicReference;

public class ArgumentMatcherExample {
    @Mock
    private ProductDao productDao;
    @InjectMocks
    private ProductService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testDeleteProductWithArgumentMatcher() {
        // Given
        Mockito.doNothing().when(productDao).deleteByName(ArgumentMatchers.anyString());
        Mockito.doNothing().when(productDao).deleteByName(ArgumentMatchers.any());
        Mockito.doNothing().when(productDao).deleteByName(ArgumentMatchers.eq("product-name"));

        // When
        service.deleteProduct();

        // Then
        Mockito.verify(productDao).deleteByName(ArgumentMatchers.anyString());
    }

    @Test
    public void testDeleteProductWithArgumentMatcher_likeArgumentCapture() {
        // Given
        Mockito.doAnswer(
                invocation -> {
                    String nameArgument = invocation.getArgument(0, String.class);
                    Assertions.assertEquals("product-name", nameArgument);
                    return null;
                }
        ).when(productDao).deleteByName(ArgumentMatchers.anyString());

        // When
        service.deleteProduct();

        // Then
//        Mockito.verify(productDao).deleteByName(ArgumentMatchers.anyString());
    }
}
