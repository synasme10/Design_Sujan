package com.example.design_sujan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Etmake,Etyear,Etcolor,Etpurchase,Etenginesize,Etresult;
    Button Btncar,Btndiesel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Etmake=findViewById(R.id.Etmake);
        Etyear=findViewById(R.id.Etyear);
        Etcolor=findViewById(R.id.Etcolor);
        Etpurchase=findViewById(R.id.Etpurchase);
        Etenginesize=findViewById(R.id.Etenginesize);
        Etresult=findViewById(R.id.Etresult);
        Btncar=findViewById(R.id.Btncar);
        Btndiesel=findViewById(R.id.Btndiesel);

        final int[] count = {0};
        Btncar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String make,year,color,purchase,enginesize,result;

                count[0] = count[0] +1;
                make=Etmake.getText().toString();
                year=Etyear.getText().toString();
                color=Etcolor.getText().toString();
                purchase=Etpurchase.getText().toString();
                enginesize=Etenginesize.getText().toString();

                Etresult.setText(Etresult.getText()+"The vehicle no is:"+ count[0] +make+year+color+purchase+enginesize);
            }
        });

        Btndiesel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String make,year,color,purchase,enginesize,result;

                make=Etmake.getText().toString();
                year=Etyear.getText().toString();
                color=Etcolor.getText().toString();
                purchase=Etpurchase.getText().toString();
                enginesize=Etenginesize.getText().toString();

                Etresult.setText(""+make+year+color+purchase+enginesize);
            }
        });
    }
}
