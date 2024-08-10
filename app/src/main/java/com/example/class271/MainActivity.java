package com.example.class271;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    AppCompatButton btn1, btn2, btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btnHome = findViewById(R.id.btnHome);

        // Default color
        int defaultColor = Color.parseColor("#bacf91"); // অথবা আপনি btnHome.getSolidColor() ব্যবহার করতে পারেন

        // Set default fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout, new HomeFragment());
        fragmentTransaction.commit();
        resetButtonColors(defaultColor);
        btnHome.setBackgroundColor(Color.parseColor("#000000"));
        btnHome.setTextColor(Color.parseColor("#ffffff"));

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetButtonColors(defaultColor);
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, new HomeFragment());
                fragmentTransaction.commit();

                btnHome.setBackgroundColor(Color.parseColor("#000000"));
                btnHome.setTextColor(Color.parseColor("#ffffff"));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetButtonColors(defaultColor);
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, new FirstFragment());
                fragmentTransaction.commit();

                btn1.setBackgroundColor(Color.parseColor("#000000"));
                btn1.setTextColor(Color.parseColor("#ffffff"));
            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetButtonColors(defaultColor);
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, new SecondFragment());
                fragmentTransaction.commit();

                btn2.setBackgroundColor(Color.parseColor("#000000"));
                btn2.setTextColor(Color.parseColor("#ffffff"));
            }
        });
    }

    // Reset button colors to default
    private void resetButtonColors(int defaultColor) {
        btnHome.setBackgroundColor(defaultColor);
        btn1.setBackgroundColor(defaultColor);
        btn2.setBackgroundColor(defaultColor);
    }
}
