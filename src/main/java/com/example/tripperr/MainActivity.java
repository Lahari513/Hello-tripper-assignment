package com.example.tripperr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;

import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
      protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupHyperlink();
    }
        private void setupHyperlink() {
            TextView linkTextView = findViewById(R.id.id11);
            linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
            linkTextView.setLinkTextColor(Color.BLUE);
    }


}



