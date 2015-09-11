package io.ticofab.androidgpxparser.parser.domain;

import java.util.List;

public class Track {
    private final List<TrackSegment> mTrackSegments;

    public Track(Builder builder) {
        mTrackSegments = builder.mTrackSegments;
    }

    public List<TrackSegment> getTrackSegments() {
        return mTrackSegments;
    }

    public static class Builder {
        private List<TrackSegment> mTrackSegments;

        public Builder setTrackSegments(List<TrackSegment> trackSegments) {
            mTrackSegments = trackSegments;
            return this;
        }

        public Track build() {
            return new Track(this);
        }
    }
}
