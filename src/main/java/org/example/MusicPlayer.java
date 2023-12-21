package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private OperaticMusic operaticMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, OperaticMusic operaticMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.operaticMusic = operaticMusic;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        } else if (genre == MusicGenre.ROCK) {
            System.out.println(rockMusic.getSongs().get(randomNumber));
        }
        else {
            System.out.println(operaticMusic.getSongs().get(randomNumber));
        }
    }
}
