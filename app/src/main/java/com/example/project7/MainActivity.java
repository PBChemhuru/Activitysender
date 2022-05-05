package com.example.project7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private TextView mTextViewResult;
    String pass;
    EditText info;
        Button send;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Activity 1");
        setContentView(R.layout.activity_main);
        mTextViewResult = findViewById(R.id.text_view_result);
        info=findViewById(R.id.info);

        send=findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 =new Intent(MainActivity.this,MainActivity3.class);
                pass=info.getText().toString();
                intent2.putExtra("pass",pass);
                startActivity(intent2);
            }
        });
        Button buttonOpenActivity2 = findViewById(R.id.button_open_activity2);
        buttonOpenActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivityForResult(intent, 1);

            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String result = data.getStringExtra("result");
                mTextViewResult.setText("" + result);
            }
            if (resultCode == RESULT_CANCELED) {
                mTextViewResult.setText("Nothing selected");
            }
        }
    }
}