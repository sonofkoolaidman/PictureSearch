package com.ctech.max.picturesearch;

import java.util.UUID;

public class Picture {

    public UUID getId() {
        return mId;
    }

    private UUID mId; // the photo's unique id

    public String getPictureFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }
}
