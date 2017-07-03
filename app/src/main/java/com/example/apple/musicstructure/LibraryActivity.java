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

        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(LibraryActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(LibraryActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(LibraryActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(LibraryActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });
    }
}
