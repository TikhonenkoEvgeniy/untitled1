package org.example;

import java.util.List;

public class MusicPlayer {
    private List<Music> listMusic;
    private String name;
    private int volume;

    public MusicPlayer(List<Music> listMusic) {
        this.listMusic = listMusic;
    }

    public MusicPlayer() {

    }

    public void doMyInit() {
        System.out.println("doing my initialisation");
    }

    public void doMyDestroy() {
        System.out.println("doing my destroying");
    }

    public void setListMusic(List<Music> listMusic) {
        this.listMusic = listMusic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        for (Music music :listMusic) {
            System.out.println("playing: " + music.getSong());
        }
    }
}
