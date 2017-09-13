package cn.edu.swpu.cins.learnSomethings.spring.soundsystem;

import org.junit.internal.ComparisonCriteria;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by miaomiao on 17-9-10.
 */
@Component   //可以用@Name 注解代替，但有细微差别（不推荐使用）
public class SgtPeppers implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing" + title + " by " + artist);

        for (String track : tracks){
            System.out.println("-track: "+track);
        }
    }
}
