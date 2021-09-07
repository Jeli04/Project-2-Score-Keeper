package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button team1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Team buttons
        Button changeGambit = (Button) findViewById(R.id.team1);
        Button changeSuperMassizeBlazes = (Button) findViewById(R.id.team2);
        Button changeAcend = (Button) findViewById(R.id.team3);
        Button changeG2 = (Button) findViewById(R.id.team4);
        Button changeSentinals = (Button) findViewById(R.id.team5);
        Button change100Thieves = (Button) findViewById(R.id.team6);
        Button changeEnvy = (Button) findViewById(R.id.team7);
        Button changeKRU = (Button) findViewById(R.id.team8);
        Button changeKEYD = (Button) findViewById(R.id.team9);
        Button changeLiberty = (Button) findViewById(R.id.team10);

        // Team info
        Button updateTeam1Score = (Button) findViewById(R.id.updateScore1);

        updateTeam1Score.setOnClickListener(new View.OnClickListener() {
            int team1score = 0;

            @Override
            public void onClick(View view) {
                TextView firstTeamScore = (TextView) findViewById(R.id.score1);
                team1score++;
                firstTeamScore.setText("Score: " + team1score);
            }
        });

        // Team button functions
        changeGambit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView firstTeam = (ImageView) findViewById(R.id.team1logo);
                firstTeam.setImageResource(R.drawable.gambit);
            }
        });

        changeSuperMassizeBlazes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView firstTeam = (ImageView) findViewById(R.id.team1logo);
                firstTeam.setImageResource(R.drawable.SuperMassizeBlaze);
            }
        });

        changeAcend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView firstTeam = (ImageView) findViewById(R.id.team1logo);
                firstTeam.setImageResource(R.drawable.Acend);
            }
        });

        changeG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView firstTeam = (ImageView) findViewById(R.id.team1logo);
                firstTeam.setImageResource(R.drawable.G2Esports);
            }
        });

        changeSentinals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView firstTeam = (ImageView) findViewById(R.id.team1logo);
                firstTeam.setImageResource(R.drawable.Sentinals);
            }
        });

        change100Thieves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView firstTeam = (ImageView) findViewById(R.id.team1logo);
                firstTeam.setImageResource(R.drawable.thieves100);
            }
        });

        changeEnvy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView firstTeam = (ImageView) findViewById(R.id.team1logo);
                firstTeam.setImageResource(R.drawable.Envy);
            }
        });

        changeKRU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView firstTeam = (ImageView) findViewById(R.id.team1logo);
                firstTeam.setImageResource(R.drawable.KRU);
            }
        });

        changeKEYD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView firstTeam = (ImageView) findViewById(R.id.team1logo);
                firstTeam.setImageResource(R.drawable.KeydStars);
            }
        });

        changeLiberty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView firstTeam = (ImageView) findViewById(R.id.team1logo);
                firstTeam.setImageResource(R.drawable.HavanLiberty);
            }
        });


    }
}