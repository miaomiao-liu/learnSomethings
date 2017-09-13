package cn.edu.swpu.cins.learnSomethings.spring.soundsystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * Created by miaomiao on 17-9-11.
 */
public class CDPlayer{
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    public void play(){
        cd.play();
    }
}
