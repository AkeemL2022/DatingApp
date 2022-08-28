package com.example.goodones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class goodones_page2 extends AppCompatActivity {

    private RecyclerView requirerecycler;
    private Button Matchingbutton;
    private ImageView ProfilePic2;
    private TextView requirementtxt;
    private TextView editInfotxt;
    private Spinner CSSpin;
    private Spinner DeleteAccountSpin;
    private androidx.cardview.widget.CardView EmailReq;
    //Delete this comment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_ones_page2);

        requirerecycler = findViewById(R.id.requirerecycler);
        Matchingbutton = findViewById(R.id.Matchingbutton);
        ProfilePic2 = findViewById(R.id.ProfilePic2);
        requirementtxt = findViewById(R.id.requirementtxt);
        editInfotxt = findViewById(R.id.editInfotxt);
        CSSpin = findViewById(R.id.CSSpin);
        DeleteAccountSpin = findViewById(R.id.DeleteAccountSpin);
        EmailReq = findViewById(R.id.EmailReq);

        Matchingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(goodones_page2.this, goodones_page3.class);
                startActivity(intent);
            }
        });

        ArrayList<Contacts> contacts = new ArrayList<>();
        contacts.add(new Contacts("Jenny@gmail.com", "Email Verification"));
        contacts.add(new Contacts("Ferri@gmail.com", "Number Verification"));
        contacts.add(new Contacts("Lanzo@gmail.com", "Photo Verification"));
        contacts.add(new Contacts("Lanzo@gmail.com", "Biography"));
        contacts.add(new Contacts("Lanzo@gmail.com", "Age seeking"));

        ContactViewAdapter adapter = new ContactViewAdapter();
        adapter.setContacts(contacts);

        requirerecycler.setAdapter(adapter);
        requirerecycler.setLayoutManager(new LinearLayoutManager(this));
    }
}
