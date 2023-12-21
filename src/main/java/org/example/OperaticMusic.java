package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OperaticMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Some Operatic music one");
        songs.add("Some Operatic music two");
        songs.add("Some Operatic music three");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
