package com.example.souilahh.hichem_tp03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
/** guyvgycgygyftygty*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tx   =   (TextView)   findViewById(R.id.message);
        tx.setText("Message   modifié   dans   le   code   Java");
        tx.setText(message);
    }
    private String message= "Bonjour if26";
}
