package minji.kim.maeul;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    @Override
    public void onCreate(Bundle splash) {
        super.onCreate(splash);
        setContentView(R.layout.splash);
        new Handler(). postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(Splash.this, Mainpage.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, 2000);
    }
}
