package com.example.project7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Activity 3");
        setContentView(R.layout.activity_main3);
        TextView display1= findViewById(R.id.A1display);
        String pass = getIntent().getStringExtra("pass");
        display1.setText(pass);


    }
    public void closeActivity(View view){
        finish();
    }
}
