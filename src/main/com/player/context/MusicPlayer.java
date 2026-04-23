package com.player.context;

import br.com.player.model.Music;
import br.com.player.state.PlayerState;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private PlayerState currentState;
    private List<Music> playlist = new ArrayList<>();
    private int currentIndex = 0;

    public void setState(PlayerState state) {
        this.currentState = state;
    }

    public PlayerState getState() {
        return currentState;
    }

    public void addMusic(Music music) {
        playlist.add(music);
    }

    public Music getCurrentMusic() {
        if (playlist.isEmpty()) return null;
        return playlist.get(currentIndex);
    }

    public void nextMusic() {
        currentIndex = (currentIndex + 1) % playlist.size();
    }

    public void previousMusic() {
        currentIndex = (currentIndex - 1 + playlist.size()) % playlist.size();
    }
}