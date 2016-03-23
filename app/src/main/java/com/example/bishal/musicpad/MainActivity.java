package com.example.bishal.musicpad;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private int []mySound;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();
        mySound = new int[]{
                R.raw.sound1,
                R.raw.sound2,
                R.raw.sound3,
                R.raw.sound4,
                R.raw.sound5,
                R.raw.sound6,
                R.raw.sound7,
                R.raw.sound8,
                R.raw.sound9
        };

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);


    }

    public void init(){
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);

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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                //mediaPlayer = MediaPlayer.create(this, mySound[0]);
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound1);
                mediaPlayer.start();
                break;
            case R.id.button2:
                //mediaPlayer = MediaPlayer.create(this, mySound[1]);
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound2);
                mediaPlayer.start();
                break;
            case R.id.button3:
                //mediaPlayer = MediaPlayer.create(this, mySound[2]);
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound6);
                mediaPlayer.start();
                break;
            case R.id.button4:
               //mediaPlayer = MediaPlayer.create(this, mySound[3]);
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound3);
                mediaPlayer.start();
                break;
            case R.id.button5:
                //mediaPlayer = MediaPlayer.create(this, mySound[4]);
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound7);
                mediaPlayer.start();
                break;
            case R.id.button6:
                //mediaPlayer = MediaPlayer.create(this, mySound[5]);
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound4);
                mediaPlayer.start();
                break;
            case R.id.button7:
               // mediaPlayer = MediaPlayer.create(this, mySound[6]);
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound8);
                mediaPlayer.start();
                break;
            case R.id.button8:
                //mediaPlayer = MediaPlayer.create(this, mySound[7]);
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound5);
                mediaPlayer.start();
                break;
            case R.id.button9:
                //mediaPlayer = MediaPlayer.create(this, mySound[8]);
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound9);
                mediaPlayer.start();
                break;

        }
    }

    @Override
    protected void onDestroy() {
        if(mediaPlayer!= null && mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
        Log.v("On Destroy", "I Was Here!!!!!!");
        super.onDestroy();
    }
}
