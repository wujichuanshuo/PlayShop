package com.example.playshop.adminuser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.playshop.R;
import com.example.playshop.retrofit.Rs;

public class PlayRentalActivity extends AppCompatActivity {

    Button qr;
    EditText ts,bh,gk;
    Rs rs=new Rs();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_rental);
        ini();
    }
    void ini(){
        qr=findViewById(R.id.qr);
        ts=findViewById(R.id.ts);
        bh=findViewById(R.id.bh);
        gk=findViewById(R.id.gk);
        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tsS=ts.getText().toString();
                String bhS=bh.getText().toString();
                String gkS=gk.getText().toString();
                rs.PlayRental(bhS,tsS,gkS,PlayRentalActivity.this);
            }
        });
    }
}
