package com.example.lab1_aliaalesya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    Button submitButton;
    EditText etName;
    Button resetButton;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = (TextView) findViewById(R.id.textView);
        submitButton = (Button) findViewById(R.id.button);
        etName = (EditText) findViewById(R.id.editTextText);
        resetButton = (Button) findViewById(R.id.button2);

    }
    public void displayText(View view){
        String text = etName.getText().toString();
        tvMessage.setText("Welcome!" + text);

        Toast toast = Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void resetText(View view) {
        etName.getText().clear(); // Clear the EditText
        tvMessage.setText("Name has been reset");
    }

    public void testingFunction(View view){
        //this is new function
    }
}