package com.ctech.max.picturesearch;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

public class PictureFragment extends Fragment {

    private ImageButton mPhotoButton;
    private ImageView mPhotoView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_activity, container, false);

        mPhotoButton = v.findViewById(R.id.camera_button);
        mPhotoView = v.findViewById(R.id.camera_photo);

        return v;


    }
}
