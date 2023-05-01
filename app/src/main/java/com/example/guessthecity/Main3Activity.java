package com.example.guessthecity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    private Button button1, button2, button3;
    private ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String name = getIntent().getStringExtra("name");
        Toast.makeText(getApplicationContext(),"Congratulations, Round 2 !" + name, Toast.LENGTH_LONG).show();

        img1 = (ImageView) findViewById(R.id.imageView3);
        img1.setImageResource(R.drawable.telavivone);

        img2 = (ImageView) findViewById(R.id.imageView4);
        img2.setImageResource(R.drawable.telavivtwo);

        button1 = (Button)findViewById(R.id.button5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        button2 = (Button)findViewById(R.id.button6);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"WRONG try again  " + name, Toast.LENGTH_LONG).show();
            }
        });

        button3 = (Button)findViewById(R.id.button7);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"WRONG try again " + name, Toast.LENGTH_LONG).show();
            }
        });

    }
}
