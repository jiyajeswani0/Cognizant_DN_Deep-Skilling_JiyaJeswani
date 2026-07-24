package com.cognizant.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    void testExternalApi() {

        // 1. Creating a "fake" mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // 2. Stubbing the method (tell the fake what to do when called)
        when(mockApi.getData()).thenReturn("Mock Data");

        // 3. Injecting the fake mock into our service
        MyService service = new MyService(mockApi);

        // 4. Calling the method
        String result = service.fetchData();

        // 5. Verifying the result
        assertEquals("Mock Data", result);
    }
}