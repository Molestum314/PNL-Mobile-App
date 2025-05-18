package com.example.pnl;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TujuanJurusanActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tujuanjurusan); // Menampilkan layout activity_tujuanjurusan.xml

        // Menambahkan OnClickListener untuk Button "buttonback"
        Button buttonBack = findViewById(R.id.buttonback);
        buttonBack.setOnClickListener(v -> {
            // Mengarahkan kembali ke HomeActivity
            Intent intent = new Intent(TujuanJurusanActivity.this, HomeActivity.class);
            startActivity(intent);
            finish(); // Menyelesaikan activity ini agar tidak kembali ke TujuanJurusanActivity saat tekan tombol back
        });
    }
}
