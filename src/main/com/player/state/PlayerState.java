package com.player.state;

import com.player.context.MusicPlayer;

public interface PlayerState {
    void play(MusicPlayer player);
    void pause(MusicPlayer player);
    void stop(MusicPlayer player);
    void next(MusicPlayer player);
    void previous(MusicPlayer player);
}