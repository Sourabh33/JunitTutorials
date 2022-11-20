package org.example.service;

import org.example.DataService;
import org.example.dao.DataRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;

//@RunWith(MockitoJUnitRunner.class)
public class DataServiceAnnotationTest {
    @Mock
    private DataRepository dataRepositoryMock;
    @InjectMocks
    private DataService service;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveData() {
        Mockito.when(dataRepositoryMock.save(anyString())).thenReturn(true);
        boolean expectedResponse = service.saveData("test");
        Assert.assertTrue(expectedResponse);
    }

    @Test
    public void testHasData() {
        Mockito.when(dataRepositoryMock.checkData(anyString())).thenReturn(true);
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
