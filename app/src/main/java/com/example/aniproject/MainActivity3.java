package com.example.aniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity3 extends AppCompatActivity {

    TextView favor;
    Button surprise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        favor = findViewById(R.id.favor);
        surprise = findViewById(R.id.surprise);

        surprise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String video = "https://www.youtube.com/watch?v=z3U0udLH974";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(video));
                startActivity(intent);
            }
        });
    }
}