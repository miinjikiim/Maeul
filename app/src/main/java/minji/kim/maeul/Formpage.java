package minji.kim.maeul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Formpage extends AppCompatActivity {

    Button upload_btn;
    ImageView imageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formpage);
        upload_btn = (Button) findViewById(R.id.upload);
        imageView = findViewById(R.id.imageView2);
        upload_btn.setOnClickListener(v -> mgetContent.launch("image/*"));

        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.setType("plain/text");
                String[] address = {"email@address.com"};
                email.putExtra(Intent.EXTRA_EMAIL, address);
                email.putExtra(Intent.EXTRA_SUBJECT, "test@test");
                email.putExtra(Intent.EXTRA_TEXT, "내용 미리보기 (미리적을 수 있음)");
                startActivity(email);
            }
        });
    }
    ActivityResultLauncher<String> mgetContent = registerForActivityResult(
            new ActivityResultContracts.GetContent(),
            new ActivityResultCallback<Uri>(){
                @Override
                public void onActivityResult(Uri result) {
                    if (result != null) {
                        imageView.setImageURI(result);
                        imageView.setVisibility(View.VISIBLE);
                    }
                }
            }

    );
}