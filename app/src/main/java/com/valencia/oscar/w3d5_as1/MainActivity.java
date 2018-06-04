package com.valencia.oscar.w3d5_as1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.myIV);


    }

    public void loadImage(View view) {
        String imageUri =
                "https://banner2.kisspng.com/20180408/ihw/kisspng-crocodile-sarcosuchus-kaprosuchus-alligator-campto-boar-5acac013912b99.2208714615232368835946.jpg";
        Picasso.with(this).load(imageUri).into(imageView);
    }
}
