package com.ayush.steganography;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class morse_code extends AppCompatActivity {

    public static void morseToEnglish(String[] code, String morseCode)
    {
        String[] array = morseCode.split(" ");
        System.out.print("Morse code " + morseCode
                + " to English is ");
        // Morse code to English
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < code.length; j++) {
                if (array[i].compareTo(code[j]) == 0) {
                    System.out.print((char)(j + 'a') + " ");
                    break;
                }
            }
        }
    }

    public static void englishToMorse(String[] code, String englishLang, char[] letter)
    {
        System.out.print("Morse code of " + englishLang
                + " is ");
        for (int i = 0; i < englishLang.length(); i++) {
            for (int j = 0; j < letter.length; j++) {
                if (englishLang.charAt(i) == letter[j]) {
                    System.out.print(code[j] + " ");
                    break;
                }
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morse_code);

        EditText mEdit = (EditText)findViewById(R.id.input_morse_Text_View);
        EditText mEdit1 = (EditText)findViewById(R.id.output_morse_Text_View);
        Button Encode_button = (Button) findViewById(R.id.Encode_button_morse);
        Button Decode_button = (Button) findViewById(R.id.Decode_button_morse);

        Encode_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mEdit.getText().toString();

                char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                        'g', 'h', 'i', 'j', 'k', 'l',
                        'm', 'n', 'o', 'p', 'q', 'r',
                        's', 't', 'u', 'v', 'w', 'x',
                        'y', 'z', '1', '2', '3', '4',
                        '5', '6', '7', '8', '9', '0' };
                // Morse code by indexing
                String[] code
                        = { ".-",   "-...", "-.-.", "-..",  ".",
                        "..-.", "--.",  "....", "..",   ".---",
                        "-.-",  ".-..", "--",   "-.",   "---",
                        ".--.", "--.-", ".-.",  "...",  "-",
                        "..-",  "...-", ".--",  "-..-", "-.--",
                        "--..", "|" };

                englishToMorse(code, text, letter);



            }
        });

        Decode_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mEdit.getText().toString();

                char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                        'g', 'h', 'i', 'j', 'k', 'l',
                        'm', 'n', 'o', 'p', 'q', 'r',
                        's', 't', 'u', 'v', 'w', 'x',
                        'y', 'z', '1', '2', '3', '4',
                        '5', '6', '7', '8', '9', '0' };

                String[] code
                        = { ".-",   "-...", "-.-.", "-..",  ".",
                        "..-.", "--.",  "....", "..",   ".---",
                        "-.-",  ".-..", "--",   "-.",   "---",
                        ".--.", "--.-", ".-.",  "...",  "-",
                        "..-",  "...-", ".--",  "-..-", "-.--",
                        "--..", "|" };

                morseToEnglish(code, text);



            }
        });
    }
}