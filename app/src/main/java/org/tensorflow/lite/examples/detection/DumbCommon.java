package org.tensorflow.lite.examples.detection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DumbCommon extends AppCompatActivity implements View.OnClickListener{


    Button btn,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31;

    EditText txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumb_common);

        btn = (Button)findViewById(R.id.btn);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn10 = (Button)findViewById(R.id.btn10);
        btn11 = (Button)findViewById(R.id.btn11);
        btn12 = (Button)findViewById(R.id.btn12);
        btn13 = (Button)findViewById(R.id.btn13);
        btn14 = (Button)findViewById(R.id.btn14);
        btn15 = (Button)findViewById(R.id.btn15);
        btn16 = (Button)findViewById(R.id.btn16);
        btn17 = (Button)findViewById(R.id.btn17);
        btn18 = (Button)findViewById(R.id.btn18);
        btn19 = (Button)findViewById(R.id.btn19);
        btn20 = (Button)findViewById(R.id.btn20);
        btn21 = (Button)findViewById(R.id.btn21);
        btn22 = (Button)findViewById(R.id.btn22);
        btn23 = (Button)findViewById(R.id.btn23);
        btn24 = (Button)findViewById(R.id.btn24);
        btn25 = (Button)findViewById(R.id.btn25);
        btn26 = (Button)findViewById(R.id.btn26);
        btn27 = (Button)findViewById(R.id.btn27);
        btn28 = (Button)findViewById(R.id.btn28);
        btn29 = (Button)findViewById(R.id.btn29);
        btn30 = (Button)findViewById(R.id.btn30);
        btn31 = (Button)findViewById(R.id.btn31);
        txt = (EditText) findViewById(R.id.txt);

        btn.setOnClickListener((View.OnClickListener) this);
        btn1.setOnClickListener((View.OnClickListener) this);
        btn2.setOnClickListener((View.OnClickListener) this);
        btn3.setOnClickListener((View.OnClickListener) this);
        btn4.setOnClickListener((View.OnClickListener) this);
        btn5.setOnClickListener((View.OnClickListener) this);
        btn6.setOnClickListener((View.OnClickListener) this);
        btn7.setOnClickListener((View.OnClickListener) this);
        btn8.setOnClickListener((View.OnClickListener) this);
        btn9.setOnClickListener((View.OnClickListener) this);
        btn10.setOnClickListener((View.OnClickListener) this);
        btn11.setOnClickListener((View.OnClickListener) this);
        btn12.setOnClickListener((View.OnClickListener) this);
        btn13.setOnClickListener((View.OnClickListener) this);
        btn14.setOnClickListener((View.OnClickListener) this);
        btn15.setOnClickListener((View.OnClickListener) this);
        btn16.setOnClickListener((View.OnClickListener) this);
        btn17.setOnClickListener((View.OnClickListener) this);
        btn18.setOnClickListener((View.OnClickListener) this);
        btn19.setOnClickListener((View.OnClickListener) this);
        btn20.setOnClickListener((View.OnClickListener) this);
        btn21.setOnClickListener((View.OnClickListener) this);
        btn22.setOnClickListener((View.OnClickListener) this);
        btn23.setOnClickListener((View.OnClickListener) this);
        btn24.setOnClickListener((View.OnClickListener) this);
        btn25.setOnClickListener((View.OnClickListener) this);
        btn26.setOnClickListener((View.OnClickListener) this);
        btn27.setOnClickListener((View.OnClickListener) this);
        btn28.setOnClickListener((View.OnClickListener) this);
        btn29.setOnClickListener((View.OnClickListener) this);
        btn30.setOnClickListener((View.OnClickListener) this);
        btn31.setOnClickListener((View.OnClickListener) this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn:
                txt.setText(txt.getText() + "Monday ");
                break;
            case R.id.btn1:
                txt.setText(txt.getText() + "Tuesday ");
                break;
            case R.id.btn2:
                txt.setText(txt.getText() + "Wednesday ");
                break;
            case R.id.btn3:
                txt.setText(txt.getText() + "Thursday ");
                break;
            case R.id.btn4:
                txt.setText(txt.getText() + "Friday ");
                break;
            case R.id.btn5:
                txt.setText(txt.getText() + "Saturday ");
                break;
            case R.id.btn6:
                txt.setText(txt.getText() + "Sunday ");
                break;
            case R.id.btn7:
                txt.setText(txt.getText() + "1");
                break;
            case R.id.btn8:
                txt.setText(txt.getText() + "2");
                break;
            case R.id.btn9:
                txt.setText(txt.getText() + "3");
                break;
            case R.id.btn10:
                txt.setText(txt.getText() + "4");
                break;
            case R.id.btn11:
                txt.setText(txt.getText() + "5");
                break;
            case R.id.btn12:
                txt.setText(txt.getText() + "6");
                break;
            case R.id.btn13:
                txt.setText(txt.getText() + "7");
                break;
            case R.id.btn14:
                txt.setText(txt.getText() + "8");
                break;
            case R.id.btn15:
                txt.setText(txt.getText() + "9");
                break;
            case R.id.btn16:
                txt.setText(txt.getText() + "0");
                break;
            case R.id.btn17:
                txt.setText("");
                break;
            case R.id.btn18:
                txt.setText(txt.getText() + "Hello ");
                break;
            case R.id.btn19:
                txt.setText(txt.getText() + "Good Bye ");
                break;
            case R.id.btn20:
                txt.setText(txt.getText() + "Ok ");
                break;
            case R.id.btn21:
                txt.setText(txt.getText() + "I am Happy ");
                break;
            case R.id.btn22:
                txt.setText(txt.getText() + "to meet ");
                break;
            case R.id.btn23:
                txt.setText(txt.getText() + "You ");
                break;
            case R.id.btn24:
                txt.setText(txt.getText() + "Sorry ");
                break;
            case R.id.btn25:
                txt.setText(txt.getText() + "Please ");
                break;
            case R.id.btn26:
                txt.setText(txt.getText() + "Thank You ");
                break;
            case R.id.btn27:
                txt.setText(txt.getText() + "See ");
                break;
            case R.id.btn28:
                txt.setText(txt.getText() + "You ");
                break;
            case R.id.btn29:
                txt.setText(txt.getText() + "Later ");
                break;
            case R.id.btn30:
                txt.setText(txt.getText() + " ");
                break;
            case R.id.btn31:
                Intent intent = new Intent(DumbCommon.this, DetectorActivity.class);
                startActivity(intent);
                break;

        }

    }

}
