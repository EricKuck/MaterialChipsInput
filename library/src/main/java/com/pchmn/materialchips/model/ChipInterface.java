package com.pchmn.materialchips.model;


import android.graphics.drawable.Drawable;
import android.net.Uri;

public interface ChipInterface {

    Object getId();
    Uri getAvatarUri();
    Drawable getAvatarDrawable();
    CharSequence getLabel();
    CharSequence getInfo();
}
