package com.example.jawbottlesthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class jawbottlesfour extends AppCompatActivity {

    private EditText EdittxtName;
    private EditText EdittxtPhone;
    private Button structure;
    private ListView Listing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_jawbottlesfour);

        EdittxtName = findViewById(R.id.EdittxtName);
        EdittxtPhone = findViewById(R.id.EdittxtPhone);
        structure = findViewById(R.id.structure);
        Listing = findViewById(R.id.Listing);

        structure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    customermodel customer = new customermodel(EdittxtName.getText().toString(), Integer.parseInt(EdittxtPhone.getText().toString()));
                    Toast.makeText(jawbottlesfour.this, customer.toString(), Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    Toast.makeText(jawbottlesfour.this, "Please enter information", Toast.LENGTH_SHORT).show();

                    DatabaseClass dataBase = new DatabaseClass(MainActivity.this);

                }
            }
        });
    }
}