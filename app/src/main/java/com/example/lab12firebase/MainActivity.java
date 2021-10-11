package com.example.lab12firebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private Button bAddGuns, bShowImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bAddGuns = (Button) findViewById(R.id.bAddGuns);
        bAddGuns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAddGun();
            }
        });


        bShowImages = (Button) findViewById(R.id.bShowGuns);
        bShowImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showGuns();
            }
        });

    }

    private void showAddGun(){
        Intent intent = new Intent(MainActivity.this, Buygun.class);
        MainActivity.this.startActivity(intent);
    }

    private void showGuns(){
        Intent intent = new Intent(MainActivity.this, Showgun.class);
        MainActivity.this.startActivity(intent);
    }


}