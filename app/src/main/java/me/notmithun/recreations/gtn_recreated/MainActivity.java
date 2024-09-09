package me.notmithun.recreations.gtn_recreated;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected Button start;
    protected Button history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.start);
        history = findViewById(R.id.ver_history);

        start.setOnClickListener(v -> new Handler().postDelayed(() -> {
            Intent i = new Intent(MainActivity.this, gameActivity.class);
            startActivity(i);
            finish();
        }, 1));

        history.setOnClickListener(v -> new Handler().postDelayed(() -> {
            Intent i = new Intent(MainActivity.this, versionhistoryActivity.class);
            startActivity(i);
            finish();
        }, 1));
    }
}