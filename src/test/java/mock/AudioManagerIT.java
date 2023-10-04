package mock;

import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;


import io.quarkus.test.junit.QuarkusIntegrationTest;

@QuarkusIntegrationTest
@ExtendWith(MockitoExtension.class)
public class AudioManagerIT extends AudioManagerTest {
    // Execute the same tests but in packaged mode.




}
