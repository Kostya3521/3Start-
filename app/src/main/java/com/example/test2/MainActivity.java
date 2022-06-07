package com.example.test2;


import androidx.appcompat.app.AppCompatActivity;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences pref = getSharedPreferences("Share", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String key_count = "count";
        int count = pref.getInt(key_count, 0);
        editor.putInt(key_count, ++count);
        editor.apply();
        if (count % 3 == 0){
            Toast.makeText(MainActivity.this, "Вот это да", Toast.LENGTH_LONG).show();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}