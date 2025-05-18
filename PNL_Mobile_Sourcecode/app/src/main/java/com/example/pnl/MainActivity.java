package com.example.pnl; // Pastikan nama package sesuai dengan project Anda

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Memuat layout activity_main.xml

        // Membuat Handler untuk menunggu selama 3 detik
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Setelah 3 detik, pindah ke HomeActivity
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
                finish(); // Menutup MainActivity agar tidak bisa kembali ke halaman loading
            }
        }, 3000); // 3000 ms = 3 detik
    }
}
