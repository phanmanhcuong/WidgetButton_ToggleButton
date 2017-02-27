package com.example.cuongphan.widgetbutton_togglebutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);
    }

    protected void changeColor(int color){
        TextView mTextView = (TextView)findViewById(R.id.textview);
        mTextView.setBackgroundColor(color);
    }

    protected void changeTextViewColor(View clickedToggleButton){
        ToggleButton tglbtn = (ToggleButton)clickedToggleButton;
        String color = tglbtn.getText().toString();
        if (tglbtn.isChecked()){
            status = "ON";
        }
        switch (color){
            case "Red":
                changeColor(Color.RED);
                break;
            case "Yellow":
                changeColor(Color.YELLOW);
                break;
            case "Blue":
                changeColor(Color.BLUE);
                break;
            case
            default:
                changeColor(Color.BLACK);
                break;
        }
    }
}
