package com.cookandroid.start;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    CheckBox check1, check2;
    RadioGroup radioGroup;
    ImageView imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_radio_image);


        check1 = (CheckBox) findViewById(R.id.checkBox1);
        check2 = (CheckBox) findViewById(R.id.checkBox2);

        check1.setOnCheckedChangeListener(mCheckListner);
        check2.setOnCheckedChangeListener(mCheckListner);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.sample);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.sample2);

        radioGroup = (RadioGroup) findViewById(R.id.rGroup);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                StringBuilder mStr = new StringBuilder();

                if(radioGroup.getCheckedRadioButtonId() == R.id.radioButton1){
                    mStr.append("radioButton1 selected");
                    imageView.setImageResource(R.drawable.sample);
                }
                else{
                    mStr.append("radioButton2 selected");
                    imageView.setImageResource(R.drawable.sample2);
                }
                Toast.makeText(getApplicationContext(),mStr,Toast.LENGTH_SHORT).show();
            }
        });
    }

    CompoundButton.OnCheckedChangeListener mCheckListner = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            StringBuilder mStr = new StringBuilder();

            if(buttonView.getId() == R.id.checkBox1)
                mStr.append(check1.getText().toString());
            else
                mStr.append(check2.getText().toString());

            if(isChecked)
                mStr.append(" " + "checked");
            else
                mStr.append(" " + "Unchecked");

            Toast.makeText(getApplicationContext(), mStr,Toast.LENGTH_SHORT).show();
        }
    };
}
