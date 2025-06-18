package com.example.matala; // Replace with your actual package name

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declare UI elements as member variables
    TextView textViewCounter;
    Button buttonShowMessage;
    Button buttonPlus;

    // Counter variable to keep track of the count
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewCounter = findViewById(R.id.textViewCounter);
        buttonShowMessage = findViewById(R.id.buttonShowMessage);
        buttonPlus = findViewById(R.id.buttonPlus);

        textViewCounter.setText(String.valueOf(counter));

        buttonShowMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When the button is clicked, display a Toast message
                // showing the current value of the counter.
                Toast.makeText(MainActivity.this, "Current count: " + counter, Toast.LENGTH_SHORT).show();
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                textViewCounter.setText(String.valueOf(counter));
            }
        });
    }
}