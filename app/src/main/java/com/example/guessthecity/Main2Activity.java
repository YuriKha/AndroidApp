package com.example.guessthecity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private Button button1, button2, button3;
    private ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String name = getIntent().getStringExtra("name");
        Toast.makeText(getApplicationContext(),"Round 1 !" + name, Toast.LENGTH_LONG).show();

        img1 = (ImageView) findViewById(R.id.imageView1);
        img1.setImageResource(R.drawable.jerusalemone);

        img2 = (ImageView) findViewById(R.id.imageView2);
        img2.setImageResource(R.drawable.jerusalemtwo);

        button1 = (Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"WRONG try again " + name, Toast.LENGTH_LONG).show();
            }
        });

        button2 = (Button)findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"WRONG try again  " + name, Toast.LENGTH_LONG).show();
            }
        });

        button3 = (Button)findViewById(R.id.button4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

    }
}
