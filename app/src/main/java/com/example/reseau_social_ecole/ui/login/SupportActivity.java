package com.example.reseau_social_ecole.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.reseau_social_ecole.R;

public class SupportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        final Button send = findViewById(R.id.b_confirm5);

        final ImageView back = findViewById(R.id.b_backParam);

        back.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ParametresActivity.class);
            startActivity(intent);
        });

        send.setOnClickListener((View v) -> {
            showPopUp();
        });
    }
    public void showPopUp() {

        PopUp popUp = new PopUp("Confirmation", "Merci, vous serez contacté sous peu.");
        popUp.show(getSupportFragmentManager(), "popUp");

    }
}