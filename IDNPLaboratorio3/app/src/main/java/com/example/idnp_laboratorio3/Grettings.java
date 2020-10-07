package com.example.idnp_laboratorio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Grettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grettings);
        System.out.println("onCreate  -2");
        Toast.makeText(this, "onCreate  -2", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart  -2");

        Toast.makeText(this, "onStart-2", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause  -2");

        Toast.makeText(this, "onPause-2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();System.out.println("onPause -2");


        Toast.makeText(this, "onResume-2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onRestart  -2");

        Toast.makeText(this, "onReStart-2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy-2");

        Toast.makeText(this, "onDestroy-2", Toast.LENGTH_SHORT).show();

    }


    public  void goMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}