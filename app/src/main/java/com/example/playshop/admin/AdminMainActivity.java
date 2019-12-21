package com.example.playshop.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.playshop.MainActivity;
import com.example.playshop.R;
import com.example.playshop.adminuser.AdminuserMainActivity;
import com.example.playshop.our.PlayManageActivity;
import com.example.playshop.our.PlayQueryActivity;

public class AdminMainActivity extends AppCompatActivity {

    Button jhlr,glytj,jbzq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main);
        ini();
    }
    void ini(){
        jhlr=findViewById(R.id.jhlr);

        glytj=findViewById(R.id.glytj);
        jbzq=findViewById(R.id.jbzq);
        jhlr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(AdminMainActivity.this, StockInputActivity.class);
                startActivity(intent);
            }
        });
        glytj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(AdminMainActivity.this, AdminuserAddActivity.class);
                startActivity(intent);
            }
        });
        jbzq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(AdminMainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
