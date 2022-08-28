package com.example.goodones;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import com.github.dhaval2404.imagepicker.ImagePicker;

public class MainActivity extends AppCompatActivity {
    private ImageView MatchPicture;
    private Button UploadImg;
    private EditText MatchName;
    private EditText MatchNumber;
    private TextView MatchGendertxt;
    private TextView MatchAgetxt;
    private Spinner MatchGender;
    private Spinner MatchAge;
    private EditText MatchEmail;
    private EditText MatchPassword;
    private EditText MatchCPassword;
    private com.google.android.material.textfield.TextInputEditText MatchBio;
    private TextView MateGenderTxt;
    private TextView MateAgeTxt;
    private Spinner MateGender;
    private Spinner MateAge;
    private LinearLayout LinearScrollAgreement;
    private TextView Boxshape2;
    private TextView MatchAgreement;
    private TextView MatchAgreetxtForBox;
    private CheckBox MatchAgreeBox;
    private Button RegisterBtn;
    private TextView CustomerServiceTxt;
    private Spinner CustomerService;
    private ImageView GoodOnesLogo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Completed make FUll screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MatchPicture = findViewById(R.id.MatchPicture);
        MatchName = findViewById(R.id.MatchName);
        MatchNumber = findViewById(R.id.MatchNumber);
        UploadImg = findViewById(R.id.UploadImg);
        MatchGendertxt = findViewById(R.id.MatchGendertxt);
        MatchAgetxt = findViewById(R.id.MatchAgetxt );
        MatchGender = findViewById(R.id.MatchGender);
        MatchAge = findViewById(R.id.MatchAge);
        MatchEmail = findViewById(R.id.MatchEmail);
        MatchPassword = findViewById(R.id.MatchPassword);
        MatchCPassword = findViewById(R.id.MatchCPassword);
        Boxshape2 = findViewById(R.id.Boxshape2);
        MatchBio = findViewById(R.id.MatchBio);
        MateGenderTxt = findViewById(R.id.MateGenderTxt);
        MateAgeTxt = findViewById(R.id.MateAgeTxt);
        MateGender = findViewById(R.id.MateGender);
        MateAge = findViewById(R.id.MateAge);
        LinearScrollAgreement = findViewById(R.id.LinearScrollAgreement);
        Boxshape2 = findViewById(R.id.Boxshape2);
        MatchAgreement = findViewById(R.id.MatchAgreement);
        MatchAgreetxtForBox = findViewById(R.id.MatchAgreetxtForBox);
        MatchAgreeBox = findViewById(R.id.MatchAgreeBox);
        RegisterBtn = findViewById(R.id.RegisterBtn);
        CustomerServiceTxt = findViewById(R.id.CustomerServiceTxt);
        CustomerService = findViewById(R.id.CustomerService);
        GoodOnesLogo = findViewById(R.id.GoodOnesLogo);

        //TODO Add list for Gender
        //TODO Add List for Age
        //TODO Add List for Seeking Gender
        //TODO Add List for Seeking Age
        //TODO Add List for Contact
        //Completed enable phone to upload images
        //Delete this comment

        UploadImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImagePicker.with(MainActivity.this)
                        .crop()	    			//Crop image(Optional), Check Customization for more option
                        .compress(1024)			//Final image size will be less than 1 MB(Optional)
                        .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)
                        .start();
            }
        });

        //COMPLETED Navigate to goodones page 2
        RegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, goodones_page2.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Uri matchpic = data.getData();
        MatchPicture.setImageURI(matchpic);

    }
}