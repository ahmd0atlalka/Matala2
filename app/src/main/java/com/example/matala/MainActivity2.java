package com.example.matala; // Replace with your actual package name

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        counter = 10;
        TextView counterTextView = findViewById(R.id.textViewCounter);
        counterTextView.setText("" + counter);
    }

    public void knock(View view) {
        if (counter > 0) {
            counter--;
            TextView counterTextView = findViewById(R.id.textViewCounter);
            counterTextView.setText("" + counter);
            if (counter == 0) {
                ImageView eggImageView = findViewById(R.id.imageViewEgg); // Ensure this ID exists
                eggImageView.setImageResource(R.drawable.img_2); // Ensure 'surprize.png' (or other format) is in res/drawable
            }
        }
    }

    public void reset(View view) {
        counter = 10;
        TextView counterTextView = findViewById(R.id.textViewCounter); // Ensure this ID exists
        counterTextView.setText("" + counter);
        ImageView eggImageView = findViewById(R.id.imageViewEgg); // Ensure this ID exists
        eggImageView.setImageResource(R.drawable.img_1); // Ensure 'green_egg.png' (or other format) is in res/drawable
    }
}