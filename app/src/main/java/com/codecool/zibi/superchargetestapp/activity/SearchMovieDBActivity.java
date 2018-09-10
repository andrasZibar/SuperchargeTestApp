package com.codecool.zibi.superchargetestapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.TextView;

import com.codecool.zibi.superchargetestapp.R;
import com.codecool.zibi.superchargetestapp.service.JSONReader;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class SearchMovieDBActivity extends AppCompatActivity {
    public static final String APIKey = "43a7ea280d085bd0376e108680615c7f";
    JSONReader jsonReader = new JSONReader();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_movie_db);

        Intent intent = getIntent();
        String searchQuery = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        String searchURL = "https://api.themoviedb.org/3/search/movie?api_key="
                + APIKey
                + "&language=en-US&query="
                + searchQuery
                + "&page=1&include_adult=false";

        try {
            JSONObject[] searchResults = (JSONObject[]) jsonReader.getJson(searchURL).get("results");
            List<Integer> allMovieIdsFromSearch = new ArrayList<>();

            for (int i = 0; i < searchResults.length; i++) {
                allMovieIdsFromSearch.add(searchResults[i].getInt("id"));
            }

            List<JSONObject> allMoviesFromSearch = getAllMoviesByIds(allMovieIdsFromSearch);

            TextView textView = findViewById(R.id.textView2);
            textView.setText(allMoviesFromSearch.toString());

        } catch (JSONException e) {
            String error = "Something went wrong, sorry.";

            TextView textView = findViewById(R.id.textView2);
            textView.setText(error);

            e.printStackTrace();
        }
    }

    private List<JSONObject> getAllMoviesByIds(List<Integer> ids){
        List<JSONObject> allMovies = new ArrayList<>();
        for (Integer id:ids) {
            JSONObject movieJSON = jsonReader.getJson("https://api.themoviedb.org/3/movie/"
                    + id
                    + "?api_key="
                    + APIKey
                    + "&language=en-US"
            );
            allMovies.add(movieJSON);

        }
        return allMovies;
    }
}
