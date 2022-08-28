package com.example.goodones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class goodones_page3 extends AppCompatActivity {
    private TextView DisplayTxt;
    private ImageView ProfilePic3;
    private Button BadOnebtn;
    private Button Declinebtn;
    private Button Acceptbtn;
    private Spinner Deletepg3;
    private Spinner CSSpinpg3;
    private Button Gobackbtn;
    private TextView CustomerServicepgThreeTxt;
    private TextView AccountpgTwoTxtpg3;
    //Delete this comment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodones_page3);

        DisplayTxt = findViewById(R.id.DisplayTxt);
        ProfilePic3 = findViewById(R.id.ProfilePic3);
        BadOnebtn = findViewById(R.id.BadOnebtn);
        Declinebtn = findViewById(R.id.Declinebtn);
        Acceptbtn = findViewById(R.id.Acceptbtn);
        Deletepg3 = findViewById(R.id.Deletepg3);
        CSSpinpg3 = findViewById(R.id.CSSpinpg3);
        Gobackbtn = findViewById(R.id.Gobackbtn);
        CustomerServicepgThreeTxt = findViewById(R.id.CustomerServicepgThreeTxt);
        AccountpgTwoTxtpg3 = findViewById(R.id.AccountpgTwoTxtpg3);

        Gobackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(goodones_page3.this, goodones_page2.class);
                startActivity(intent);
            }
        });
    }
}