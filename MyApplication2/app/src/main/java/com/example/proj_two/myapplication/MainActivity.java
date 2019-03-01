package com.example.proj_two.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        final EditText name = (EditText)findViewById(R.id.editText);
        final EditText fam = (EditText)findViewById(R.id.editText2);
        final Intent intent = new Intent(this, Main2Activity.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = name.getText().toString();
                String f = fam.getText().toString();
                intent.putExtra("name", n);
                intent.putExtra("fam", f);
                startActivity(intent);
            }
        });
    }
}
