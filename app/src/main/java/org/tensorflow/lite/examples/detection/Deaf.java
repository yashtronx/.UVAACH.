package org.tensorflow.lite.examples.detection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Deaf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deaf);
    }

    public void gta(View view) {
        Intent intent = new Intent(Deaf.this, Deaff.class);
        startActivity(intent);
    }

    public void gta1(View view) {
        Intent intent = new Intent(Deaf.this, BChat.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
