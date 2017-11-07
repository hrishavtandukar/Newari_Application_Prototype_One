package com.learnnewari.hrishav.newarilanguage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Switching intent in order to open history tab.
     */
    public void btnHistory(View view)
    {
        Intent intentHistory = new Intent(MainActivity.this, History.class);
        MainActivity.this.startActivity(intentHistory);
    }

    /**
     * For closing the MainActivity as soon as user selects quit option.
     * @param view
     */
    public void btnQuit(View view)
    {
        finish();
    }

    /**
     * To display help page after user selects help button
     * @param view
     */
    public void btnHelp(View view)
    {
        Intent intentHelp = new Intent(MainActivity.this, Help.class);
        MainActivity.this.startActivity(intentHelp);
    }

    /**
     * For going to QuizActivity after user selects quiz button
     */
    public void btnQuizActivity(View view)
    {
        Intent intentQuizActivity = new Intent(MainActivity.this, QuizActivity.class);
        MainActivity.this.startActivity(intentQuizActivity);
    }

    /**
     * To choose option menu in the toolbar
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * To allow users choose one of the option which are present in the toolbar
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        /**
         * if case for in case if user selects about us menu
         */
        if (id == R.id.helpMenu)
        {
            Intent intentHelp = new Intent(MainActivity.this, Help.class);
            MainActivity.this.startActivity(intentHelp);

            return true;
        }

        /**
         * if case for in case if user selects feedback menu
         */
        if (id == R.id.feedbackMenu)
        {
            return true;
        }

        return true;
    }
}
