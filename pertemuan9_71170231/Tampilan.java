package com.example.pertemuan9_71170231;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Tampilan extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_tampilan);

        SharedPreferences preferences = getSharedPreferences("MYPREF",MODE_PRIVATE);
        String tampilan = preferences.getString("tampilan","");

        EditText infoTampilan= (EditText) findViewById(R.id.editTextTextPersonName);
        infoTampilan.setText(tampilan);
    }
}
