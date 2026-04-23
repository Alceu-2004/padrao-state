package com.player.model;

public class Music {

    private String title;
    private String artist;
    private int duration;

    public Music(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getDuration() { return duration; }

    @Override
    public String toString() {
        return title + " - " + artist;
    }
}