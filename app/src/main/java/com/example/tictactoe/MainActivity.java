package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button [][] buttons=new Button[3][3];
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Button rest = findViewById(R.id.reset);
        final TextView player1=findViewById(R.id.textView_1);
        final TextView player2= findViewById(R.id.textView2);
        
        final int score1;
        final int score2;
        
        //assigning buttons to array
        buttons[0][0]=findViewById(R.id.btn_00);
        buttons[0][1]=findViewById(R.id.btn_01);
        buttons[0][2]=findViewById(R.id.btn_02);
        buttons[1][0]=findViewById(R.id.btn_10);
        buttons[1][1]=findViewById(R.id.btn_11);
        buttons[1][2]=findViewById(R.id.btn_12);
        buttons[2][0]=findViewById(R.id.btn_20);
        buttons[2][1]=findViewById(R.id.btn_21);
        buttons[2][2]=findViewById(R.id.btn_22);
        
        //when reset button is clicked, the game will restart and scores will restart to 0.
        reset.setOnClickListener(new View.OnClickListener(){
            public voi onClick(View v){
                int score1=0;
                int score2=0; //i might not need these varibles since i declared above
                player1.setText("Player1: "+score1);
                player2.setText("Player2: "+score2);
                
                //clears out board
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        buttons[i][j].setText("");
                    }
                }
            }
        });
            
    }
}
