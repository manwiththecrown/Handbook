package com.example.handbook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Text_Content_Activity extends AppCompatActivity {
    private int category;
    private int position;
    private int[] array_car = {R.string.car1, R.string.car2, R.string.car3};
    private int[] array_image_car = {R.drawable.nissan, R.drawable.porsche, R.drawable.lada};

    private int[] array_meme = {R.string.meme1, R.string.meme2, R.string.meme3};

    private int[] array_che = {R.string.xz1, R.string.xz2, R.string.xz3};
    private int[] array_image_che = {R.drawable.che, R.drawable.che, R.drawable.che};

    private TextView text_content;
    private ImageView iContent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);
        text_content = findViewById(R.id.text_main_content);
        iContent = findViewById(R.id.imageContent);
        reciveIntent();
    }

    private void reciveIntent() {
        Intent i = getIntent();
        if (i != null) {
            category = i.getIntExtra("category", 0);
            position = i.getIntExtra("position", 0);
        }
        switch (category) {
            case 0:
                iContent.setImageResource(array_image_car[position]);
                text_content.setText(array_car[position]);
                break;
            case 1:
                text_content.setText(array_meme[position]);
                break;
            case 2:
                text_content.setText(array_che[position]);
                iContent.setImageResource(array_image_che[position]);
                break;
        }
    }
}
