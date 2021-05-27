package org.tensorflow.lite.examples.detection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Dumbb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumbb);
    }

    public void gta(View view) {
        Intent intent = new Intent(Dumbb.this, Dumbkey.class);
        startActivity(intent);
    }

    public void gta1(View view) {
        Intent intent = new Intent(Dumbb.this, DumbCommon.class);
        startActivity(intent);
    }
}
