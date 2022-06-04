package com.example.test2;


import androidx.appcompat.app.AppCompatActivity;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private SharedPreferences pref;
    private String key_count = "count";
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        pref = getSharedPreferences("Share", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        count = pref.getInt(key_count, 0);
        editor.putInt(key_count, ++count);
        editor.apply();
        if (count % 3 == 0){
            Toast.makeText(MainActivity.this, "Вот это да", Toast.LENGTH_LONG).show();
        }
    }
}