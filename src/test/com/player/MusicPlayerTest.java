package com.player;

import com.player.context.MusicPlayer;
import com.player.model.Music;
import com.player.state.PlayingState;
import com.player.state.PausedState;
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

    @Test
    void deveAdicionarMusicaNaPlaylist() {
        MusicPlayer player = new MusicPlayer();

        player.addMusic(new Music("Musica 1", "Artista", 120));

        assertNotNull(player.getCurrentMusic());
    }

    @Test
    void deveRetornarMusicaAtualCorreta() {
        MusicPlayer player = new MusicPlayer();

        player.addMusic(new Music("A", "Artista A", 100));
        player.addMusic(new Music("B", "Artista B", 200));

        assertEquals("A", player.getCurrentMusic().getTitle());
    }

    @Test
    void deveAvancarParaProximaMusica() {
        MusicPlayer player = new MusicPlayer();

        player.addMusic(new Music("A", "Artista A", 100));
        player.addMusic(new Music("B", "Artista B", 200));

        player.nextMusic();

        assertEquals("B", player.getCurrentMusic().getTitle());
    }

    @Test
    void deveVoltarParaMusicaAnterior() {
        MusicPlayer player = new MusicPlayer();

        player.addMusic(new Music("A", "Artista A", 100));
        player.addMusic(new Music("B", "Artista B", 200));

        player.nextMusic(); // vai pra B
        player.previousMusic(); // volta pra A

        assertEquals("A", player.getCurrentMusic().getTitle());
    }

    @Test
    void deveIniciarEmPlayingAoDarPlay() {
        MusicPlayer player = new MusicPlayer();

        player.setState(new StoppedState());
        player.play();

        assertTrue(player.getState() instanceof PlayingState);
    }

    @Test
    void deveIrParaPausedAoPausar() {
        MusicPlayer player = new MusicPlayer();

        player.setState(new PlayingState());
        player.pause();

        assertTrue(player.getState() instanceof PausedState);
    }
}