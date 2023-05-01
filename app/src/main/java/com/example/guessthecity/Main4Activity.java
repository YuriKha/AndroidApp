package com.example.guessthecity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    private Button button1, button2, button3;
    private ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        String name = getIntent().getStringExtra("name");
        Toast.makeText(getApplicationContext(),"Congratulations, Round 3 !" + name, Toast.LENGTH_LONG).show();

        img1 = (ImageView) findViewById(R.id.imageView5);
        img1.setImageResource(R.drawable.haifaone);

        img2 = (ImageView) findViewById(R.id.imageView6);
        img2.setImageResource(R.drawable.haifatwo);

        button1 = (Button)findViewById(R.id.button8);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"WRONG try again  " + name, Toast.LENGTH_LONG).show();
            }
        });

        button2 = (Button)findViewById(R.id.button9);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main4Activity.this,Main5Activity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        button3 = (Button)findViewById(R.id.button10);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"WRONG try again " + name, Toast.LENGTH_LONG).show();
            }
        });
    }
}
