package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by yangyu on 15/8/17.
 */

@Configuration
@Import(CDConfig.class)
//@ComponentScan
public class CDPlayerConfig {

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        CDPlayer cdPlayer = new CDPlayer(compactDisc);
        return cdPlayer;
    }
}
