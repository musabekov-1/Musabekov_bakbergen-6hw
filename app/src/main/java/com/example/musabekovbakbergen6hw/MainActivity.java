package com.example.musabekovbakbergen6hw;import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText password = findViewById(R.id.password);
        EditText gmail = findViewById(R.id.gmail);
        Button button = findViewById(R.id.button);
        Button button1 = findViewById(R.id.button1);
        TextView textView2 = findViewById(R.id.textView4);
        TextView textView3 = findViewById(R.id.textView);
        TextView textView4 = findViewById(R.id.textView2);
        TextView textView5 = findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gmail.getText().toString().equals("admin@mail.ru") && password.getText().toString().equals("admin")){
                    gmail.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                    button1.setVisibility(View.GONE);
                    textView2.setVisibility(View.GONE);
                    textView4.setVisibility(View.GONE);
                    textView5.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегестрировались", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Не правильный пароль или логин", Toast.LENGTH_SHORT).show();
                }
            }
        });

        gmail.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (gmail.getText().toString().isEmpty()){
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                }else{
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }
            }
        });
        password.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (password.getText().toString().isEmpty()){
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                }else{
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }
            }
        });

    }
}