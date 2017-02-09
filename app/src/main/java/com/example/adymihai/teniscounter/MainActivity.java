package com.example.adymihai.teniscounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.app.Activity;

import java.text.NumberFormat;

import com.example.adymihai.teniscounter.R;

import static android.R.id.button2;
import static android.R.id.button3;

public class MainActivity extends AppCompatActivity {

    LinearLayout buttonPanel;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;


    int firstSetScoreFederer = 0;
    int secondSetScoreFederer = 0;
    int thirdSetScoreFederer = 0;
    int firstSetScoreNadal = 0;
    int secondSetScoreNadal = 0;
    int thirdSetScoreNadal = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPanel = (LinearLayout) findViewById(R.id.buttonPanel);
        button1 = (Button) findViewById(R.id.one_federer);
        button2 = (Button) findViewById(R.id.one_nadal);
        button3 = (Button) findViewById(R.id.two_federer);
        button4 = (Button) findViewById(R.id.two_nadal);
        button5 = (Button) findViewById(R.id.three_federer);
        button6 = (Button) findViewById(R.id.three_nadal);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstSetScoreFederer = firstSetScoreFederer + 1;
                displayForFedererOne(firstSetScoreFederer);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstSetScoreNadal = firstSetScoreNadal + 1;
                displayForNadalOne(firstSetScoreNadal);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondSetScoreFederer = secondSetScoreFederer + 1;
                displayForFedererTwo(secondSetScoreFederer);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondSetScoreNadal = secondSetScoreNadal + 1;
                displayForNadalTwo(secondSetScoreNadal);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thirdSetScoreFederer = thirdSetScoreFederer + 1;
                displayForFedererThree(thirdSetScoreFederer);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thirdSetScoreNadal = thirdSetScoreNadal + 1;
                displayForNadalThree(thirdSetScoreNadal);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void displayForFedererOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set_one_federer);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForFedererTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set_two_federer);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForFedererThree(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set_three_federer);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForNadalOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set_one_nadal);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForNadalTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set_two_nadal);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForNadalThree(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set_three_nadal);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View v) {
        displayForNadalOne(0);
        displayForNadalTwo(0);
        displayForNadalThree(0);
        displayForFedererOne(0);
        displayForFedererTwo(0);
        displayForFedererThree(0);

    }
}
