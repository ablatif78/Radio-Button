package com.example.coverterradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputEdittext;
    RadioGroup myradiogroup;
    TextView outputview;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputEdittext=findViewById(R.id.inputEditText);
        myradiogroup=findViewById(R.id.radiogroupid);
        outputview=findViewById(R.id.output);


    }

    public void converterFunction(View view) {
        double inputvalue=Double.parseDouble(inputEdittext.getText().toString());
       int radiobtnid= myradiogroup.getCheckedRadioButtonId();
       if (radiobtnid==R.id.bdttousd){
           //BDT to USD
           result=inputvalue*.012;
       }
       else if (radiobtnid==R.id.usdtobdt) {
            //USD to BDT
            result =inputvalue*84.80;
        }

       else {
            result=inputvalue*0.0099;
        }


        outputview.setText(""+result);
    }


}