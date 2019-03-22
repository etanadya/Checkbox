package com.example.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox bandung, bogor, banjarmasin, bontang;
    TextView outputNic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bandung = findViewById(R.id.check1);
        bogor = findViewById(R.id.check2);
        banjarmasin = findViewById(R.id.check3);
        bontang = findViewById(R.id.check4);
        outputNic = findViewById(R.id.output);
    }

    public void nilai(View view) {
        if (bandung.isChecked() &&
                bogor.isChecked() &&
                banjarmasin.isChecked() &&
                bontang.isChecked()) {
            outputNic.setText("10");

        } else if (bandung.isChecked() &&
                banjarmasin.isChecked() &&
                bogor.isChecked()) {
            outputNic.setText("15");

        } else if (bandung.isChecked() &&
                banjarmasin.isChecked() &&
                bontang.isChecked()) {
            outputNic.setText("15");

        } else if (banjarmasin.isChecked() &&
                bogor.isChecked() &&
                bontang.isChecked()) {
            outputNic.setText("0");

        } else if (banjarmasin.isChecked() &&
                bontang.isChecked()) {
            outputNic.setText("20");

        } else if (bandung.isChecked() &&
                bogor.isChecked() &&
                bontang.isChecked()) {
            outputNic.setText("0");

        } else if (bandung.isChecked() &&
                bogor.isChecked()) {
            outputNic.setText("5");

        } else if (bandung.isChecked() &&
                bontang.isChecked()) {
            outputNic.setText("5");

        } else if (bogor.isChecked() &&
                banjarmasin.isChecked()) {
            outputNic.setText("5");

        } else if (bontang.isChecked() &&
                bogor.isChecked()) {
            outputNic.setText("5");

        } else if (bandung.isChecked() &&
                banjarmasin.isChecked()) {
            outputNic.setText("0");

        } else if (bandung.isChecked()) {
            outputNic.setText("10");

        } else if (banjarmasin.isChecked()) {
            outputNic.setText("10");

        } else if (bogor.isChecked()) {
            outputNic.setText("-5");

        } else if (bontang.isChecked()) {
            outputNic.setText("-5");

        } else {
            outputNic.setText("0");
        }
    }

}
