package io.fdezquinterogithub.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

    //Declaration of Turn Text
    TextView player_turn;
    //Declaration of Images
    ImageView img11, img12, img13, img21, img22, img23, img31, img32, img33;
    //Declaration of Grid
    GridLayout grid_test;
    //Declaration of Reset Button
    Button reset_button;
    //Declaration of Players Matrices
    boolean p1Mat[][] = new boolean[3][3];
    boolean p2Mat[][] = new boolean[3][3];

    int[] i = new int[1];
    int[] j = new int[1];

    int count=0;

    boolean[] turn1 = {true};
    boolean[] lock11 = {false};
    boolean[] lock12 = {false};
    boolean[] lock13 = {false};
    boolean[] lock21 = {false};
    boolean[] lock22 = {false};
    boolean[] lock23 = {false};
    boolean[] lock31 = {false};
    boolean[] lock32 = {false};
    boolean[] lock33 = {false};
    boolean[] win = {false};

    //VICTORY CONDITION
    //There are 8 possible victory conditions:
    public boolean victoryAchieved(boolean Mat[][], boolean Turn[]){
        boolean win=false;
        if (Mat[0][0] && Mat[0][1] && Mat[0][2] ||
            Mat[1][0] && Mat[1][1] && Mat[1][2] ||
            Mat[2][0] && Mat[2][1] && Mat[2][2] ||
            Mat[0][0] && Mat[1][0] && Mat[2][0] ||
            Mat[0][1] && Mat[1][1] && Mat[2][1] ||
            Mat[0][2] && Mat[1][2] && Mat[2][2] ||
            Mat[0][0] && Mat[1][1] && Mat[2][2] ||
            Mat[2][0] && Mat[1][1] && Mat[0][2]) {
            if (Turn[0]){
                player_turn.setText(R.string.player1winner_text);}
            else{
                player_turn.setText(R.string.player2winner_text);}
            win=true;
        }
        return win;
    }

    public void finish(){
        lock11[0]=true;
        lock12[0]=true;
        lock13[0]=true;
        lock21[0]=true;
        lock22[0]=true;
        lock23[0]=true;
        lock31[0]=true;
        lock32[0]=true;
        lock33[0]=true;
        img11.setBackgroundResource(R.color.myGrey);
        img12.setBackgroundResource(R.color.myGrey);
        img13.setBackgroundResource(R.color.myGrey);
        img21.setBackgroundResource(R.color.myGrey);
        img22.setBackgroundResource(R.color.myGrey);
        img23.setBackgroundResource(R.color.myGrey);
        img31.setBackgroundResource(R.color.myGrey);
        img32.setBackgroundResource(R.color.myGrey);
        img33.setBackgroundResource(R.color.myGrey);
    }

    public void maxmoves(){
        count=count+1;
        if(count==9){
            player_turn.setText(R.string.draw);
            finish();
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player_turn = findViewById(R.id.textPlayerTurn);
        grid_test = findViewById(R.id.grid);
        img11 = findViewById(R.id.s1);
        img12 = findViewById(R.id.s2);
        img13 = findViewById(R.id.s3);
        img21 = findViewById(R.id.s4);
        img22 = findViewById(R.id.s5);
        img23 = findViewById(R.id.s6);
        img31 = findViewById(R.id.s7);
        img32 = findViewById(R.id.s8);
        img33 = findViewById(R.id.s9);
        reset_button = findViewById(R.id.resetButton);


        for(i[0] =0; i[0] <3; i[0]++){
            for(j[0] =0; j[0] <3; j[0]++) {
                p1Mat[i[0]][j[0]]=false;
                p2Mat[i[0]][j[0]]=false;
            }
        }

        //ROW 1
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn1[0] && !lock11[0]) {
                    img11.setImageResource(R.drawable.ic_circle);
                    p1Mat[0][0] = true;
                    player_turn.setText(R.string.player2turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p1Mat, turn1);
                    turn1[0] = false;

                } else if (!turn1[0] && !lock11[0]){
                    img11.setImageResource(R.drawable.ic_cross);
                    p2Mat[0][0] = true;
                    player_turn.setText(R.string.player1turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p2Mat, turn1);
                    turn1[0] = true;
                }
                if (win[0]){
                    finish();
                }
                lock11[0] = true;
            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn1[0] && !lock12[0]) {
                    img12.setImageResource(R.drawable.ic_circle);
                    p1Mat[0][1] = true;
                    player_turn.setText(R.string.player2turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p1Mat, turn1);
                    turn1[0] = false;

                } else if (!turn1[0] && !lock12[0]){
                    img12.setImageResource(R.drawable.ic_cross);
                    p2Mat[0][1] = true;
                    player_turn.setText(R.string.player1turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p2Mat, turn1);
                    turn1[0] = true;
                }
                if (win[0]){
                    finish();
                }
                lock12[0] = true;
            }
        });

        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn1[0] && !lock13[0]) {
                    img13.setImageResource(R.drawable.ic_circle);
                    p1Mat[0][2] = true;
                    player_turn.setText(R.string.player2turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p1Mat, turn1);
                    turn1[0] = false;

                } else if (!turn1[0] && !lock13[0]){
                    img13.setImageResource(R.drawable.ic_cross);
                    p2Mat[0][2] = true;
                    player_turn.setText(R.string.player1turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p2Mat, turn1);
                    turn1[0] = true;
                }
                if (win[0]){
                    finish();
                }
                lock13[0] = true;
            }
        });

        //ROW 2
        img21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn1[0] && !lock21[0]) {
                    img21.setImageResource(R.drawable.ic_circle);
                    p1Mat[1][0] = true;
                    player_turn.setText(R.string.player2turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p1Mat, turn1);
                    turn1[0] = false;

                } else if (!turn1[0] && !lock21[0]){
                    img21.setImageResource(R.drawable.ic_cross);
                    p2Mat[1][0] = true;
                    player_turn.setText(R.string.player1turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p2Mat, turn1);
                    turn1[0] = true;
                }
                if (win[0]){
                    finish();
                }
                lock21[0] = true;
            }
        });

        img22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn1[0] && !lock22[0]) {
                    img22.setImageResource(R.drawable.ic_circle);
                    p1Mat[1][1] = true;
                    player_turn.setText(R.string.player2turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p1Mat, turn1);
                    turn1[0] = false;

                } else if (!turn1[0] && !lock22[0]){
                    img22.setImageResource(R.drawable.ic_cross);
                    p2Mat[1][1] = true;
                    player_turn.setText(R.string.player1turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p2Mat, turn1);
                    turn1[0] = true;
                }
                if (win[0]){
                    finish();
                }
                lock22[0] = true;
            }
        });

        img23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn1[0] && !lock23[0]) {
                    img23.setImageResource(R.drawable.ic_circle);
                    p1Mat[1][2] = true;
                    player_turn.setText(R.string.player2turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p1Mat, turn1);
                    turn1[0] = false;

                } else if (!turn1[0] && !lock23[0]){
                    img23.setImageResource(R.drawable.ic_cross);
                    p2Mat[1][2] = true;
                    player_turn.setText(R.string.player1turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p2Mat, turn1);
                    turn1[0] = true;
                }
                if (win[0]){
                    finish();
                }
                lock23[0] = true;
            }
        });

        //ROW 3
        img31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn1[0] && !lock31[0]) {
                    img31.setImageResource(R.drawable.ic_circle);
                    p1Mat[2][0] = true;
                    player_turn.setText(R.string.player2turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p1Mat, turn1);
                    turn1[0] = false;

                } else if (!turn1[0] && !lock31[0]){
                    img31.setImageResource(R.drawable.ic_cross);
                    p2Mat[2][0] = true;
                    player_turn.setText(R.string.player1turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p2Mat, turn1);
                    turn1[0] = true;
                }
                if (win[0]){
                    finish();
                }
                lock31[0] = true;
            }
        });

        img32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn1[0] && !lock32[0]) {
                    img32.setImageResource(R.drawable.ic_circle);
                    p1Mat[2][1] = true;
                    player_turn.setText(R.string.player2turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p1Mat, turn1);
                    turn1[0] = false;

                } else if (!turn1[0] && !lock32[0]){
                    img32.setImageResource(R.drawable.ic_cross);
                    p2Mat[2][1] = true;
                    player_turn.setText(R.string.player1turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p2Mat, turn1);
                    turn1[0] = true;
                }
                if (win[0]){
                    finish();
                }
                lock32[0] = true;
            }
        });

        img33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn1[0] && !lock33[0]) {
                    img33.setImageResource(R.drawable.ic_circle);
                    p1Mat[2][2] = true;
                    player_turn.setText(R.string.player2turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p1Mat, turn1);
                    turn1[0] = false;

                } else if (!turn1[0] && !lock33[0]){
                    img33.setImageResource(R.drawable.ic_cross);
                    p2Mat[2][2] = true;
                    player_turn.setText(R.string.player1turn_text);
                    maxmoves();
                    win[0]=victoryAchieved(p2Mat, turn1);
                    turn1[0] = true;
                }
                if (win[0]){
                    finish();
                }
                lock33[0] = true;
            }
        });

        //RESET BUTTON
        reset_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                turn1[0] = true;
                player_turn.setText(R.string.player1turn_text);

                for(i[0] =0; i[0] <3; i[0]++){
                    for(j[0] =0; j[0] <3; j[0]++) {
                        p1Mat[i[0]][j[0]]=false;
                        p2Mat[i[0]][j[0]]=false;
                    }
                }
                count=0;
                img11.setImageResource(0);
                img12.setImageResource(0);
                img13.setImageResource(0);
                img21.setImageResource(0);
                img22.setImageResource(0);
                img23.setImageResource(0);
                img31.setImageResource(0);
                img32.setImageResource(0);
                img33.setImageResource(0);
                img11.setBackgroundResource(R.color.myWhite);
                img12.setBackgroundResource(R.color.myWhite);
                img13.setBackgroundResource(R.color.myWhite);
                img21.setBackgroundResource(R.color.myWhite);
                img22.setBackgroundResource(R.color.myWhite);
                img23.setBackgroundResource(R.color.myWhite);
                img31.setBackgroundResource(R.color.myWhite);
                img32.setBackgroundResource(R.color.myWhite);
                img33.setBackgroundResource(R.color.myWhite);
                lock11[0]=false;
                lock12[0]=false;
                lock13[0]=false;
                lock21[0]=false;
                lock22[0]=false;
                lock23[0]=false;
                lock31[0]=false;
                lock32[0]=false;
                lock33[0]=false;
            }
        });
    }
}