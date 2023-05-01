package com.example.guessthecity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextWatcher;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    private TextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        String name = getIntent().getStringExtra("name");
        Toast.makeText(getApplicationContext(),"Congratulations, you WON !" + name, Toast.LENGTH_LONG).show();

        text1 = (TextView)findViewById(R.id.textView15);
        text1.setText(name);



    }
}
