package com.fma.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.MessageFormat;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private ImageView button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private String startGame = "X";
    private int b1 = 5, b2 = 5, b3 = 5, b4 = 5, b5 = 5, b6 = 5, b7 = 5, b8 = 5, b9 = 5;
    private int xCount = 0, oCount =0, i =0;
    private TextView scoreX, scoreO, playerTurn;
    private Button resetButton;
    private String playerOneName;
    private String playerTwoName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button_image1);
        button2 = findViewById(R.id.button_image2);
        button3 = findViewById(R.id.button_image3);
        button4 = findViewById(R.id.button_image4);
        button5 = findViewById(R.id.button_image5);
        button6 = findViewById(R.id.button_image6);
        button7 = findViewById(R.id.button_image7);
        button8 = findViewById(R.id.button_image8);
        button9 = findViewById(R.id.button_image9);

        scoreX = findViewById(R.id.score_x);
        scoreO = findViewById(R.id.score_o);
        playerTurn = findViewById(R.id.player_turn);

        Objects.requireNonNull(getSupportActionBar()).hide();

        Intent intent = getIntent();
        playerOneName = intent.getStringExtra("playerOne");
        playerTwoName = intent.getStringExtra("playerTwo");

        scoreX.setText(MessageFormat.format("{0} Score : 0", playerOneName));
        scoreO.setText(MessageFormat.format("{0} Score : 0", playerTwoName));
        playerTurn.setText(MessageFormat.format("{0} Turn", playerOneName));

        resetButton = findViewById(R.id.reset_button);

        resetButton.setOnClickListener(view -> {

            resetImagesAndValues();

            xCount = 0;
            oCount = 0;

            scoreX.setText(MessageFormat.format("{0} Score : {1}", playerOneName, String.valueOf(xCount)));
            scoreO.setText(MessageFormat.format("{0} Score : {1}", playerTwoName, String.valueOf(oCount)));

        });

        button1.setOnClickListener(view -> {

            if(button1.getDrawable() == null) {
                if (startGame.equals("X")) {

                    button1.setImageResource(R.drawable.cross_image);
                    b1 = 1;

                } else {

                    button1.setImageResource(R.drawable.circle_image);
                    b1 = 0;
                }
                i++;

                choosePlayer();
                winningGame();

            } else {

                illegalMoveToast();

            }
        });

        button2.setOnClickListener(view -> {

            if(button2.getDrawable() == null) {
                if (startGame.equals("X")) {

                    button2.setImageResource(R.drawable.cross_image);
                    b2 = 1;

                } else {

                    button2.setImageResource(R.drawable.circle_image);
                    b2 = 0;
                }
                i++;

                choosePlayer();
                winningGame();

            } else {

                illegalMoveToast();

            }
        });

        button3.setOnClickListener(view -> {

            if(button3.getDrawable() == null) {
                if (startGame.equals("X")) {

                    button3.setImageResource(R.drawable.cross_image);
                    b3 = 1;

                } else {

                    button3.setImageResource(R.drawable.circle_image);
                    b3 = 0;
                }
                i++;

                choosePlayer();
                winningGame();

            } else {

                illegalMoveToast();

            }
        });

        button4.setOnClickListener(view -> {

            if(button4.getDrawable() == null) {
                if (startGame.equals("X")) {

                    button4.setImageResource(R.drawable.cross_image);
                    b4 = 1;

                } else {

                    button4.setImageResource(R.drawable.circle_image);
                    b4 = 0;
                }
                i++;

                choosePlayer();
                winningGame();

            } else {

                illegalMoveToast();

            }
        });

        button5.setOnClickListener(view -> {

            if(button5.getDrawable() == null) {
                if (startGame.equals("X")) {

                    button5.setImageResource(R.drawable.cross_image);
                    b5 = 1;

                } else {

                    button5.setImageResource(R.drawable.circle_image);
                    b5 = 0;
                }
                i++;

                choosePlayer();
                winningGame();

            } else {

                illegalMoveToast();

            }
        });

        button6.setOnClickListener(view -> {

            if(button6.getDrawable() == null) {
                if (startGame.equals("X")) {

                    button6.setImageResource(R.drawable.cross_image);
                    b6 = 1;

                } else {

                    button6.setImageResource(R.drawable.circle_image);
                    b6 = 0;
                }
                i++;

                choosePlayer();
                winningGame();

            } else {

                illegalMoveToast();

            }
        });

        button7.setOnClickListener(view -> {

            if(button7.getDrawable() == null) {
                if (startGame.equals("X")) {

                    button7.setImageResource(R.drawable.cross_image);
                    b7 = 1;

                } else {

                    button7.setImageResource(R.drawable.circle_image);
                    b7 = 0;
                }
                i++;

                choosePlayer();
                winningGame();

            } else {

                illegalMoveToast();

            }
        });

        button8.setOnClickListener(view -> {

            if(button8.getDrawable() == null) {
                if (startGame.equals("X")) {

                    button8.setImageResource(R.drawable.cross_image);
                    b8 = 1;

                } else {

                    button8.setImageResource(R.drawable.circle_image);
                    b8 = 0;
                }
                i++;

                choosePlayer();
                winningGame();

            } else {

                illegalMoveToast();

            }
        });

        button9.setOnClickListener(view -> {

            if(button9.getDrawable() == null) {
                if (startGame.equals("X")) {

                    button9.setImageResource(R.drawable.cross_image);
                    b9 = 1;

                } else {

                    button9.setImageResource(R.drawable.circle_image);
                    b9 = 0;
                }
                i++;

                choosePlayer();
                winningGame();

            } else {

                illegalMoveToast();

            }
        });

    }

    private void winningGame() {

        //player x win check
        if( (b1 == 1) && (b2 == 1) && (b3 == 1)) {

            playerOneWinningAlert();

        }

        else if( (b4 == 1) && (b5 == 1) && (b6 == 1)) {

            playerOneWinningAlert();

        }

        else if( (b7 == 1) && (b8 == 1) && (b9 == 1)) {

            playerOneWinningAlert();

        }

        else if( (b1 == 1) && (b4 == 1) && (b7 == 1)) {

            playerOneWinningAlert();

        }

        else if( (b2 == 1) && (b5 == 1) && (b8 == 1)) {

            playerOneWinningAlert();

        }

        else if( (b3 == 1) && (b6 == 1) && (b9 == 1)) {

            playerOneWinningAlert();

        }

        else if( (b1 == 1) && (b5 == 1) && (b9 == 1)) {

            playerOneWinningAlert();

        }

        else if( (b3 == 1) && (b5 == 1) && (b7 == 1)) {

            playerOneWinningAlert();

        }


        // player o win check
        else if( (b1 == 0) && (b2 == 0) && (b3 == 0)) {

            playerTwoWinningAlert();
        }

        else if( (b4 == 0) && (b5 == 0) && (b6 == 0)) {

            playerTwoWinningAlert();
        }

        else if( (b7 == 0) && (b8 == 0) && (b9 == 0)) {

            playerTwoWinningAlert();
        }

        else if( (b1 == 0) && (b4 == 0) && (b7 == 0)) {

            playerTwoWinningAlert();
        }

        else if( (b2 == 0) && (b5 == 0) && (b8 == 0)) {

            playerTwoWinningAlert();
        }

        else if( (b3 == 0) && (b6 == 0) && (b9 == 0)) {

            playerTwoWinningAlert();
        }

        else if( (b1 == 0) && (b5 == 0) && (b9 == 0)) {

            playerTwoWinningAlert();
        }

        else if( (b3 == 0) && (b5 == 0) && (b7 == 0)) {

            playerTwoWinningAlert();
        }

        else {

            //game tied here
            if(i == 9) {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Game Tied").setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                resetImagesAndValues();

                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }

        }

    }

    // here game choose which player will play next
    private void choosePlayer() {

        if(startGame.equals("X")) {

            startGame = "O";
            playerTurn.setText(MessageFormat.format("{0} Turn O", playerTwoName));

        } else {

            startGame = "X";
            playerTurn.setText(MessageFormat.format("{0} Turn X", playerOneName));
        }

    }

    private void resetImagesAndValues() {

        button1.setImageDrawable(null);
        button2.setImageDrawable(null);
        button3.setImageDrawable(null);
        button4.setImageDrawable(null);
        button5.setImageDrawable(null);
        button6.setImageDrawable(null);
        button7.setImageDrawable(null);
        button8.setImageDrawable(null);
        button9.setImageDrawable(null);

        i = 0;
        b1 = 5;
        b2 = 5;
        b3 = 5;
        b4 = 5;
        b5 = 5;
        b6 = 5;
        b7 = 5;
        b8 = 5;
        b9 = 5;

    }

    private void playerTwoWinningAlert() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(playerTwoName + " won the game").setCancelable(false)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        resetImagesAndValues();

                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        oCount++;

        scoreO.setText(MessageFormat.format("{0} Score : {1}", playerTwoName, String.valueOf(oCount)));

    }

    private void playerOneWinningAlert() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(playerOneName + " won the game").setCancelable(false)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        resetImagesAndValues();

                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        xCount++;

        scoreX.setText(MessageFormat.format("{0} Score : {1}", playerOneName, String.valueOf(xCount)));

    }

    private void illegalMoveToast() {

        Toast.makeText(MainActivity.this, "Illegal Move!", Toast.LENGTH_SHORT).show();

    }
}