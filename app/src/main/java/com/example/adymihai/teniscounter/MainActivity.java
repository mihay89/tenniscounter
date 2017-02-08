package com.example.adymihai.teniscounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import java.text.NumberFormat;
import com.example.adymihai.teniscounter.R;

public class MainActivity extends AppCompatActivity {
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
        displayForFedererOne(0);
        displayForFedererTwo(0);
        displayForFedererThree(0);
        displayForNadalOne(0);
        displayForNadalTwo(0);
        displayForNadalThree(0);

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

    /**
     * Increase the score for Team A by 1 point.
     */
    public void setOneFederer(View v) {
        firstSetScoreFederer = firstSetScoreFederer + 1;
            displayForFedererOne(firstSetScoreFederer);

    }
    public void setTwoFederer(View v) {
        secondSetScoreFederer = secondSetScoreFederer + 1;
            displayForFedererTwo(secondSetScoreFederer);

    }
    public void setThreeFederer(View v) {
        thirdSetScoreFederer = thirdSetScoreFederer + 1;
            displayForFedererThree(thirdSetScoreFederer);
    }

    public void setOneNadal(View v) {
    firstSetScoreNadal = firstSetScoreNadal + 1;
        displayForNadalOne(firstSetScoreNadal);

}
    public void setTwoNadal(View v) {
    secondSetScoreNadal = secondSetScoreNadal + 1;
        displayForNadalTwo(secondSetScoreNadal);
}
    public void setThreeNadal(View v) {
        thirdSetScoreNadal = thirdSetScoreNadal + 1;
            displayForNadalThree(thirdSetScoreNadal);
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
