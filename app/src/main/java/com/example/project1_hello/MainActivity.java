package com.example.project1_hello;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.graphics.Insets;
import androidx.activity.EdgeToEdge;
import com.example.project1_hello.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // تمكين Edge to Edge
        EdgeToEdge.enable(this);

        // ربط XML
        setContentView(R.layout.activity_main);

        // ضبط حواف النظام
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main),
                (v, insets) -> {
                    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                    return insets;
                });
    }
}