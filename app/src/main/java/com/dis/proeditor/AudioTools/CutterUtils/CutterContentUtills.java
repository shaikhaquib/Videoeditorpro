package com.dis.proeditor.AudioTools.CutterUtils;

import android.database.Cursor;

public class CutterContentUtills {
    public static String getLong(Cursor cursor) {
        return String.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
    }
}
