package com.example.jesse.button_counter_taylor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView value;
    int counter = 0;
    @Override
    protected void onSaveInstanceState (Bundle outState) {
        outState.putInt("num", Integer.valueOf(value.getText().toString()));
        super.onSaveInstanceState(outState);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        counter = (savedInstanceState.getInt("num"));
        value.setText(Integer.toString(counter));
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value = findViewById(R.id.number);
    }
    public void counterUp(View view){
        counter++;
        value.setText(Integer.toString(counter));
    }
    public void counterDown(View view){
        counter--;
        value.setText(Integer.toString(counter));
    }
    public void reset(View view){
        counter = 0;
        value.setText(Integer.toString(counter));
    }
}
