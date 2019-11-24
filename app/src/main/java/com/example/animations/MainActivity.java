package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView next;
    private TextView previous;
    private ImageView one;
    private ImageView two;
    private ImageView three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = findViewById(R.id.txtNext);
        previous = findViewById(R.id.txtPrevious);
        one = findViewById(R.id.imageView);
        two = findViewById(R.id.imageView2);
        three = findViewById(R.id.imageView3);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Log.i("MYTAG", "HelloWorld");

                if (one.getAlpha() == 1) {
                    one.animate().alpha(0).setDuration(1000);
                    two.animate().alpha(1).setDuration(1000);
                }
            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Log.i("MYTAG", "HelloWorld");

                if (two.getAlpha() == 1) {
                    two.animate().alpha(0).setDuration(1000);
                    one.animate().alpha(1).setDuration(1000);
                }
            }
        });
    }
}
