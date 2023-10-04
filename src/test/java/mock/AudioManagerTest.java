package mock;

import io.quarkus.test.InjectMock;
import io.quarkus.test.Mock;
import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;



@QuarkusTest
@ExtendWith(MockitoExtension.class)
public class AudioManagerTest {

    @Mock
    AudioManager audioManager;

    @InjectMock
    Volumeutil volumeutil;

    @Test
    void testAudioManagerSetVolume()  {
        // 3 - realize uma chamada para o método maximizeVolume do objeto VolumeUtil
    
        volumeutil.maximizeVolume(10);

        // 4 - Verifique se o método setVolume foi chamado uma única vez
        verify(audioManager).setVolume(10);;
        }


}