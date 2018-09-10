package com.codecool.zibi.superchargetestapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.codecool.zibi.superchargetestapp.R;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.codecool.zibi.superchargetestapp.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void searchDB(View view) {
        Intent intent = new Intent(this, SearchMovieDBActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
