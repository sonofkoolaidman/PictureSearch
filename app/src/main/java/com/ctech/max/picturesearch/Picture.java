package com.ctech.max.picturesearch;

import android.content.Context;

import java.io.File;
import java.util.UUID;

public class Picture {

    private Context mContext;

    private static Picture sPicture;

    public UUID getId() {
        return mId;
    }

    private UUID mId; // the photo's unique id

    public String getPictureFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }

    public static Picture get(Context context) {
        if (sPicture == null) {
            sPicture = new Picture(context);
        }
        return sPicture;
    }

    private Picture(Context context) {
        // the context is where the database is stored while the app is running
        mContext = context.getApplicationContext();
    }

    // get a link to the file's location
    public File getPictureFile(Picture picture) {
        File filesDir = mContext.getFilesDir();
        return new File(filesDir, picture.getPictureFilename());
    }
}
