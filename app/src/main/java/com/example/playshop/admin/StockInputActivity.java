package com.example.playshop.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.playshop.R;
import com.example.playshop.retrofit.Rs;

public class StockInputActivity extends AppCompatActivity {
    EditText wjjg,wjmc;
    Button qr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_input);
        ini();
    }
    void ini(){
        wjmc=findViewById(R.id.wjmc);
        wjjg=findViewById(R.id.wjjg);
        qr=findViewById(R.id.qr);
        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Rs rs=new Rs();
                rs.StockInput(wjmc.getText().toString(),wjjg.getText().toString(),StockInputActivity.this);
            }
        });
    }
}
