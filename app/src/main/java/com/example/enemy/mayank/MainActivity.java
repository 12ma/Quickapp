package com.example.enemy.mayank;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View view) {
        Intent intent = null, chooser = null;
        if (view.getId() == R.id.a) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:19.076,72.877"));
            startActivity(intent);


        }
    }


}
