package com.example.playshop.adminuser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.playshop.R;
import com.example.playshop.retrofit.Rs;

public class ToyReturnActivity extends AppCompatActivity {
    Button qr;
    EditText bh,gk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toy_return);
        ini();
    }
    void ini(){
        Rs rs=new Rs();
        qr=findViewById(R.id.qr);
        bh=findViewById(R.id.bh);
        gk=findViewById(R.id.gk);
        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Rs rs=new Rs();
                rs.ToyReturn(bh.getText().toString(),gk.getText().toString(),ToyReturnActivity.this);
            }
        });
    }
}
