package com.learnnewari.hrishav.newarilanguage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        /**
         * Adding a back button in toolbar
         */
        if (getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayShowHomeEnabled(true);//arrow button is enable
        }
    }

    /**
     * For opening the PDF which consist of various text that are present in Ranjana Lipi.
     * @param view
     */
    public void btnPDFLink(View view)
    {
        Intent btnPDFIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://malaiya.tripod.com/ranjana/Ranjana.pdf"));
        startActivity(btnPDFIntent);
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
            Intent intentHelp = new Intent(History.this, Help.class);
            History.this.startActivity(intentHelp);

            return true;
        }

        /**
         * if case for in case if user selects feedback menu
         */
        if (id == R.id.feedbackMenu)
        {
            return true;
        }

        /**
         * For going back to MainActivity on click of back button in toolbar.
         */
        if (id == android.R.id.home)
        {
            this.finish();
        }
        //return super.onOptionsItemSelected(item);
        return true;
    }
}
