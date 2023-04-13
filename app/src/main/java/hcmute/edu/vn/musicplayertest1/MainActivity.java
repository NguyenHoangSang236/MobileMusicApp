package hcmute.edu.vn.musicplayertest1;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView;
public class MainActivity extends Activity {



    // Other view elements
    private View _bg__music_player_ek2;
    private ImageView image_10;
    private TextView bank_account;
    private TextView _21_savage;
    private View ellipse_14;
    private ImageView vector;
    private ImageView vector_ek1;
    private ImageView vector_ek2;
    private ImageView vector_ek3;
    private ImageView vector_ek4;
    private ImageView vector_ek5;
    private ImageView vector_ek6;
    private ImageView vector_2;
    private ImageView vector_1;
    private View ellipse_15;
    private View ellipse_16;
    private TextView _01_35;
    private TextView __02_32;
    private View rectangle_1186;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Spinner view in the layout
        /* Spinner songSpinner = findViewById(R.id.song_spinner);

        // Create an ArrayAdapter to populate the Spinner with a list of songs
        String[] songs = {"Song 1", "Song 2", "Song 3"}; // Replace this with your list of songs
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_item, songs);
        adapter.setDropDownViewResource(R.layout.spinner);
        songSpinner.setAdapter(adapter);*/

        // Find the other views in the layout
        _bg__music_player_ek2 = findViewById(R.id._bg__music_player_ek2);
        image_10 = findViewById(R.id.image_10);
        bank_account = findViewById(R.id.bank_account);
        _21_savage = findViewById(R.id._21_savage);
        ellipse_14 = findViewById(R.id.ellipse_14);
        vector = findViewById(R.id.vector);
        vector_ek1 = findViewById(R.id.vector_ek1);
        vector_ek2 = findViewById(R.id.vector_ek2);
        vector_ek3 = findViewById(R.id.vector_ek3);
        vector_ek4 = findViewById(R.id.vector_ek4);
        vector_ek5 = findViewById(R.id.vector_ek5);
        vector_ek6 = findViewById(R.id.vector_ek6);
        _01_35 = findViewById(R.id._01_35);
        __02_32 = findViewById(R.id.__02_32);
        rectangle_1186 = findViewById(R.id.rectangle_1186);

        // Add a listener to the Spinner to detect when a song is selected
        /*songSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String selectedSong = (String) adapterView.getItemAtPosition(position);
                // Do something with the selected song
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Do nothing
            }
        });*/
    }}

