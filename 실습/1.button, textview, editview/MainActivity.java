package com.cookandroid.start;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button  button1, button2, button3, button4, button5;
    TextView textView;
    EditText editText1,editText2;

    public void onClick(View v){
        Toast.makeText(getApplicationContext(), "버튼3 클릭",
                Toast.LENGTH_SHORT).show();
    }

    View.OnClickListener buttonClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "버튼4 클릭",
                    Toast.LENGTH_SHORT).show();
        }
    };

    class MyonClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "버튼5 클릭",
                    Toast.LENGTH_SHORT).show();
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);

        textView = (TextView)findViewById(R.id.textView);
        textView.setText("This is Textview");

        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "버튼1 클릭",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(this);
        button4.setOnClickListener(buttonClick);
        button5.setOnClickListener(new MyonClick());
    }

    public void button2Clicked(View view) {
        String str;
        Button btn = (Button) view;
        str = btn.getText().toString() + "클릭";

        String num1 = editText1.getText().toString();
        String num2 = editText2.getText().toString();

        Integer result = Integer.parseInt(num1) + Integer.parseInt(num2);
        textView.setText(" Result : " + result.toString());

        //textView.setText(textView.getText().toString() + str);

        Toast.makeText(getApplicationContext(), str,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}
