package com.example.authencicator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public static final String name = "АдскийКиллер228";
    public static final String password = "Qwerty123";
    public static int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText namee = findViewById(R.id.editTextText);
        EditText pass = findViewById(R.id.editTextTextPassword);
        Button but = findViewById(R.id.button);

        but.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v) {
                String s = namee.getText().toString();
                String s2 = pass.getText().toString();
                if(counter > 0) {
                    if (s.equals(name) && s2.equals(password)) {
                        Toast toast;
                        toast = Toast.makeText(v.getContext(), "Welcome, " + name, Toast.LENGTH_SHORT);
                        toast.show();
                    } else {
                        Toast toast;
                        toast = Toast.makeText(v.getContext(), String.format("Wrong, you have %d attempts left", counter), Toast.LENGTH_SHORT);
                        toast.show();
                        counter--;
                    }
                }
                else{
                    Toast toast;
                    toast = Toast.makeText(v.getContext(), "You have no attempts left", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}