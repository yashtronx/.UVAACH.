package org.tensorflow.lite.examples.detection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Dumb extends AppCompatActivity {

    ImageView image1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumb);

    }
    public void gta(View view) {
        Intent intent = new Intent(Dumb.this, Dumbb.class);
        startActivity(intent);
    }

    public void gta1(View view) {
        Intent intent = new Intent(Dumb.this, BChat.class);
        startActivity(intent);
    }
    public void onBackPressed() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
