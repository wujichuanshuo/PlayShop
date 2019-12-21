package com.example.playshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.playshop.admin.AdminMainActivity;
import com.example.playshop.adminuser.AdminuserMainActivity;
import com.example.playshop.retrofit.Rs;


public class MainActivity extends AppCompatActivity {

    public int rt;
    public EditText usernames,passwords;
    private Button login;
    private String username,password;
    public int re;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ini();
    }
    public Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 1:
                    logins();
                    break;
                default:
                    break;
            }
        }
    };
    private void ini(){
        usernames=findViewById(R.id.username);
        passwords=findViewById(R.id.password);
        login=findViewById(R.id.login);
        final Rs rs=new Rs();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username=usernames.getText().toString();
                password=passwords.getText().toString();
                rs.Login(username,password,MainActivity.this);
                Bundle bundle = new Bundle();
                Message message = Message.obtain();
                message.setData(bundle);
                message.what =1;
                mHandler.sendMessage(message);
        }});
        //rs.Login("luo","123456",this);
    }
    private void logins(){
        switch (rt){
            case 1: {
                Toast ts = Toast.makeText(getBaseContext(), "您是超级管理员", Toast.LENGTH_LONG);
                ts.show();
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, AdminMainActivity.class);
                startActivity(intent);
                break;
            }
            case 2:
            {
                Toast ts = Toast.makeText(getBaseContext(),"您是管理员",Toast.LENGTH_LONG);
                ts.show();
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, AdminuserMainActivity.class);
                startActivity(intent);
                break;
            }
            case 3:
            {
                Toast ts = Toast.makeText(getBaseContext(),"密码错误，请核对密码后重新输入",Toast.LENGTH_LONG);
                ts.show();
                break;
            }
            case 4:
                {
                Toast ts = Toast.makeText(getBaseContext(),"无此用户",Toast.LENGTH_LONG);
                ts.show();
                break;
            }
                default:
                    break;
        }

    }
}
