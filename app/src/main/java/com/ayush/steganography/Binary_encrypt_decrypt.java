package com.ayush.steganography;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.charset.StandardCharsets;

public class Binary_encrypt_decrypt extends AppCompatActivity {
    public String output_stream;

    private static void getBits(StringBuilder sb, byte b) {
        for (int i = 0; i < 8; i++) {
            sb.append((b & 128) == 0 ? 0 : 1);
            b <<= 1;
        }
        sb.append(' ');
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_encrypt_decrypt);

        EditText mEdit = (EditText)findViewById(R.id.input_Binary_Text_View);
        EditText mEdit1 = (EditText)findViewById(R.id.output_Binary_Text_View);
        Button Encode_button = (Button) findViewById(R.id.Encode_button_binary);
        Button Decode_button = (Button) findViewById(R.id.Decode_button_binary);

        Encode_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = mEdit.getText().toString();
                byte[] bytes = s.getBytes();
                StringBuilder sb = new StringBuilder();
                for (byte b : bytes) {
                    getBits(sb, b);
                }
                output_stream = sb.toString().trim();
                mEdit1.setText(output_stream, TextView.BufferType.EDITABLE);

            }
        });

        Decode_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mEdit.getText().toString();
                int charCode = Integer.parseInt(text,2);
                output_stream = new Character((char) charCode).toString();
                mEdit1.setText(output_stream, TextView.BufferType.EDITABLE);
            }
        });
    }
}