package com.player;

import com.player.context.MusicPlayer;
import com.player.model.Music;
import com.player.state.StoppedState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MusicPlayerTest {

    @Test
    void fluxoBasico() {
        MusicPlayer player = new MusicPlayer();

        player.addMusic(new Music("Teste", "Artista", 100));
        player.setState(new StoppedState());

        player.play();
        assertNotNull(player.getState());

        player.pause();
        player.play();
        player.stop();
    }
}