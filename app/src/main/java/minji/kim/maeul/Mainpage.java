package minji.kim.maeul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Mainpage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);

        Button houseoptions = findViewById(R.id.houseoptions);
        houseoptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Mainpage.this,Listpage.class );
                startActivity(it);
            }
        });
        Button provideahome = findViewById(R.id.provideahome);
        provideahome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Mainpage.this, Formpage.class);
                startActivity(it);
            }
        });
        Button donatenow = findViewById(R.id.donatenow);
        donatenow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Mainpage.this, Donationpage.class);
                startActivity(it);
            }

        });
        Button aboutus = findViewById(R.id.aboutus);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Mainpage.this, Aboutuspage.class);
                startActivity(it);
            }

        });

    }

}
