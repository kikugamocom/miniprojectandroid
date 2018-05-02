package th.vu.cs.testminiproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main4Activity extends AppCompatActivity {

    Handler handler;
    Runnable runnable;
    long delay_time;
    long time = 4000L;
    //MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);



       // mPlayer = MediaPlayer.create(this,R.raw.lili);
       // mPlayer.start();
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Main4Activity.this,Main3Activity.class);

                startActivity(intent);

                finish();
            }
        };
    }



    public  void onResume(){
        super.onResume();
        delay_time = time;
        handler.postDelayed(runnable,delay_time);
        time = System.currentTimeMillis();







    }


    public  void onPause(){

        super.onPause();
        handler.removeCallbacks(runnable);
        time = delay_time - (System.currentTimeMillis() - time);
       // mPlayer.stop();


    }
}

