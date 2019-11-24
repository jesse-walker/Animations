package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    private Boolean isHelloShowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);

        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Log.i("MYTAG", "HelloWorld");

                if (txtHelloWorld.getAlpha() == 1) {
                    txtHelloWorld.animate().alpha(0).setDuration(1000);
                    txtHiWorld.animate().alpha(1).setDuration(1000);
                } else if (txtHelloWorld.getAlpha() == 0) {
                    txtHelloWorld.animate().alpha(1).setDuration(1000);
                    txtHiWorld.animate().alpha(0).setDuration(1000);
                }
            }
        });
    }
}
