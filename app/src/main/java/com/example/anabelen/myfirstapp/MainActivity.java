package com.example.anabelen.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnHail;
    private Button btnReset;
    private TextView hail;
    private EditText name;
    private EditText surname;
    private CheckBox check;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
    }

    public void setupView(){
        name=findViewById(R.id.txtName);
        surname=findViewById(R.id.txtLastName);
        btnHail =findViewById(R.id.btnHail);
        btnReset=findViewById(R.id.btnReset);
        check=findViewById(R.id.check);
        hail=findViewById(R.id.hail);
        btnHail.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (btnHail.getId()==v.getId()) {
            if (check.isChecked()) {
                hail.setText(getString(R.string.main_hailMessage) +" "+ name.getText() +" "+ surname.getText());
            }else{
                hail.setText(getString(R.string.main_notPoliteMessage) +" "+ name.getText() +" "+ surname.getText());
            }
        }else{
            hail.setText(R.string.main_voidMesagge);
        }
    }
}
