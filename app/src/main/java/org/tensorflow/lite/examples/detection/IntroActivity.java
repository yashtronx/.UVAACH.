package org.tensorflow.lite.examples.detection;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class IntroActivity extends AppCompatActivity {

    MediaPlayer helloo;

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        helloo = MediaPlayer.create(IntroActivity.this,R.raw.intro);
        helloo.start();


        viewPager = findViewById(R.id.viewPager);

        IntroAdapter adapter = new IntroAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        helloo.stop();
    }
}
