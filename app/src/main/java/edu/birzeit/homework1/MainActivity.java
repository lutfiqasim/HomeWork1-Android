package edu.birzeit.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView scrolable;
    TextView hobyHolder;
    EditText userText;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrolable = findViewById(R.id.biography);
        userText = (EditText) findViewById(R.id.enterHopies);
        hobyHolder = (TextView) findViewById(R.id.showHobbies);
        scrolable.setMovementMethod(new ScrollingMovementMethod());
    }


    public void addHobby(View view) {
        String text = userText.getText().toString();
        hobyHolder.setVisibility(View.VISIBLE);
        hobyHolder.setText(text);
    }
}