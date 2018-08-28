package com.example.safkat.adddoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v7.app.ActionBar;

public class MainActivity extends AppCompatActivity {

    private EditText mName, mDetails,mAppointment, mPhone, mEmail;
    private Button mSelectedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialization();

      ActionBar actionBar = getSupportActionBar();

        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.app_icon);

        mSelectedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name= mName.getText().toString();
                String details = mDetails.getText().toString();
                String appointment = mAppointment.getText().toString();
                String phone = mPhone.getText().toString();
                String email = mEmail.getText().toString();

                Intent intent = new Intent();

                mEmail.setText(email);


            }
        });



    }

    //for initialization
    public void initialization()
    {
        mName = findViewById(R.id.nameET);
        mDetails = findViewById(R.id.detailsET);
        mAppointment = findViewById(R.id.appointmentET);
        mPhone = findViewById(R.id.phoneET);
        mEmail = findViewById(R.id.emailET);

        mSelectedBtn = findViewById(R.id.selectBTN);
    }


}
