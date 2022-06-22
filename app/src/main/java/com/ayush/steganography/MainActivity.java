package com.ayush.steganography;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Image_encode = findViewById(R.id.encode_button);
        Button Image_decode = findViewById(R.id.decode_button);
        Button Ascii_decode = findViewById(R.id.ascii_button);
        Button Binary_decode = findViewById(R.id.binary_button);
        Button Morse_decode = findViewById(R.id.morse);



        Image_encode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Encode.class));
            }
        });

        Image_decode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Decode.class));
            }
        });

        Ascii_decode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Ascii_encrypt_decrypt.class));
            }
        });

        Binary_decode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Binary_encrypt_decrypt.class));
            }
        });

        Morse_decode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), morse_code.class));
            }
        });

    }

}
