package com.player;

import com.player.context.MusicPlayer;
import com.player.model.Music;
import com.player.state.StoppedState;

public class Main {

    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();

        player.addMusic(new Music("Musica 1", "Artista A", 180));
        player.addMusic(new Music("Musica 2", "Artista B", 200));

        player.setState(new StoppedState());

        player.play();
        player.pause();
        player.play();
        player.next();
        player.stop();
    }
}