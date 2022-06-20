package com.ayush.steganography;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ascii_encrypt_decrypt extends AppCompatActivity {

    String input_ascii;
    EditText input1_ascii;
    String output_ascii;
    EditText output1_ascii;

    public static void input_new(int s)
    {
        System.out.println("this is my new function");
        System.out.println("to check ijt");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ascii_encrypt_decrypt);

        input1_ascii = (EditText) findViewById(R.id.editTextTextPersonName3);
        Button encrypt = findViewById(R.id.Asicii_encrypt);
        encrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_ascii = input1_ascii.getText().toString();

            }
        });
;

    }
}