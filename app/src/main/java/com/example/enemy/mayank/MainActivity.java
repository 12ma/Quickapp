package com.example.enemy.mayank;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View view) {
        Intent intent = null, chooser = null;
        if (view.getId() == R.id.a) {
            intent = new Intent(android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:19.076,72.877"));
            startActivity(intent);
        }
        if(view.getId()==R.id.b){
            intent=new Intent(android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=dolphin.developers.com"));

            startActivity(intent);
        }
        if(view.getId()==R.id.c){
            intent=new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to={"mayank.maheshwari344@gmail.com",""};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT,"hi,this was sent from my app");
            intent.putExtra(Intent.EXTRA_TEXT,"hi,what'up,make your day with my app");
            intent.setType("message/rfc822");
            chooser=intent.createChooser(intent,"Send Email");
            startActivity(chooser);
        }

        if(view.getId()==R.id.d){
           Uri image= Uri.parse("android.resource://com.example.enemy.mayank/drawable/"+R.drawable.ic_launcher_background);
           intent=new Intent(Intent.ACTION_SEND);
            intent.setType("image/*");
            intent.putExtra(Intent.EXTRA_STREAM,image);
            intent.putExtra(Intent.EXTRA_TEXT,"Hey i have image");
           chooser= Intent.createChooser(intent,"Send image");
            startActivity(chooser);
        }
        if(view.getId()==R.id.e){
            Toast toast =Toast.makeText(this,"Hello. you are in mayank app",Toast.LENGTH_LONG);
            toast.show();
            toast.setGravity(Gravity.CENTER,100,200);
        }

        if(view.getId()==R.id.f){
            Toast i=new Toast(this);
            i.setDuration(Toast.LENGTH_LONG);
            i.setGravity(Gravity.CENTER,0,0);
            LayoutInflater inflater=getLayoutInflater();
            View appear=inflater.inflate(R.layout.ma,(ViewGroup) findViewById(R.id.root));
            i.setView(appear);
            i.show();
        }





    }





}
