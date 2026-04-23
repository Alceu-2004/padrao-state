package com.player.state;

import com.player.context.MusicPlayer;

public class StoppedState implements PlayerState {

    public void play(MusicPlayer player) {
        System.out.println("Iniciando música");
        player.setState(new PlayingState());
    }

    public void pause(MusicPlayer player) {
        System.out.println("Não pode pausar, está parado");
    }

    public void stop(MusicPlayer player) {
        System.out.println("Já está parado");
    }

    public void next(MusicPlayer player) {
        System.out.println("Não pode avançar, player parado");
    }

    public void previous(MusicPlayer player) {
        System.out.println("Não pode voltar, player parado");
    }
}