package com.example.taza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Second extends AppCompatActivity  implements View.OnClickListener {

   public Button secb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secb2 =  findViewById(R.id.secb2);
        secb2.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.secb2:
                Intent intent = new Intent(this,Ma.class );
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}