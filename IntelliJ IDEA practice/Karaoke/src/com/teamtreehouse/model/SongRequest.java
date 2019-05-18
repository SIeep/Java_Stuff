package com.teamtreehouse.model;

import java.util.Objects;

public class SongRequest {
    private Song mSong;
    private String mSingerName;

    public SongRequest(String singerName, Song song) {
        mSingerName = singerName;
        mSong = song;
    }

    public Song getSong() {
        return mSong;
    }

    public void setSong(Song song) {
        mSong = song;
    }

    public String getSingerName() {
        return mSingerName;
    }

    public void setSingerName(String singerName) {
        mSingerName = singerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SongRequest that = (SongRequest) o;
        return mSong.equals(that.mSong) &&
                mSingerName.equals(that.mSingerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mSong, mSingerName);
    }

    @Override
    public String toString() {
        return "SongRequest{" +
                "mSong=" + mSong +
                ", mSingerName='" + mSingerName + '\'' +
                '}';
    }
}
