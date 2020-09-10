package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.CountedCompleter;

public class MainActivity extends AppCompatActivity {

    private int isiCount=0;
    private int data = 10;
    private int a=10;
    private TextView tampilCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tampilCount = (TextView) findViewById(R.id.textView);


    }

    public void reset(View view) {
        isiCount = 0;
        data = 10;
        Toast reset = Toast.makeText(this,"Data is Reseted",Toast.LENGTH_LONG);
        reset.show();
        if (tampilCount!=null){
            tampilCount.setText(Integer.toString(isiCount));
        }
    }

    public void count(View view) {
        isiCount++;
        if (isiCount==data){
            Toast count = Toast.makeText(this,"your count is "+data+"",Toast.LENGTH_LONG);
            count.show();
        }if (tampilCount!=null){
            tampilCount.setText(Integer.toString(isiCount));
        }
    }

    public void view(View view) {
        Toast isi = Toast.makeText(this,"your count is "+isiCount+"",Toast.LENGTH_LONG);
        isi.show();
    }
}