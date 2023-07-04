package com.example.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);
        HelloListener Listener = new HelloListener();
        btClick.setOnClickListener(Listener);
        Button btAdd_clear = findViewById(R.id.btAdd_clear);
        btAdd_clear.setOnClickListener(Listener);
        Button btClear = findViewById(R.id.btClear);
        btClear.setOnClickListener(Listener);

    }

    private  class HelloListener implements View.OnClickListener{
        @Override
        public  void  onClick(View view) {
            EditText input = findViewById(R.id.etName);
            EditText input2 = findViewById(R.id.etAddress);
            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();
            if (id==R.id.btClick){
                String inputStr = input.getText().toString();
                String inputStr2 = input2.getText().toString();
                output.setText(inputStr2 + "にお住いの" + inputStr +"さん、こんにちは！");
            }
            else if (id==R.id.btClear) {
                input.setText("");
                output.setText("");
            }
            else if (id==R.id.btAdd_clear) {
                input2.setText("");
                output.setText("");
            }
        }
    }
}