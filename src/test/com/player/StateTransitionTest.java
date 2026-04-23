package com.player;

import com.player.context.MusicPlayer;
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
}