package com.example.foliyoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    TextView pass,gst,pass1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        pass = findViewById(R.id.editText8);
        pass1 = findViewById(R.id.editText6);
        gst = findViewById(R.id.editText5);
    }

    public void personal(View view)
    {
        gst.setVisibility(View.INVISIBLE);
        pass.setVisibility(View.INVISIBLE);
        pass1.setVisibility(View.VISIBLE);
    }

    public void business(View view)
    {

        gst.setVisibility(View.VISIBLE);
        pass.setVisibility(View.VISIBLE);
        pass1.setVisibility(View.INVISIBLE);
    }
}
