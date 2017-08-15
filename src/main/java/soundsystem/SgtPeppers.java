package soundsystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yangyu on 15/8/17.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hears Club Band";
    private String artist = "The Beatles";


    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
