package org.example.service.mock;

import org.example.dao.DataRepository;
import org.example.service.DataService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
// Junit 4
//@RunWith(MockitoJUnitRunner.class)
// Junit 5
//@ExtendWith(MockitoExtension.class)
public class DataServiceAnnotationTest {
    @Mock
    private DataRepository dataRepositoryMock;
    @InjectMocks
    private DataService service;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveData() {
        Mockito.when(dataRepositoryMock.save(anyString())).thenReturn(true);
        boolean expectedResponse = service.saveData("test");
        Assertions.assertTrue(expectedResponse);
    }

    @Test
    public void testHasData() {
        Mockito.when(dataRepositoryMock.checkData(anyString())).thenReturn(true);
        boolean expectedResponse = service.hasData("test");
        Assertions.assertTrue(expectedResponse);
    }

    @Test
    public void testGetData() {
        Mockito.when(dataRepositoryMock.get(anyInt())).thenReturn("test");
        String expectedResponse = service.getData(0);
        Assertions.assertEquals(expectedResponse, "test");
    }
}
