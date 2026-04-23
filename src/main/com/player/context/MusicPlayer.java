package com.player.context;

import com.player.model.Music;
import com.player.state.PlayerState;

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
        if (!playlist.isEmpty()) {
            currentIndex = (currentIndex + 1) % playlist.size();
        }
    }

    public void previousMusic() {
        if (!playlist.isEmpty()) {
            currentIndex = (currentIndex - 1 + playlist.size()) % playlist.size();
        }
    }

    public void play() {
        currentState.play(this);
    }

    public void pause() {
        currentState.pause(this);
    }

    public void stop() {
        currentState.stop(this);
    }

    public void next() {
        currentState.next(this);
    }

    public void previous() {
        currentState.previous(this);
    }
}