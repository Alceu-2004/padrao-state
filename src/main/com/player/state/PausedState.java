package com.player.state;

import com.player.context.MusicPlayer;

public class PausedState implements PlayerState {

    public void play(MusicPlayer player) {
        System.out.println("Retomando música");
        player.setState(new PlayingState());
    }

    public void pause(MusicPlayer player) {
        System.out.println("Já está pausado");
    }

    public void stop(MusicPlayer player) {
        System.out.println("Parando música");
        player.setState(new StoppedState());
    }

    public void next(MusicPlayer player) {
        player.nextMusic();
    }

    public void previous(MusicPlayer player) {
        player.previousMusic();
    }
}