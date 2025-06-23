package com.example.unico;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private Button button;

    private TextView textView;
    private TextInputEditText inputField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        inputField = findViewById((R.id.inputfield));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s  = inputField.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.205*kg;
                textView.setText("The corresponding value in pounds is "+ pound);
            }
        });


    }
}