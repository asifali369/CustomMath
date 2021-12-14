package com.example.myutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActionPlus extends AppCompatActivity {
    private Button btn_result;
    private EditText edt_first_number, edt_second_number;
    int first_number, second_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_plus);
        BindViews();
        initClickListener();
    }

    private void BindViews() {
        btn_result = findViewById(R.id.btn_result);
        edt_first_number = findViewById(R.id.edt_first_number);
        edt_second_number = findViewById(R.id.edt_second_number);
    }

    private void initClickListener() {
        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt_first_number.getText().toString().trim().isEmpty()) {
                    edt_first_number.setError("Enter First Number");
                }
                if (edt_second_number.getText().toString().trim().isEmpty()) {
                    edt_second_number.setError("Enter Second Number");
                }
                if (TextUtils.isDigitsOnly(edt_first_number.getText()) &&
                        TextUtils.isDigitsOnly(edt_second_number.getText())) {
                    try {
                        first_number = Integer.parseInt(edt_first_number.getText().toString().trim());
                        second_number = Integer.parseInt(edt_second_number.getText().toString().trim());
                        MyMath.addition(first_number, second_number);
                        finish();
                        Toast.makeText(ActionPlus.this, ""+MyMath.addition(first_number, second_number), Toast.LENGTH_SHORT).show();
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}