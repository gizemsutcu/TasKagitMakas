package com.example.gizze.taskagitmakas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView t3;
    TextView t4;
    TextView t5;
    Button b2;
    Button b3;
    Button b4;
    int kullanici1=0;
    int kullanici2=0;
    String kullanici1secimi;
    String kullanici2secimi;
    String yazi1;
    String yazi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i=getIntent();
        yazi1=i.getStringExtra("mesaj1");
        t3 = (TextView) findViewById(R.id.textView3);
        t3.setText(yazi1);
        yazi2=i.getStringExtra("mesaj2");
        t4 = (TextView) findViewById(R.id.textView4);
        t4.setText(yazi2);
        t5 = (TextView) findViewById(R.id.textView5);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        ilksecim();

    }
    void ilksecim () {
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kullanici1secimi="tas";
                ikincisecim();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kullanici1secimi="kagit";
                ikincisecim();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kullanici1secimi="makas";
                ikincisecim();
            }
        });
    }
    void ikincisecim(){
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kullanici2secimi="tas";
                sonuc();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kullanici2secimi="kagit";
                sonuc();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kullanici2secimi="makas";
                sonuc();
            }
        });
    }
    void sonuc(){
        if(kullanici1secimi=="tas"&&kullanici2secimi=="tas"){
            t5.setText("berabere");
            t3.setText(Integer.toString(kullanici1));
            t4.setText(Integer.toString(kullanici2));
            ilksecim();
        }
        if(kullanici1secimi=="tas"&&kullanici2secimi=="makas"){
            kullanici1++;
            t5.setText(yazi1+" "+"kazandı");
            t3.setText(Integer.toString(kullanici1));
            t4.setText(Integer.toString(kullanici2));
            ilksecim();
        }
        if(kullanici1secimi=="tas"&&kullanici2secimi=="kagit"){
            kullanici2++;
            t5.setText(yazi2+" "+"kazandı");
            t3.setText(Integer.toString(kullanici1));
            t4.setText(Integer.toString(kullanici2));
            ilksecim();
        }
        if(kullanici1secimi=="makas"&&kullanici2secimi=="kagit"){
            kullanici1++;
            t5.setText(yazi1+" "+"kazandı");
            t3.setText(Integer.toString(kullanici1));
            t4.setText(Integer.toString(kullanici2));
            ilksecim();
        }
        if(kullanici1secimi=="makas"&&kullanici2secimi=="makas"){
            t5.setText("berabere");
            t3.setText(Integer.toString(kullanici1));
            t4.setText(Integer.toString(kullanici2));
            ilksecim();
        }
        if(kullanici1secimi=="makas"&&kullanici2secimi=="tas"){
            kullanici2++;
            t5.setText(yazi2+" "+"kazandı");
            t3.setText(Integer.toString(kullanici1));
            t4.setText(Integer.toString(kullanici2));
            ilksecim();
        }
        if(kullanici1secimi=="kagit"&&kullanici2secimi=="kagit"){
            t5.setText("berabere");
            t3.setText(Integer.toString(kullanici1));
            t4.setText(Integer.toString(kullanici2));
            ilksecim();
        }
        if(kullanici1secimi=="kagit"&&kullanici2secimi=="tas"){
            kullanici1++;
            t5.setText(yazi1+" "+"kazandı");
            t3.setText(Integer.toString(kullanici1));
            t4.setText(Integer.toString(kullanici2));
            ilksecim();
        }
        if(kullanici1secimi=="kagit"&&kullanici2secimi=="makas"){
            kullanici2++;
            t5.setText(yazi2+" "+"kazandı");
            t3.setText(Integer.toString(kullanici1));
            t4.setText(Integer.toString(kullanici2));
            ilksecim();
        }

    }
}





