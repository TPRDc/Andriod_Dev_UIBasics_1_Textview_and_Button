package com.example.uibasics;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Random random =new Random();
    public void onHelloBtnClick(View view) {
        int r=random.nextInt(200) , g=random.nextInt(200) , b=random.nextInt(200);

        TextView txtHello =findViewById(R.id.txtHello);
        TextView txtShape =findViewById(R.id.txtShape);
        Button btnSayHello =findViewById(R.id.btnSayHello);

        for (int i=0; i<=3; i++) {
            txtHello.setTextColor(Color.rgb(r,g,b));
            txtShape.setBackgroundColor(Color.rgb(r,g,b));
            btnSayHello.setBackgroundColor(Color.rgb(r, g, b));
        }
    }
}