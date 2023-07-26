package com.cookandroid.unicall;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT
        );

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout,params);


        TextView textView = new TextView(this);
        textView.setText("Code TextView");
        textView.setTextSize(50);
        textView.setBackgroundColor(Color.YELLOW);
        baseLayout.addView(textView);
        textView.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;
        textView.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;

        Button button = new Button(this);
        button.setText("Code Button");
        button.setBackgroundColor(Color.GRAY);
        baseLayout.addView(button);
        button.getLayoutParams().width=(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                300,getResources().getDisplayMetrics());
        button.getLayoutParams().height=LinearLayout.LayoutParams.WRAP_CONTENT;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "코드 버튼", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
