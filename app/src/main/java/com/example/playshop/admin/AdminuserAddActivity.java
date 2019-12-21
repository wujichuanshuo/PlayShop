package com.example.playshop.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.playshop.R;
import com.example.playshop.retrofit.Rs;

public class AdminuserAddActivity extends AppCompatActivity {
    EditText yhm,yhmm;
    Button qr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminuser_add);
        ini();
    }
    void ini(){
        yhm=findViewById(R.id.yhm);
        yhmm=findViewById(R.id.yhmm);
        qr=findViewById(R.id.qr);
        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Rs rs=new Rs();
                rs.AdminuserAdd(yhm.getText().toString(),yhmm.getText().toString(),AdminuserAddActivity.this);
            }
        });
    }
}
