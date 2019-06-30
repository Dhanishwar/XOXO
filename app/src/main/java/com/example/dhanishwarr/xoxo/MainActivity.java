package com.example.dhanishwarr.xoxo;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Process;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int count = 0, win=0;
    int b[][] = new int[3][3];
    Button rematch, b00, b01, b02, b10, b11, b12, b20, b21, b22;
    TextView xo;
    Boolean won = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rematch = findViewById(R.id.button5);
        xo = findViewById(R.id.txt);
        b00 = findViewById(R.id.b00);
        b01 = findViewById(R.id.b13);
        b02 = findViewById(R.id.b02);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b20 = findViewById(R.id.b20);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);

        b00.setOnClickListener(this);
        b01.setOnClickListener(this);
        b02.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        rematch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        count++;
        if (b00.getId() == v.getId()) {
            b00.setText(xo.getText().toString());
            b00.setEnabled(false);
            if (xo.getText().toString().compareTo("X") == 0){
                b[0][0] = 1;
                b00.setBackgroundColor(getResources().getColor(R.color.ref));
                check(1,0,0);
            }

            else{
                b[0][0] = 2;
                b00.setBackgroundColor(getResources().getColor(R.color.fb));
                check(2,0,0);
            }
        } else if (b01.getId() == v.getId()) {
            b01.setText(xo.getText().toString());
            b01.setEnabled(false);
            if (xo.getText().toString().compareTo("X") == 0){
                b[0][1] = 1;
                b01.setBackgroundColor(getResources().getColor(R.color.ref));
                check(1,0,1);
            }
            else{
                b[0][1] = 2;
                b01.setBackgroundColor(getResources().getColor(R.color.fb));
                check(2,0,1);
            }
        } else if (b02.getId() == v.getId()) {
            b02.setText(xo.getText().toString());
            b02.setEnabled(false);
            if (xo.getText().toString().compareTo("X") == 0){
                b[0][2] = 1;
                b02.setBackgroundColor(getResources().getColor(R.color.ref));
                check(1,0,2);
            }
            else{
                b[0][2] = 2;
                b02.setBackgroundColor(getResources().getColor(R.color.fb));
                check(2,0,2);
            }

        } else if (b10.getId() == v.getId()) {
            b10.setText(xo.getText().toString());
            b10.setEnabled(false);
            if (xo.getText().toString().compareTo("X") == 0){
                b[1][0] = 1;
                b10.setBackgroundColor(getResources().getColor(R.color.ref));
                check(1,1,0);
            }
            else{
                b[1][0] = 2;
                b10.setBackgroundColor(getResources().getColor(R.color.fb));
                check(2,1,0);
            }

        } else if (b11.getId() == v.getId()) {
            b11.setText(xo.getText().toString());
            b11.setEnabled(false);
            if (xo.getText().toString().compareTo("X") == 0){
                b[1][1] = 1;
                b11.setBackgroundColor(getResources().getColor(R.color.ref));
                check(1,1,1);
            }
            else{
                b[1][1] = 2;
                b11.setBackgroundColor(getResources().getColor(R.color.fb));
                check(2,1,1);
            }

        } else if (b12.getId() == v.getId()) {
            b12.setText(xo.getText().toString());
            b12.setEnabled(false);
            if (xo.getText().toString().compareTo("X") == 0){
                b[1][2] = 1;
                b12.setBackgroundColor(getResources().getColor(R.color.ref));
                check(1,1,2);
            }
            else{
                b[1][2] = 2;
                b12.setBackgroundColor(getResources().getColor(R.color.fb));
                check(2,1,2);
            }

        } else if (b20.getId() == v.getId()) {
            b20.setText(xo.getText().toString());
            b20.setEnabled(false);
            if (xo.getText().toString().compareTo("X") == 0){
                b[2][0] = 1;
                b20.setBackgroundColor(getResources().getColor(R.color.ref));
                check(1,2,0);
            }
            else{
                b[2][0] = 2;
                b20.setBackgroundColor(getResources().getColor(R.color.fb));
                check(2,2,0);
            }

        } else if (b21.getId() == v.getId()) {
            b21.setText(xo.getText().toString());
            b21.setEnabled(false);
            if (xo.getText().toString().compareTo("X") == 0){
                b[2][1] = 1;
                b21.setBackgroundColor(getResources().getColor(R.color.ref));
                check(1,2,1);
            }
            else{
                b[2][1] = 2;
                b21.setBackgroundColor(getResources().getColor(R.color.fb));
                check(2,2,1);
            }

        } else if (b22.getId() == v.getId()) {
            b22.setText(xo.getText().toString());
            b22.setEnabled(false);
            if (xo.getText().toString().compareTo("X") == 0){
                b[2][2] = 1;
                b22.setBackgroundColor(getResources().getColor(R.color.ref));
                check(1,2,2);
            }
            else{
                b[2][2] = 2;
                b22.setBackgroundColor(getResources().getColor(R.color.fb));
                check(2,2,2);
            }

        }
        else {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); //this will always start your activity as a new task
            startActivity(intent);
            finish();
        }
        if(count%2==0){
            xo.setText("X");
            xo.setBackgroundColor(getResources().getColor(R.color.ref));
        }
        else{
            xo.setText("O");
            xo.setBackgroundColor(getResources().getColor(R.color.fb));
        }
        if(count==9&&won==false){
            Toast.makeText(this,"Match drawn, go for a rematch",Toast.LENGTH_LONG).show();
        }

    }

    //&&b[j+1][k]==i&&b[j+2][k]==i)||(j==0&&b[j][k+1]==i&&b[j][k+2]==i)||(j==0&&b[j+1][k+1]==i&&b[j+1][k+1]==i)
    public void check(int i, int j, int k) {

        if (j == 0) {
            if (k == 0) {
                if ((b[j][k + 1] == i && b[j][k + 2] == i) || (b[j + 1][k] == i && b[j + 2][k] == i) || (b[j + 1][k + 1] == i && b[j + 2][k + 2] == i)) {
                    won = true;
                }
                }
                else if (k == 1) {
                    if ((b[j][k + 1] == i && b[j][k - 1] == i) || (b[j + 1][k] == i && b[j + 2][k] == i)) {
                        won = true;

                    }
                }
                else if(k==2){
                if ((b[j][k - 1] == i && b[j][k - 2] == i) || (b[j + 1][k] == i && b[j + 2][k] == i) || (b[j + 1][k - 1] == i && b[j + 2][k - 2] == i)) {
                    won = true;

                }

                }

            }
            else if ((j == 1)) {
                if (k == 0) {
                    if ((b[j + 1][k] == i && b[j - 1][k] == i) || (b[j][k + 1] == i && b[j][k + 2] == i)) {
                        won = true;

                    }
                } else if (k == 1) {
                    if ((b[j + 1][k] == i && b[j - 1][k] == i) || (b[j][k + 1] == i && b[j][k - 1] == i) || (b[j + 1][k + 1] == i && b[j - 1][k - 1] == i) || b[j - 1][k + 1] == i && b[j + 1][k - 1] == i) {
                        won = true;

                    }

                } else if (k == 2) {
                    if ((b[j + 1][k] == i && b[j - 1][k] == i) || (b[j][k - 1] == i && b[j][k - 2] == i)) {
                        won = true;

                    }

                }
            }
            else if(j==2){
                if (k==0){
                    if((b[j-1][k]==i&&b[j-2][k]==i)||(b[j][k+1]==i&&b[j][k+2]==i)||(b[j-1][k+1]==i&&b[j-2][k+2]==i)){
                        won = true;

                    }

                }
                else if(k==1){
                    if((b[j][k + 1] == i && b[j][k - 1] == i) || (b[j - 1][k] == i && b[j - 2][k] == i)){
                        won = true;

                    }
                }
                else if(k==2){
                    if((b[j][k - 1] == i && b[j][k - 2] == i) || (b[j - 1][k] == i && b[j - 2][k] == i) || (b[j -1][k - 1] == i && b[j - 2][k - 2] == i)){
                        won = true;
                    }
                }
        }
        if(won){
            AlertDialog.Builder built = new AlertDialog.Builder(MainActivity.this);
            built.setMessage("We've got a winner, Want another match?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(MainActivity.this, MainActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); //this will always start your activity as a new task
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);
                        }
                    });
            AlertDialog alert = built.create();
            alert.setTitle("WINNER WINNER!!");
            alert.show();;
        }
        return;

        }

 //   @Override
//    protected void onDestroy() {
//        Process.killProcess(Process.myPid());
//        super.onDestroy();
//    }
}

