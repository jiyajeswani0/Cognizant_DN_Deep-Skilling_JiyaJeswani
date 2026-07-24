package com.cognizant.mockito;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    void testVerifyInteraction() {

        // 1. Create the mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // 2. Inject the mock into the service
        MyService service = new MyService(mockApi);

        // 3. Call the method that we want to test
        service.fetchData();

        // 4. VERIFY: Did our service actually call getData() on the mock object?
        // This will pass if it was called exactly once, and fail if it wasn't called.
        verify(mockApi).getData();
    }
}