package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Description extends AppCompatActivity {
TextView tv;
ImageView img;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        tv=findViewById(R.id.textView);
        img=findViewById(R.id.imageView);
        Bundle extras=getIntent().getExtras();
        String element=extras.getString("decription");
       // Toast.makeText(Description.this,element,Toast.LENGTH_LONG).show();
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Description.this,MainActivity.class);
                i2.putExtra("ksibi","ksibi");
                startActivity(i2);
            }
        });

    if(element.equals("Word 0")){
            tv.setText("the word is dskjd skjdksjd");
        Drawable myDrawable = getResources().getDrawable(R.drawable.pasta);
            img.setImageDrawable(myDrawable);
        }

    }
}