package ru.samsung.itschool.mdev.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ComeBackActivity extends AppCompatActivity {
    private EditText et;
    private Button bt;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_come_back);
        et = findViewById(R.id.et);
        bt = findViewById(R.id.bt);
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.putExtra("et",et.getText().toString());
                setResult(RESULT_OK, i);
                finish();
            }
        };
        bt.setOnClickListener(listener);
    }

}