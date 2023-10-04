package mock;

public class Volumeutil {
    
    private AudioManager audioManager;

    public void maximizeVolume(int max) {
        audioManager.setVolume(max);
    }
}
