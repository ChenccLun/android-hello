package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mIsbnEt = null;
    private Button mSearchBtn = null;
    private TextView mIsbnTxv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addbook);

        //get component
        mIsbnEt =findViewById(R.id.editText);
        mSearchBtn=findViewById(R.id.button);
        mIsbnTxv = findViewById(R.id.receivedView);

        //bind event
        mSearchBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //get isbn
                String isbn=mIsbnEt.getText().toString();
                // search
                //display
                mIsbnTxv.setText(isbn);
            }
        });
    }
}
