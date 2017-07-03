package com.example.apple.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        TextView backToLib = (TextView) findViewById(R.id.back_to_library);
        RelativeLayout albumInfo = (RelativeLayout) findViewById(R.id.album_info);

        backToLib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backToLibIntent = new Intent(SearchActivity.this, LibraryActivity.class);
                startActivity(backToLibIntent);
            }
        });

        albumInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPayment =  new Intent(SearchActivity.this, PaymentActivity.class);
                startActivity(goToPayment);
            }
        });
    }
}
