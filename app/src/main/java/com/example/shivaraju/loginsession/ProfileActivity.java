package com.example.shivaraju.loginsession;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity {

    private TextView emailProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        emailProfile = (TextView) findViewById(R.id.emailProfile);
        emailProfile.setText(getIntent().getExtras().getString("Email"));
    }
}
