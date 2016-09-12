package com.corp.zulham.hitungluas;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.etPanjang)
    EditText etPanjang;

    @BindView(R.id.etLebar)
    EditText etLebar;

    @BindView(R.id.tvLuas)
    TextView tvLuas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.bHitung) void HitungLuas(){
        String panjang = etPanjang.getText().toString().trim();
        String lebar = etLebar.getText().toString().trim();

        double p = Double.parseDouble(panjang);
        double l = Double.parseDouble(lebar);

        double luas = p * l;

        tvLuas.setText("Luas : "+luas);
    }
}
