package com.example.stepappv1;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.progressindicator.CircularProgressIndicator;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private TextView showCount;
    private CircularProgressIndicator progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showCount = findViewById(R.id.show_count);
        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(200);
    }

    public void showToast(View view) {
        counter = 0;
        showCount.setText(Integer.toString(counter));
        progressBar.setProgress(0);
        Toast toast = Toast.makeText(this, R.string.start, Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        if (counter < 200) {
            counter++;
            showCount.setText(Integer.toString(counter));
            progressBar.setProgress(counter);
        }
    }


}
