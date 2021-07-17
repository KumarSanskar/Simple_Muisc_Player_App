package sanskar.kumar.kumarsanskar.simplemuiscplayerapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button playButton, pauseButton;
    MediaPlayer mediaPlayer;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton = findViewById(R.id.button);
        pauseButton = findViewById(R.id.button3);
        mediaPlayer = MediaPlayer.create(this, R.raw.turn);
    }
}