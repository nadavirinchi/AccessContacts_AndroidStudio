package com.example.accesscontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.QuickContactBadge;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QuickContactBadge quickContactBadge = findViewById(R.id.quickcontact);
        quickContactBadge.assignContactFromPhone("234567",true);

    }
}