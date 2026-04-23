package com.player.state;

import com.player.context.MusicPlayer;

public class BufferingState implements PlayerState {

    public void play(MusicPlayer player) {
        System.out.println("Carregando...");
        player.setState(new PlayingState());
    }

    public void pause(MusicPlayer player) {
        System.out.println("Aguarde carregamento");
    }

    public void stop(MusicPlayer player) {
        player.setState(new StoppedState());
    }

    public void next(MusicPlayer player) {}
    public void previous(MusicPlayer player) {}
}