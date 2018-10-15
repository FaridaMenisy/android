package first.javapoint.com.recyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private List<Movie> movieList = new ArrayList<>();
    private  MovieAdapter mv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_layout);


       RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mv = new MovieAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        Movie movie1 = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015");

        Movie movie2 = new Movie("Inside Out", "Animation, Kids & Family", "2015");
        Movie movie3 = new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        recyclerView.setAdapter(mv);


    }



}
