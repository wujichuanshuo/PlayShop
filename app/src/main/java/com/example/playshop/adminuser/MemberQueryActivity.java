package com.example.playshop.adminuser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.playshop.R;
import com.example.playshop.retrofit.Rs;

public class MemberQueryActivity extends AppCompatActivity {
    Button qr;
    public EditText bh,xm,dz,dh,yj,sj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_query);
        ini();
    }
    void ini(){
        qr=findViewById(R.id.qr);
        xm=findViewById(R.id.xm);
        dz=findViewById(R.id.dz);
        dh=findViewById(R.id.dh);
        yj=findViewById(R.id.yj);
        bh=findViewById(R.id.bh);
        sj=findViewById(R.id.sj);
        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Rs rs=new Rs();
                rs.MemberQuery(bh.getText().toString(),MemberQueryActivity.this);
            }
        });
    }
}
