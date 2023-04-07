package minji.kim.maeul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Signuppage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signuppage);

        Button getstarted = findViewById(R.id.getstarted);
        getstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent it = new Intent(Signuppage.this, Loginpage.class);
                startActivity(it);
            }
        });
    }
}

