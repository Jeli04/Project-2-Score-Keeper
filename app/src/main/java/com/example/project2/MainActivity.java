package com.example.project2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Boolean select1 = false;
    Boolean select2 = false;

    Button team1;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Button> teams = new ArrayList<Button>();
        ArrayList<Drawable> teamImages = new ArrayList<Drawable>();

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
        Button changeVisionStrikers = (Button) findViewById(R.id.team11);
        Button changeF4Q = (Button) findViewById(R.id.team12);
        Button changeZetaDivision = (Button) findViewById(R.id.team13);
        Button changeCrazyRaccoons = (Button) findViewById(R.id.team14);
        Button changePaperRax = (Button) findViewById(R.id.team15);




        teams.add(changeGambit);
        teamImages.add(getResources().getDrawable(R.drawable.gambit));
        teams.add(changeSuperMassizeBlazes);
        teamImages.add(getResources().getDrawable(R.drawable.supermassiveblazes));
        teams.add(changeAcend);
        teamImages.add(getResources().getDrawable(R.drawable.acend));
        teams.add(changeG2);
        teamImages.add(getResources().getDrawable(R.drawable.g2esports));
        teams.add(changeSentinals);
        teamImages.add(getResources().getDrawable(R.drawable.sentinals));
        teams.add(change100Thieves);
        teamImages.add(getResources().getDrawable(R.drawable.thieves100));
        teams.add(changeEnvy);
        teamImages.add(getResources().getDrawable(R.drawable.envy));
        teams.add(changeKRU);
        teamImages.add(getResources().getDrawable(R.drawable.kru));
        teams.add(changeKEYD);
        teamImages.add(getResources().getDrawable(R.drawable.keyd));
        teams.add(changeLiberty);
        teamImages.add(getResources().getDrawable(R.drawable.havanliberty));
        teams.add(changeVisionStrikers);
        teamImages.add(getResources().getDrawable(R.drawable.visionstrikers));
        teams.add(changeF4Q);
        teamImages.add(getResources().getDrawable(R.drawable.f4q));
        teams.add(changeZetaDivision);
        teamImages.add(getResources().getDrawable(R.drawable.zetadivision));
        teams.add(changeCrazyRaccoons);
        teamImages.add(getResources().getDrawable(R.drawable.crazyraccoon));
        teams.add(changePaperRax);
        teamImages.add(getResources().getDrawable(R.drawable.paperrex));


        // Team info
        Button updateTeam1Score = (Button) findViewById(R.id.updateScore1);
        Button updateTeam2Score = (Button) findViewById(R.id.updateScore2);
        Button selectTeam1 = (Button) findViewById(R.id.team1logo);
        Button selectTeam2 = (Button) findViewById(R.id.team2logo);


        updateTeam1Score.setOnClickListener(new View.OnClickListener() {
            int team1score = 0;

            @Override
            public void onClick(View view) {
                TextView firstTeamScore = (TextView) findViewById(R.id.score1);
                team1score++;
                firstTeamScore.setText("Score: " + team1score);
            }
        });

        selectTeam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select1 = true;
            }
        });

        updateTeam2Score.setOnClickListener(new View.OnClickListener() {
            int team2score = 0;

            @Override
            public void onClick(View view) {
                TextView firstTeamScore = (TextView) findViewById(R.id.score2);
                team2score++;
                firstTeamScore.setText("Score: " + team2score);
            }
        });

        selectTeam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select2 = true;
            }
        });


        for (int i = 0; i < teams.size(); i++) {
            Drawable teamLogo = teamImages.get(i);
            teams.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(select1 == true){
                        Button firstTeam = (Button) findViewById(R.id.team1logo);
                        firstTeam.setBackground(teamLogo);
                        select1 = false;
                    }

                    if(select2 == true){
                        Button secondTeam = (Button) findViewById(R.id.team2logo);
                        secondTeam.setBackground(teamLogo);
                        select2 = false;
                    }
                }
            });
        }
    }
}