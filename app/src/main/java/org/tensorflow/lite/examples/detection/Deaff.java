package org.tensorflow.lite.examples.detection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Deaff extends AppCompatActivity {

    Button btnA,btnB,btnC,btnD,btnE,btnF,btnG,btnH,btnI,btnJ,btnK,btnL,btnM,btnN,btnO,btnP,btnQ,btnR,btnS,btnT,btnU,btnV,btnW,btnX,btnY,btnZ,clear,btnspace,scan;
    LinearLayout layout;
    EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deaff);

        btnA = findViewById(R.id.btn);
        btnB = findViewById(R.id.btn1);
        btnC = findViewById(R.id.btn2);
        btnD = findViewById(R.id.btn3);
        btnE = findViewById(R.id.btn4);
        btnF = findViewById(R.id.btn5);
        btnG = findViewById(R.id.btn6);
        btnH = findViewById(R.id.btn7);
        btnI = findViewById(R.id.btn8);
        btnJ = findViewById(R.id.btn9);
        btnK = findViewById(R.id.btn10);
        btnL = findViewById(R.id.btn11);
        btnM = findViewById(R.id.btn12);
        btnN = findViewById(R.id.btn13);
        btnO = findViewById(R.id.btn14);
        btnP = findViewById(R.id.btn15);
        btnQ = findViewById(R.id.btn16);
        btnR = findViewById(R.id.btn17);
        btnS = findViewById(R.id.btn18);
        btnT = findViewById(R.id.btn19);
        btnU = findViewById(R.id.btn20);
        btnV = findViewById(R.id.btn21);
        btnW = findViewById(R.id.btn22);
        btnX = findViewById(R.id.btn23);
        btnY = findViewById(R.id.btn24);
        btnZ = findViewById(R.id.btn25);
        btnspace = findViewById(R.id.btn26);
        scan = findViewById(R.id.btn27);
        layout = findViewById(R.id.layout);
        txt = findViewById(R.id.txt);
        clear = findViewById(R.id.clear);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alpha);


                addView(imageView,300,300);
                txt.setText(txt.getText() + "A");
            }
        });
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphab);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "B");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphac);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "C");
            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphad);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "D");
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphae);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "E");
            }
        });
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphaf);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "F");
            }
        });
        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphag);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "G");
            }
        });
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphah);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "H");
            }
        });
        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphai);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "I");
            }
        });
        btnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphaj);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "J");
            }
        });
        btnK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphak);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "K");
            }
        });
        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphal);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "L");
            }
        });
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alpham);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "M");
            }
        });
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphan);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "N");
            }
        });
        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphao);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "O");
            }
        });
        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphap);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "P");
            }
        });
        btnQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphaq);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "Q");
            }
        });
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphar);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "R");
            }
        });
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphas);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "S");
            }
        });
        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphat);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "T");
            }
        });
        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphau);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "U");
            }
        });
        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphav);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "V");
            }
        });
        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphaw);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "W");
            }
        });
        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphax);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "X");
            }
        });
        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphay);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "Y");
            }
        });
        btnZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.alphaz);

                addView(imageView,300,300);
                txt.setText(txt.getText() + "Z");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Deaff.this, Deaff.class);
                startActivity(intent);
            }
        });
        btnspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = new ImageView(Deaff.this);
                imageView.setImageResource(R.drawable.aspace);

                addView(imageView,300,300);
                txt.setText(txt.getText() + " ");
            }
        });
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Deaff.this, DetectorActivity.class);
                startActivity(intent);
            }
        });

    }

    private void addView(ImageView imageView, int width, int height) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width,height);
        layoutParams.setMargins(0,10,0,10);

        imageView.setLayoutParams(layoutParams);
        layout.addView(imageView);
    }
    public void onBackPressed() {
        Intent intent = new Intent(this, Deaf.class);
        startActivity(intent);
    }
}
