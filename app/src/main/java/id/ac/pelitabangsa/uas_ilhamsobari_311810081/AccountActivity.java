package id.ac.pelitabangsa.uas_ilhamsobari_311810081;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AccountActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acount);
        button = findViewById(R.id.btn_home);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();
            }
        });


    }
    public void openMain() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}

