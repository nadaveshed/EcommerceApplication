package com.example.demo;

import com.example.demo.controller.ProductController;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProductControllerTest {

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    @Test
    void createProductTest() {
        // Arrange
        Product mockProduct = new Product(/* mock product details */);
        when(productService.createProduct(ArgumentMatchers.any(Product.class))).thenReturn(mockProduct);

        // Act
        ResponseEntity<Product> responseEntity = productController.createProduct(mockProduct);

        // Assert
        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
        assertEquals(mockProduct, responseEntity.getBody());
        verify(productService, times(1)).createProduct(ArgumentMatchers.any(Product.class));
    }

    @Test
    void updateProductTest() {
        // Arrange
        Long productId = 1L;
        Product mockProduct = new Product(/* mock product details */);
        when(productService.updateProduct(eq(productId), any(Product.class))).thenReturn(mockProduct);

        // Act
        ResponseEntity<Product> responseEntity = productController.updateProduct(productId, mockProduct);

        // Assert
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(mockProduct, responseEntity.getBody());
        verify(productService, times(1)).updateProduct(eq(productId), any(Product.class));
    }

    @Test
    void deleteProductTest() {
        // Arrange
        Long productId = 1L;

        // Act
        ResponseEntity<Void> responseEntity = productController.deleteProduct(productId);

        // Assert
        assertEquals(HttpStatus.NO_CONTENT, responseEntity.getStatusCode());
        verify(productService, times(1)).deleteProduct(eq(productId));
    }
}
