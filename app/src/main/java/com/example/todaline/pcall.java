package com.example.todaline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class pcall extends AppCompatActivity {

        TextView name, add, age, contact, plate;
        String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcall);

        name = findViewById(R.id.Name);
        add = findViewById(R.id.Add);
        age = findViewById(R.id.Age);
        contact = findViewById(R.id.Contact);
        plate = findViewById(R.id.Plate);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("NAME");
        name.setText(Name);
        String Add = intent.getStringExtra("ADD");
        add.setText(Add);
        String Age = intent.getStringExtra("AGE");
        age.setText(Age);
        String Contact = intent.getStringExtra("CONTACT");
        contact.setText(Contact);
        String Plate = intent.getStringExtra("PLATE");
        plate.setText(Plate);
        number = Contact.toString();
    }

    public void btncall(View view) {

        Intent intent22 = new Intent(Intent.ACTION_DIAL);
        intent22.setData(Uri.parse("tel:"+number));
        startActivity(intent22);

    }
}