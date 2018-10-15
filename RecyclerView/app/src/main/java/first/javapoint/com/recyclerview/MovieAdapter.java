package first.javapoint.com.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

//Here we need to create the adapter which will actually populate the data into the RecyclerView.
//  The adapter's role is to convert an object at a position into a list row item to be inserted.
//However with a RecyclerView the adapter requires the existence of a "ViewHolder"
// object which describes and provides access to all the views within each item row

//MyViewHolder  is a customized view
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder>{


// // Store a member variable for the movies
 private List<Movie>  movieList;


    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class MyViewHolder extends RecyclerView.ViewHolder
    {

        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        TextView txt1,txt2,txt3;



        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public MyViewHolder(View view){

            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(view);

            txt1= view.findViewById(R.id.textview);
            txt2=view.findViewById(R.id.textview2);
            txt3=view.findViewById(R.id.textview3);





    }


    }

// // Pass in the contact array into the constructor
    public  MovieAdapter(List<Movie>  movieList){
        this.movieList = movieList;
    }




    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)

    {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movire_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Movie movie = movieList.get(position);
        holder.txt1.setText(movie.getMovie());
        holder.txt2.setText(movie.getGenre());
        holder.txt3.setText(movie.getYear());

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }






}
