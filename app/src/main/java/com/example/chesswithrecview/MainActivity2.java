package com.example.chesswithrecview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
private TextView txt;
private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String index =intent.getStringExtra("ItemId");
        txt=findViewById(R.id.textView);
        txt.setText(index);
        int imageResId=getIntent().getIntExtra("imageResId",0);
        img=findViewById(R.id.imageView2);
        img.setImageDrawable(ContextCompat.getDrawable(this,imageResId));

    }
}