package com.ayush.steganography;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Ascii_encrypt_decrypt extends AppCompatActivity {
    String output_stream;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ascii_encrypt_decrypt);


        EditText mEdit = (EditText)findViewById(R.id.input_ascii_Text_View);
        EditText mEdit1 = (EditText)findViewById(R.id.output_ascii_Text_View);
        Button Encode_button = (Button) findViewById(R.id.Encode_button);
        Encode_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mEdit.getText().toString();
                byte[] bytes = new byte[0];
                try {
                    bytes = text.getBytes("US-ASCII");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                output_stream = Arrays.toString(bytes);
                mEdit1.setText(output_stream, TextView.BufferType.EDITABLE);


            }

        });
        Button Decode_button = (Button) findViewById(R.id.Decode_button);
        Decode_button.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {
                String text = mEdit.getText().toString();
                String[] tokens = text.split(",");
                int[] val = Arrays.stream(tokens).mapToInt(Integer::parseInt).toArray();
                char[] output1 = new char[val.length];
                for(int i = 0 ; i < val.length;i++)
                {
                    output1[i] = (char)val[i];
                }
                String str = new String();
                String output2 = str.copyValueOf(output1);



                mEdit1.setText(output2, TextView.BufferType.EDITABLE);

            }
        });


    }
}
