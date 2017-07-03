package com.example.apple.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        TextView backToSearch = (TextView) findViewById(R.id.back_to_search);

        backToSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backToSearchIntent = new Intent(PaymentActivity.this, SearchActivity.class);
                startActivity(backToSearchIntent);
            }
        });

    }
}
