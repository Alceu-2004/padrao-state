package com.player;

import com.player.context.MusicPlayer;
import com.player.state.PausedState;
import com.player.state.PlayingState;
import com.player.state.StoppedState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StateTransitionTest {

    @Test
    void naoDevePausarParado() {
        MusicPlayer player = new MusicPlayer();
        player.setState(new StoppedState());

        player.pause();

        assertTrue(player.getState() instanceof StoppedState);
    }

    @Test
    void deveIrParaPlayingAoDarPlay() {
        MusicPlayer player = new MusicPlayer();
        player.setState(new StoppedState());

        player.play();

        assertTrue(player.getState() instanceof PlayingState);
    }

    @Test
    void devePausarQuandoEstiverTocando() {
        MusicPlayer player = new MusicPlayer();
        player.setState(new PlayingState());

        player.pause();

        assertTrue(player.getState() instanceof PausedState);
    }


}