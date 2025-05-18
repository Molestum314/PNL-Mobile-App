package com.example.pnl;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home); // Menampilkan layout activity_home.xml

        // Inisialisasi BottomNavigationView
        BottomNavigationView bottomNav = findViewById(R.id.nav);

        // Menambahkan listener untuk klik item di BottomNavigation
        bottomNav.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            Fragment selectedFragment = null;

            // Menentukan fragment yang akan dipilih
            if (itemId == R.id.nav_home) {
                selectedFragment = new HomeFragment(); // Ganti dengan fragment yang sesuai
            } else if (itemId == R.id.nav_visi) {
                selectedFragment = new VisiFragment(); // Ganti dengan fragment yang sesuai
            } else if (itemId == R.id.nav_dosen) {
                selectedFragment = new DosenFragment(); // Ganti dengan fragment yang sesuai
            } else if (itemId == R.id.nav_capaian) {
                selectedFragment = new CapaianFragment(); // Ganti dengan fragment yang sesuai
            }

            // Jika fragment terpilih, menggantinya dengan fragment baru
            if (selectedFragment != null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, selectedFragment) // Ganti dengan ID kontainer fragment
                        .commit();
            }
            return true;
        });

        // Menampilkan fragment pertama (default) saat pertama kali membuka Activity
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new HomeFragment()) // Fragment default
                    .commit();
        }
    }
}