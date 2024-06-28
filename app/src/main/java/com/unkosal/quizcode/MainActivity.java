package com.unkosal.quizcode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout java = findViewById(R.id.javaLayout);
        final LinearLayout php = findViewById(R.id.phpLayout);
        final LinearLayout html = findViewById(R.id.htmlLayout);
        final LinearLayout androidLayout = findViewById(R.id.androidLayout);

        final Button startBtn = findViewById(R.id.startQuizbtn);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Java";
                setTopicSelection(java);
            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "PHP";
                setTopicSelection(php);
            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "HTML";
                setTopicSelection(html);
            }
        });

        androidLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Android";
                setTopicSelection(androidLayout);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedTopicName.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please select a topic", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }

    private void setTopicSelection(LinearLayout layout) {
        // Reset all backgrounds
        LinearLayout java = findViewById(R.id.javaLayout);
        LinearLayout php = findViewById(R.id.phpLayout);
        LinearLayout html = findViewById(R.id.htmlLayout);
        LinearLayout androidLayout = findViewById(R.id.androidLayout);

        java.setBackgroundResource(R.drawable.round_back_white10);
        php.setBackgroundResource(R.drawable.round_back_white10);
        html.setBackgroundResource(R.drawable.round_back_white10);
        androidLayout.setBackgroundResource(R.drawable.round_back_white10);

        // Set selected topic background
        layout.setBackgroundResource(R.drawable.round_back_white_stroke10);
    }
}
