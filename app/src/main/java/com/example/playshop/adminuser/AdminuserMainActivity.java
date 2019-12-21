package com.example.playshop.adminuser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.playshop.MainActivity;
import com.example.playshop.R;
import com.example.playshop.admin.AdminMainActivity;
import com.example.playshop.admin.StockInputActivity;
import com.example.playshop.our.PlayManageActivity;

import java.lang.reflect.Member;

public class AdminuserMainActivity extends AppCompatActivity {
    Button wjcz,wjgh,hytj,hyxxcx,hyxxsc,jbzq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminuser_main);
        ini();
    }
    void ini(){
        wjcz=findViewById(R.id.wjcz);
        wjgh=findViewById(R.id.wjgh);
        hytj=findViewById(R.id.hytj);
        hyxxcx=findViewById(R.id.hyxxcx);
        hyxxsc=findViewById(R.id.hyxxsc);
        jbzq=findViewById(R.id.jbzq);
        wjcz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //玩具出租
                Intent intent = new Intent();
                intent.setClass(AdminuserMainActivity.this, PlayRentalActivity.class);
                startActivity(intent);
            }
        });
        wjgh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //玩具归还
                Intent intent = new Intent();
                intent.setClass(AdminuserMainActivity.this, ToyReturnActivity.class);
                startActivity(intent);
            }
        });
        hytj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //会员添加
                Intent intent = new Intent();
                intent.setClass(AdminuserMainActivity.this, MemberAddActivity.class);
                startActivity(intent);
            }
        });
        hyxxcx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //会员查询
                Intent intent = new Intent();
                intent.setClass(AdminuserMainActivity.this, MemberQueryActivity.class);
                startActivity(intent);
            }
        });
        hyxxsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //会员删除
                Intent intent = new Intent();
                intent.setClass(AdminuserMainActivity.this, MemberDelActivity.class);
                startActivity(intent);
            }
        });
        jbzq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //交班转清
                Intent intent = new Intent();
                intent.setClass(AdminuserMainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
