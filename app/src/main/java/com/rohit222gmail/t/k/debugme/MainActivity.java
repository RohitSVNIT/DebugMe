package com.rohit222gmail.t.k.debugme;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset = (Button)findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.main_layout);
                mainLayout.setBackgroundColor(Color.parseColor("#fafafa"));
            }
        });
    }

    public void changeBack(View view) {
        RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.main_layout);
        switch (view.getId()) {
            case R.id.red:
                mainLayout.setBackgroundColor(Color.parseColor("#ff0000"));
                break;
            case R.id.green:
                mainLayout.setBackgroundColor(Color.parseColor("#00ff00"));
                break;
            case R.id.blue:
                mainLayout.setBackgroundColor(Color.parseColor("#0000ff"));
                break;
        }
    }

    public void debugMe(View view) {
        EditText editText = (EditText) findViewById(R.id.passcode);
        String code = editText.getText().toString();
        Intent intent = new Intent(this,DebugActivity.class);
        if(code.equals(getString(R.string.passCode))) {
            startActivity(intent);
        }
    }
}
