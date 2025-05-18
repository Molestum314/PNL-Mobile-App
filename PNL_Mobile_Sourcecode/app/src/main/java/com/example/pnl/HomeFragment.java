package com.example.pnl;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Inisialisasi Button dan ImageButtons
        Button buttonSelengkapnya = view.findViewById(R.id.buttonSelengkapnya);
        ImageButton button1 = view.findViewById(R.id.button1);
        ImageButton button2 = view.findViewById(R.id.button2);

        // Set OnClickListener untuk buttonSelengkapnya
        buttonSelengkapnya.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), TentangJurusanActivity.class);
            startActivity(intent);
        });

        // Set OnClickListener untuk button1 (ImageButton pertama)
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), TentangProdiActivity.class);
            startActivity(intent);
        });

        // Set OnClickListener untuk button2 (ImageButton kedua)
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), TujuanJurusanActivity.class);
            startActivity(intent);
        });

        return view;
    }
}
