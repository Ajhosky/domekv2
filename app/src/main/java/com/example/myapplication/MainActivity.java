package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button likeBtn = findViewById(R.id.likeBtn);
        Button deleteBtn = findViewById(R.id.deleteBtn);
        Button saveBtn = findViewById(R.id.saveBtn);
        TextView likesCounter = findViewById(R.id.likesTextView);
        final int[] likes = {0};
        likesCounter.setText(likes[0] + " polubień");
        likeBtn.setOnClickListener(view ->{
            likes[0]++;
            likesCounter.setText(likes[0] + " polubień");
        });
        deleteBtn.setOnClickListener(view ->{
            if (likes[0] < 1){

            }else {
                likes[0]--;
            }

            likesCounter.setText(likes[0] + " polubień");
        });





    }
}