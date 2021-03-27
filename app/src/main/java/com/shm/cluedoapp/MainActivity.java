package com.shm.cluedoapp;

import androidx.appcompat.app.AppCompatActivity;
import com.shm.cluedoapp.R;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //listener();
    }

    /*private void listener() {
        checkbox.setOnClickListener {
            tv_state.text = when (checkbox.getState()) {
                0 -> "Unchecked"
                1 -> "Indeterminate"
                2 -> "Checked"
                3 -> "Answer"
                else -> "None"
            }
        }
    }*/
}