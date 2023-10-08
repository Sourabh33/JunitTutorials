package org.example.service.strictness;

import org.example.dao.DataRepository;
import org.example.service.DataService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoSession;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

@MockitoSettings(strictness = Strictness.STRICT_STUBS)
public class DataServiceExampleTest {

//    MockitoSession session;

//    @Mock(strictness = Mock.Strictness.STRICT_STUBS)
    @Mock
    DataRepository repository;
    DataService service;

    @BeforeEach
    void setUp() {
//        MockitoAnnotations.openMocks(this);
//        session = Mockito.mockitoSession()
//                .initMocks(this)
//                .strictness(Strictness.STRICT_STUBS)
//                .startMocking();
//        repository = Mockito.mock(DataRepository.class, Mockito.withSettings().strictness(Strictness.STRICT_STUBS));
        service = new DataService(repository);
    }

    @Test
    void testStrictness() {
        Mockito.lenient().when(repository.save("one")).thenReturn(true);
    }

    @AfterEach
    void tearDown() {
//        session.finishMocking();
    }
}
