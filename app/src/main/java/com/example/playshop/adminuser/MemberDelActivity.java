package com.example.playshop.adminuser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.playshop.R;
import com.example.playshop.retrofit.Rs;

public class MemberDelActivity extends AppCompatActivity {
    Button qr;
    EditText bh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_del);
        ini();
    }
    void ini(){
        qr=findViewById(R.id.qr);
        bh=findViewById(R.id.bh);
        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Rs rs=new Rs();
                rs.MemberDel(bh.getText().toString(),MemberDelActivity.this);
            }
        });
    }
}
