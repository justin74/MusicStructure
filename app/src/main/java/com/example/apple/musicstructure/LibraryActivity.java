package com.example.apple.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        TextView artists = (TextView) findViewById(R.id.artists);
        TextView albums = (TextView) findViewById(R.id.albums);
        TextView songs = (TextView) findViewById(R.id.songs);
        TextView search = (TextView) findViewById(R.id.search);

        setListenerOpenActivity(artists, ArtistsActivity.class);
        setListenerOpenActivity(albums, AlbumsActivity.class);
        setListenerOpenActivity(songs, SongsActivity.class);
        setListenerOpenActivity(search, SearchActivity.class);
    }

    private void setListenerOpenActivity(View viewToSet, final Class activityToOpen){
        viewToSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LibraryActivity.this, activityToOpen);
                startActivity(intent);
            }
        });
    };
}
