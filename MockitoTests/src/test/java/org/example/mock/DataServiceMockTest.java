package org.example.mock;

import org.example.DataService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;

public class DataServiceMockTest {

    private List<String> dataRepositoryMock;
    private DataService service;

    @Before
    public void setUp() {
        dataRepositoryMock = Mockito.mock(ArrayList.class);
        service = new DataService(dataRepositoryMock);
    }

    @Test
    public void testSaveData() {
        Mockito.when(dataRepositoryMock.add(anyString())).thenReturn(true);
        boolean expectedResponse = service.saveData("test");
        Assert.assertTrue(expectedResponse);
    }

    @Test
    public void testHasData() {
        Mockito.when(dataRepositoryMock.contains(anyString())).thenReturn(true);
        boolean expectedResponse = service.hasData("test");
        Assert.assertTrue(expectedResponse);
    }

    @Test
    public void testGetData() {
        Mockito.when(dataRepositoryMock.get(anyInt())).thenReturn("test");
        String expectedResponse = service.getData(0);
        Assert.assertEquals(expectedResponse, "test");
    }
}