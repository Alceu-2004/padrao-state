package com.player;

import com.player.context.MusicPlayer;
import com.player.model.Music;
import com.player.state.StoppedState;

public class Main {

    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();

        player.addMusic(new Music("Blinding Lights", "The Weeknd", 200));
        player.addMusic(new Music("Shape of You", "Ed Sheeran", 240));
        player.addMusic(new Music("As It Was", "Harry Styles", 170));

        player.setState(new StoppedState());

        player.play();
        player.pause();
        player.play();
        player.next();
        player.stop();
    }
}