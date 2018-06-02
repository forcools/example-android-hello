package org.zerg.example.hello.activity;

import android.app.Activity;
import android.os.Bundle;

import org.zerg.example.hello.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
