package soundsystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yangyu on 15/8/17.
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

//    @Autowired
//    public void setCompactDisc(CompactDisc compactDisc) {
//        this.cd = compactDisc;
//    }

    public void play() {
        cd.play();
    }
}
