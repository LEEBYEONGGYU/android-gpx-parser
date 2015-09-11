package io.ticofab.androidgpxparser.parser.domain;

import java.util.List;

public class Gpx {
    private final List<Track> mTracks;

    public Gpx(Builder builder) {
        mTracks = builder.mTracks;
    }

    public List<Track> getTracks() {
        return mTracks;
    }

    public static class Builder {
        private List<Track> mTracks;

        public Builder setTracks(List<Track> tracks) {
            mTracks = tracks;
            return this;
        }

        public Gpx build() {
            return new Gpx(this);
        }
    }
}
