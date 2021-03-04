package com.fma.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SetPlayerActivity extends AppCompatActivity {

    private EditText playerOne, playerTwo;
    private Button setNamesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_player);

        playerOne = findViewById(R.id.player_one_name);
        playerTwo = findViewById(R.id.player_two_name);
        setNamesButton = findViewById(R.id.set_names_btn);

        setNamesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String playerOneName = playerOne.getText().toString().trim();
                String playerTwoName = playerTwo.getText().toString().trim();

                Intent intent = new Intent(SetPlayerActivity.this, MainActivity.class);
                intent.putExtra("playerOne", playerOneName);
                intent.putExtra("playerTwo", playerTwoName);
                startActivity(intent);

            }
        });
    }
}