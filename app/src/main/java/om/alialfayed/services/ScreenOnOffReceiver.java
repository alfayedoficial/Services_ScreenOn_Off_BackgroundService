package om.alialfayed.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do :
 * Date 4/3/2020 - 11:09 PM
 */
public class ScreenOnOffReceiver extends BroadcastReceiver {

    final static String SCREEN_TOGGLE_TAG = "SCREEN_TOGGLE_TAG";

    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();
        if (Intent.ACTION_SCREEN_OFF.equals(action)) {
            Log.d(SCREEN_TOGGLE_TAG, "Screen is turn off.");
        } else if (Intent.ACTION_SCREEN_ON.equals(action)) {
            Log.d(SCREEN_TOGGLE_TAG, "Screen is turn on.");
        }

    }
}
