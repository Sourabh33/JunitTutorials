package org.example.service.spy;

import org.example.dao.DataRepository;
import org.example.service.DataService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;

class DataServiceSpyTest {

    private DataRepository repositorySpy;
    private DataService service;

    @BeforeEach
    void setUp() {
        repositorySpy = Mockito.spy(new DataRepository());
        service = new DataService(repositorySpy);
    }

    @Test
    void saveData() {
        service.saveData("Hello Spy");
        Mockito.verify(repositorySpy).save("Hello Spy");
    }

    @Test
    void hasData() {
        service.saveData("test");
        boolean expectedResponse = service.hasData("test");
        Assertions.assertTrue(expectedResponse);
    }

    @Test
    void getData() {
        Mockito.doReturn("Hello Spy").when(repositorySpy).get(anyInt());
        String responseData = service.getData(1);
        Assertions.assertNotNull(responseData);
    }
}