package org.example.service.mock;

import org.example.dao.DataRepository;
import org.example.service.DataService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;

public class DataServiceTest {

    private DataRepository dataRepositoryMock;
    private DataService service;

    @BeforeEach
    public void setUp() {
        dataRepositoryMock = Mockito.mock(DataRepository.class);
        service = new DataService(dataRepositoryMock);
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