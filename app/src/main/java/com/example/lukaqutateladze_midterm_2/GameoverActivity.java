package com.example.lukaqutateladze_midterm_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameoverActivity extends AppCompatActivity {
    private String score;
    private TextView Score;
    Button restart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover);

        Bundle extras = getIntent().getExtras();
        score = extras.getString("score");
        Score = findViewById(R.id.gameoverscorefinal);
        Score.setText(score+"");

        restart = (Button) findViewById(R.id.restart);
        restart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                newActivity();
            }

        });
    }

    public void newActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
