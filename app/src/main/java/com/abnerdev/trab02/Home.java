package com.abnerdev.trab02;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Console;

public class Home extends AppCompatActivity {

    TextView _title;
    ImageView _image;
    TextView _indexImage;
    int index=0;
    String images [] = new String[]{"bob","patrick","lula","sandy"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        _image = findViewById(R.id.imageView);
        _title = findViewById(R.id.textViewTitleImage);
        _indexImage = findViewById(R.id.indexImage);
        _indexImage.setText(index+1+"/"+images.length);
    }

    public void changeImage(View view){

        if(view.getId() == R.id.buttonRight){
            if(index < images.length-1)
                index++;
        }else{
            if(index!=0)
                index--;
        }
        Drawable d = getResources().getDrawable(
                getResources().getIdentifier(images[index],"drawable",getPackageName()),this.getTheme());
        _image.setImageDrawable(d);
        _indexImage.setText(index+1+"/"+images.length);
        _title.setText("This is "+images[index]);
    }




}