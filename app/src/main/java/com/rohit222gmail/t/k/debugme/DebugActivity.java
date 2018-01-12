package com.rohit222gmail.t.k.debugme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DebugActivity extends AppCompatActivity {

    TextView t1,t2;
    Button b1;
    ImageView im1;
    int a[] = {1,2,3};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);

        b1 = (Button) findViewById(R.id.make_me_happy);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMyMethod();
            }
        });
    }
    public void startMyMethod() {
        int sum = a[1]+a[2]+a[3];
        t1 = (TextView) findViewById(R.id.heading);
        t1.setText("Bugs Gone");
        t2 = (TextView) findViewById(R.id.paragraph);
        String dispText = "Good Work!\n We also Done Sum, \n 1+2+3 =  "+sum;
        t2.setText(dispText);
        im1 = (ImageView)findViewById(R.id.image_view);
        im1.setImageResource(R.drawable.happy);
    }
}
