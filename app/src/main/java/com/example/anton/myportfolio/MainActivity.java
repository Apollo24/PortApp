package com.example.anton.myportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button)findViewById(R.id.Capstone);
  button1.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View arg0) {
          Toast.makeText(getApplicationContext(),
                  "This Button Will Launch My Capstone APP",
                  Toast.LENGTH_LONG).show();
      }
  });

        Button button2 = (Button)findViewById(R.id.Spotify_Streamer);
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "This button will launch Spotify Streamer app",
                        Toast.LENGTH_LONG).show();
            }});
        Button button3 = (Button)findViewById(R.id.Scores_App);
        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "This button will launch Scores app",
                        Toast.LENGTH_LONG).show();
            }});
        Button button4 = (Button)findViewById(R.id.Library_App);
        button4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "This button will launch Library app",
                        Toast.LENGTH_LONG).show();
            }});
        Button button5 = (Button)findViewById(R.id.Build_It_Bigger);
        button5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "This button will launch Build it Bigger app",
                        Toast.LENGTH_LONG).show();
            }});

        Button button6 = (Button)findViewById(R.id.XYZ_Reader);
        button6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "This button will launch XYZ Reader app",
                        Toast.LENGTH_LONG).show();
            }});


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
}
