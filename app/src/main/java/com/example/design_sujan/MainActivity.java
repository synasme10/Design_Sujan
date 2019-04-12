package com.example.design_sujan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
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

        final int[] vehicle_no = {0};

        Btncar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(Etmake.getText().toString()))
                {
                    Etmake.setError("Enter Manufacture Name");
                    Etmake.requestFocus();
                    return;
                }
                else if(TextUtils.isEmpty(Etyear.getText().toString()))
                {
                    Etyear.setError("Enter Year of manufacture");
                    Etyear.requestFocus();
                    return;
                }
                else if(TextUtils.isEmpty(Etcolor.getText().toString()))
                {
                    Etcolor.setError("Enter Color");
                    Etcolor.requestFocus();
                    return;
                }
                else if (TextUtils.isEmpty(Etpurchase.getText().toString()))
                {
                    Etpurchase.setError("Enter Purchase Price");
                    Etpurchase.requestFocus();
                    return;
                }
                else if (TextUtils.isEmpty(Etenginesize.getText().toString()))
                {
                    Etenginesize.setError("Enter Engine Size");
                    Etenginesize.requestFocus();
                    return;
                }
                else
                {
                String make,year,color,purchase,enginesize;

                vehicle_no[0] = vehicle_no[0] +1;
                make=Etmake.getText().toString();
                year=Etyear.getText().toString();
                color=Etcolor.getText().toString();
                purchase=Etpurchase.getText().toString();
                enginesize=Etenginesize.getText().toString();
                DesignVehicle_Sujan design=new DesignVehicle_Sujan(vehicle_no[0],make,year,color,purchase,enginesize);

                Etresult.setText(Etresult.getText()+design.Design());
                Etmake.setText("");
                Etyear.setText("");
                Etcolor.setText("");
                Etpurchase.setText("");
                Etenginesize.setText("");
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(Btncar.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);
            }}
        });

        Btndiesel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(Etmake.getText().toString()))
                {
                    Etmake.setError("Enter Manufacture Name");
                    Etmake.requestFocus();
                    return;
                }
                else if(TextUtils.isEmpty(Etyear.getText().toString()))
                {
                    Etyear.setError("Enter Year of manufacture");
                    Etyear.requestFocus();
                    return;
                }
                else if(TextUtils.isEmpty(Etcolor.getText().toString()))
                {
                    Etcolor.setError("Enter Color");
                    Etcolor.requestFocus();
                    return;
                }
                else if (TextUtils.isEmpty(Etpurchase.getText().toString()))
                {
                    Etpurchase.setError("Enter Purchase Price");
                    Etpurchase.requestFocus();
                    return;
                }
                else if (TextUtils.isEmpty(Etenginesize.getText().toString()))
                {
                    Etenginesize.setError("Enter Engine Size");
                    Etenginesize.requestFocus();
                    return;
                }
                else
                {
                String make,year,color,purchase,enginesize;
                vehicle_no[0] = vehicle_no[0] +1;
                make=Etmake.getText().toString();
                year=Etyear.getText().toString();
                color=Etcolor.getText().toString();
                purchase=Etpurchase.getText().toString();
                enginesize=Etenginesize.getText().toString();
                DesignVehicle_Sujan design=new DesignVehicle_Sujan(vehicle_no[0],make,year,color,purchase,enginesize);

                Etresult.setText(Etresult.getText()+design.Design());
                Etmake.setText("");
                Etyear.setText("");
                Etcolor.setText("");
                Etpurchase.setText("");
                Etenginesize.setText("");
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(Btndiesel.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);
            }}
        });
    }
}
