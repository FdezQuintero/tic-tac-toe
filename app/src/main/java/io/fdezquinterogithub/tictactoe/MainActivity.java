package io.fdezquinterogithub.tictactoe;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    //Declaration of Turn Text
    TextView player_turn;
    //Declaration of Images
    ImageView img11, img12, img13, img21, img22, img23, img31, img32, img33;
    //Declaration of Grid
    GridLayout grid_test;
    //Declaration of Reset Button
    Button reset_button;
    //Declaration of Players Matrixes
    boolean p1Mat[][] = new boolean[3][3];
    boolean p2Mat[][] = new boolean[3][3];
    //Initialise Players Matrixes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","Hola mundo");

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

        int i, j;

        for(i=0;i<3;i++){
            for(j=0;j<3;j++) {
                p1Mat[i][j]=false;
                p2Mat[i][j]=false;
            }
        }

        final boolean[] turn1 = {true};
        final boolean[] lock11 = {false};
        final boolean[] lock12 = {false};
        final boolean[] lock13 = {false};
        final boolean[] lock21 = {false};
        final boolean[] lock22 = {false};
        final boolean[] lock23 = {false};
        final boolean[] lock31 = {false};
        final boolean[] lock32 = {false};
        final boolean[] lock33 = {false};

        //ROW 1
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn1[0] && !lock11[0]) {
                    img11.setImageResource(R.drawable.ic_circle);
                    p1Mat[0][0] = true;
                    turn1[0] = false;
                    player_turn.setText(R.string.player2turn_text);

                } else if (!turn1[0] && !lock11[0]){
                    img11.setImageResource(R.drawable.ic_cross);
                    p2Mat[0][0] = true;
                    turn1[0] = true;
                    player_turn.setText(R.string.player1turn_text);
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
                    turn1[0] = false;
                    player_turn.setText(R.string.player2turn_text);

                } else if (!turn1[0] && !lock12[0]){
                    img12.setImageResource(R.drawable.ic_cross);
                    p2Mat[0][1] = true;
                    turn1[0] = true;
                    player_turn.setText(R.string.player1turn_text);
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
                    turn1[0] = false;
                    player_turn.setText(R.string.player2turn_text);

                } else if (!turn1[0] && !lock13[0]){
                    img13.setImageResource(R.drawable.ic_cross);
                    p2Mat[0][2] = true;
                    turn1[0] = true;
                    player_turn.setText(R.string.player1turn_text);
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
                    turn1[0] = false;
                    player_turn.setText(R.string.player2turn_text);

                } else if (!turn1[0] && !lock21[0]){
                    img21.setImageResource(R.drawable.ic_cross);
                    p2Mat[1][0] = true;
                    turn1[0] = true;
                    player_turn.setText(R.string.player1turn_text);
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
                    turn1[0] = false;
                    player_turn.setText(R.string.player2turn_text);

                } else if (!turn1[0] && !lock22[0]){
                    img22.setImageResource(R.drawable.ic_cross);
                    p2Mat[1][1] = true;
                    turn1[0] = true;
                    player_turn.setText(R.string.player1turn_text);
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
                    turn1[0] = false;
                    player_turn.setText(R.string.player2turn_text);

                } else if (!turn1[0] && !lock23[0]){
                    img23.setImageResource(R.drawable.ic_cross);
                    p2Mat[1][2] = true;
                    turn1[0] = true;
                    player_turn.setText(R.string.player1turn_text);
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
                    turn1[0] = false;
                    player_turn.setText(R.string.player2turn_text);

                } else if (!turn1[0] && !lock31[0]){
                    img31.setImageResource(R.drawable.ic_cross);
                    p2Mat[2][0] = true;
                    turn1[0] = true;
                    player_turn.setText(R.string.player1turn_text);
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
                    turn1[0] = false;
                    player_turn.setText(R.string.player2turn_text);

                } else if (!turn1[0] && !lock32[0]){
                    img32.setImageResource(R.drawable.ic_cross);
                    p2Mat[2][1] = true;
                    turn1[0] = true;
                    player_turn.setText(R.string.player1turn_text);
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
                    turn1[0] = false;
                    player_turn.setText(R.string.player2turn_text);

                } else if (!turn1[0] && !lock33[0]){
                    img33.setImageResource(R.drawable.ic_cross);
                    p2Mat[2][2] = true;
                    turn1[0] = true;
                    player_turn.setText(R.string.player1turn_text);
                }
                lock33[0] = true;
            }
        });

        //RESET BUTTON
        reset_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player_turn.setText(R.string.player1turn_text);
                img11.setImageResource(0);
                img12.setImageResource(0);
                img13.setImageResource(0);
                img21.setImageResource(0);
                img22.setImageResource(0);
                img23.setImageResource(0);
                img31.setImageResource(0);
                img32.setImageResource(0);
                img33.setImageResource(0);
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

class victoryCondition{

}