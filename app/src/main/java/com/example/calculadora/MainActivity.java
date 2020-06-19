package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    private Button Key_Pad0,Key_Pad1, Key_Pad2,Key_Pad3,Key_Pad4,Key_Pad5,Key_Pad6,Key_Pad7,Key_Pad8,Key_Pad9;
    private Button Key_PadSubstact, Key_PadSum, Key_PadDivision, Key_PadMultiply, Key_PadClear, Key_PadEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado= findViewById(solucion)
    }
}
