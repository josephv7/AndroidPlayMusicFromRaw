package rm.iamjosephvarghese.musicplayer;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//    TODO: Improve the code...add more features

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);




        final MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.got);
        ring.setLooping(true);
        ring.start();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ring.isPlaying()){
                    ring.pause();
                }else{
                    ring.start();
                }


            }
        });

    }
}
