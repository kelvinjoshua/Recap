package com.example.recapped;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.recapped.Bio.Data;
import com.example.recapped.databinding.Activity2Binding;
import com.google.android.material.snackbar.Snackbar;

import static java.lang.String.format;

public class MainActivity extends AppCompatActivity {
    private Activity2Binding binding;
    public final Data data = new Data();//final to be acceessible in show data method
    //public Button done;
    //public EditText hobbies;
    //public TextView shownHobbies;
    public static  final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity2);
        data.setName("Kelvin joshua");//bind the data
        binding.setData(data); //bind data to the view
        binding.submit.setOnClickListener(this::showData);

        /*setContentView(R.layout.activity2);
        done = findViewById(R.id.submit);
        hobbies = findViewById(R.id.hobbies);
        shownHobbies = findViewById(R.id.shownText);*/
    }

    public void showData(View view) {

        data.setHobbies(format("Your hobbies are: %s", binding.hobbies.getText().toString().trim()));
        //String formatting .format(arguments)
       // shownHobbies.setText(format("Your hobbies are: %s", hobbies.getText().toString().trim()));
        Snackbar.make(binding.submit, R.string.snack,Snackbar.LENGTH_LONG).setAction("MORE", v -> Log.d(TAG, "Snackbar works effectively")).show();
        binding.invalidateAll();
        // toggle visibility
        binding.hobbies.setVisibility(View.VISIBLE);
        //Hide keyboard after typing - cast to store it in this object
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        //From the view that triggered the keyboard popup signal it to close the keyboard.
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);

        // Change text color - context compatibility for deprecated getResource()
        binding.hobbies.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.white));
    }
}