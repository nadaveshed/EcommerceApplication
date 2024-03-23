package com.example.demo;

import com.example.demo.controller.CategoryController;
import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CategoryControllerTest {

    @Mock
    private CategoryService categoryService;

    @InjectMocks
    private CategoryController categoryController;

    @Test
    void createCategoryTest() {
        // Arrange
        Category mockCategory = new Category(/* mock category details */);
        when(categoryService.createCategory(any(Category.class))).thenReturn(mockCategory);

        // Act
        ResponseEntity<Category> responseEntity = categoryController.createCategory(mockCategory);

        // Assert
        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
        assertEquals(mockCategory, responseEntity.getBody());
        verify(categoryService, times(1)).createCategory(any(Category.class));
    }

    @Test
    void updateCategoryTest() {
        // Arrange
        Long categoryId = 1L;
        Category mockCategory = new Category(/* mock category details */);
        when(categoryService.updateCategory(eq(categoryId), any(Category.class))).thenReturn(mockCategory);

        // Act
        ResponseEntity<Category> responseEntity = categoryController.updateCategory(categoryId, mockCategory);

        // Assert
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(mockCategory, responseEntity.getBody());
        verify(categoryService, times(1)).updateCategory(eq(categoryId), any(Category.class));
    }

    @Test
    void deleteCategoryTest() {
        // Arrange
        Long categoryId = 1L;

        // Act
        ResponseEntity<Void> responseEntity = categoryController.deleteCategory(categoryId);

        // Assert
        assertEquals(HttpStatus.NO_CONTENT, responseEntity.getStatusCode());
        verify(categoryService, times(1)).deleteCategory(eq(categoryId));
    }
}
