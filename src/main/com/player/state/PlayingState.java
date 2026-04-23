package com.player.state;

import com.player.context.MusicPlayer;

public class PlayingState implements PlayerState {

    public void play(MusicPlayer player) {
        System.out.println("Já está tocando");
    }

    public void pause(MusicPlayer player) {
        System.out.println("Pausando música");
        player.setState(new PausedState());
    }

    public void stop(MusicPlayer player) {
        System.out.println("Parando música");
        player.setState(new StoppedState());
    }

    public void next(MusicPlayer player) {
        player.nextMusic();
        System.out.println("Próxima música: " + player.getCurrentMusic());
    }

    public void previous(MusicPlayer player) {
        player.previousMusic();
        System.out.println("Música anterior: " + player.getCurrentMusic());
    }
}