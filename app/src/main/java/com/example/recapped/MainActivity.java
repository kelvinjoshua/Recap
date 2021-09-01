package com.example.recapped;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button done;
    public EditText hobbies;
    public TextView shownHobbies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        done = findViewById(R.id.submit);
        hobbies = findViewById(R.id.hobbies);
        shownHobbies = findViewById(R.id.shownText);

    }
}