package org.example.service.spy;

import org.example.dao.DataRepository;
import org.example.service.DataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

// JUnit 4
//@RunWith(MockitoJUnitRunner.class)
// Junit 5
@ExtendWith(MockitoExtension.class)
class DataServiceAnnotationTest {

    @Spy
    private DataRepository repositorySpy;

    @InjectMocks
    private DataService service;

    @BeforeEach
    void setUp() {
//        MockitoAnnotations.openMocks(this);
    }

    @Test
    void saveData() {
        service.saveData("Hello Spy");
        Mockito.verify(repositorySpy).save("Hello Spy");
    }

    @Test
    void hasData() {
    }

    @Test
    void getData() {
    }
}