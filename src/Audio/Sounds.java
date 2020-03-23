package Audio;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author reece
 */
public class Sounds {

    //Create a new input stream for audio
    AudioInputStream audioInputStream;
    //Clip is to use .wav files and pay audio.
    Clip clip;
    //This boolean must ALWAYS be false when this is first loaded, so shouldn't be modified
    boolean loaded = false;

    public void play(boolean active) {

        //If the load value is false, the load the alarm wave file, otherwise it's already loaded.
        if (!loaded) {
            load();
        }
        clip.setFramePosition(0);
        if (active) {
            clip.start();
        } else {
            clip.stop();
        }
    }

    private void load() {
        try {
            BufferedInputStream myStream = new BufferedInputStream(getClass().getResourceAsStream("Reels.wav"));
            audioInputStream = AudioSystem.getAudioInputStream(myStream);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            loaded = true;
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            System.out.println("Something went wrong, here's what happened:\n" + ex);
        }
    }
}
