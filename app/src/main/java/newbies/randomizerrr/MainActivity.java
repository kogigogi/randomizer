package newbies.randomizerrr;

import android.widget.TextView;package com.example.pc.myapplication;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int myNumber;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
    public void newDraw(View view)
    {
        Random rand = new Random();
        myNumber = rand.nextInt((6-0)+1)+0;
        TextView myText = (TextView)findViewById(R.id.text_random);
        myText.setText(myNumber);

    }

