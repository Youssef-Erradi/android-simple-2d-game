package com.example;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Background {
    Integer x=0, y=0;
    Bitmap background;

    public Background(Integer screenX, Integer screenY, Resources resources) {
        background = BitmapFactory.decodeResource(resources, R.drawable.background);

        background = Bitmap.createScaledBitmap(background, screenX, screenY, false);
    }
}
