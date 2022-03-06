package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView c1 = findViewById(R.id.textView);
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);

        b1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                float currentSize = c1.getTextSize();
                if(currentSize>=30){
                    c1.setTextSize(currentSize-10);
                    Toast.makeText(MainActivity.this,"Font size changed",Toast.LENGTH_LONG).show();

                }
                else{
                    c1.setTextSize(currentSize+2);
                    Toast.makeText(MainActivity.this,"Font size changed",Toast.LENGTH_LONG).show();
                }

            }

        });
        b2.setOnClickListener(new OnClickListener(){

            int flag=0;
            @Override

            public void onClick(View view) {


                switch(flag)
                {
                    case 0:
                        c1.setTextColor(Color.RED);
                        flag++;
                        Toast.makeText(MainActivity.this,"Font color changed",Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        c1.setTextColor(Color.GREEN);
                        flag++;
                        Toast.makeText(MainActivity.this,"Font color changed",Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        c1.setTextColor(Color.BLUE);
                        flag=0;
                        Toast.makeText(MainActivity.this,"Font color changed",Toast.LENGTH_LONG).show();
                        break;

                }




            }
        });
        b3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                View someView = findViewById(R.id.screen);
                View root = someView.getRootView();
                root.setBackgroundColor(Color.parseColor("#000000"));

            }
        });




    }
}
