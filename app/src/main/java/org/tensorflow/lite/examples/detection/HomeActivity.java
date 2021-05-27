package org.tensorflow.lite.examples.detection;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    MediaPlayer helloo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        helloo = MediaPlayer.create(HomeActivity.this, R.raw.mainn);
        helloo.start();

    }
    public void gta(View view) {
        Intent intent = new Intent(HomeActivity.this, Deaf.class);
        startActivity(intent);
    }

    public void gta1(View view) {
        Intent intent = new Intent(HomeActivity.this, Dumb.class);
        startActivity(intent);
    }

    public void gta2(View view) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.capstone.objdetection");
        if (launchIntent != null) {
            startActivity(launchIntent);//null pointer check in case package name was not found
        }
    }
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        helloo.stop();
    }

    public void onBackPressed() {
        finishAffinity();
        finish();
    }

}
