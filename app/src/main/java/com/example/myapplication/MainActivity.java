package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    Button btnSelanjutnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Memastikan bahwa ID `main` ada di layout
        TextView mainText = findViewById(R.id.main);
        mainText.setText("Lanjut ke halaman berikutnya");

        // Mengatur padding untuk `main` TextView
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnSelanjutnya = findViewById(R.id.btn_selanjutnya);
        btnSelanjutnya.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, IntentActivity.class);
            startActivity(intent);
        });
    }
}
