package com.example.apple.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        TextView backToLib = (TextView) findViewById(R.id.back_to_library);

        backToLib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backToLibIntent = new Intent(ArtistsActivity.this, LibraryActivity.class);
                startActivity(backToLibIntent);
            }
        });
    }
}
