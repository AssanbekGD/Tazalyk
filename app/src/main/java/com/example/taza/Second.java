package com.example.taza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Second extends AppCompatActivity  implements View.OnClickListener {

    Button regb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        regb2 = (Button) findViewById(R.id.regb2);
        regb2.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.regb2:
                Intent intent = new Intent(this,Map.class );
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}