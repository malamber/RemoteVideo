package org.malamber.remotevideo;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by smw on 9/7/2017.
 */

public class Settings {
    public static String getLastSrc(Context c){
        return PreferenceManager.getDefaultSharedPreferences(c).getString("address","");
    }
    public static void setLastSrc(Context c, String addr){
        SharedPreferences.Editor e=PreferenceManager.getDefaultSharedPreferences(c).edit();
        e.putString("address",addr).apply();
    }
}
