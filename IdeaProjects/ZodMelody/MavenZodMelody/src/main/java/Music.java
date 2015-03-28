import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.net.URL;

public class Music {
    private URL resource;
    private Media sound;
    private MediaPlayer audioPlayer;
    private String soundName;

    public Music(String ZodSound) {
        resource = getClass().getResource(ZodSound);
        sound = new Media(resource.toString());
        audioPlayer = new MediaPlayer(sound);
    }

    public void play() {
        audioPlayer.play();
    }

    public void stop() {
        audioPlayer.stop();
    }

    public void pause() {
        audioPlayer.pause();
    }
}
