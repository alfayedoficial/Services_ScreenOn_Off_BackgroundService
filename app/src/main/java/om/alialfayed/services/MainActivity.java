package om.alialfayed.services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private ScreenOnOffReceiver screenOnOffReceiver = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setTitle("dev2qa.com - Keep BroadcastReceiver Running After App Exit.");

        Intent backgroundService = new Intent(getApplicationContext(), ScreenOnOffBackgroundService.class);
        startService(backgroundService);

        Log.d(ScreenOnOffReceiver.SCREEN_TOGGLE_TAG, "Activity onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(ScreenOnOffReceiver.SCREEN_TOGGLE_TAG, "Activity onDestroy");
    }
}
