package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static int getRandomIntegerBetweenRange(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

    int r = getRandomIntegerBetweenRange(0,10);
    public void check(View view){
        EditText number = (EditText) findViewById(R.id.number);
        Log.i("is working", "Yes");
        int a = (int) Float.parseFloat(number.getText().toString());        //string to float then to int

        Log.i("random", "r is " + r);

        if(a < r){
            Toast.makeText( this, "number is smaller", Toast.LENGTH_SHORT).show();
        } else if (a > r){
            Toast.makeText( this, "number is greater", Toast.LENGTH_SHORT).show();
        }   else {
            Toast.makeText( this, r + " Is the right number!!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
