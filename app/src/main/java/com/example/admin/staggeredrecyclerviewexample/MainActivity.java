package com.example.admin.staggeredrecyclerviewexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int placeImage[]= {R.drawable.beach1,

            R.drawable.waterfall1,

            R.drawable.beach2,
            R.drawable.waterfall2,
            R.drawable.beach3,
            R.drawable.waterfall3,
            R.drawable.beach4,
            R.drawable.beach5,
            R.drawable.beach6,
            R.drawable.beach7,
            R.drawable.beach8,

    };

    String placeName[]= {"Captiva","waterfall1", "Clearwater",
            "Waterfall2","Siesta","waterfall3","Sanibel","Palm","Southbeach",
            "KeyWest","Delrays"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView favPlaces = (RecyclerView) findViewById(R.id.favPlaces);
        StaggeredGridLayoutManager  layoutManager= new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        layoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        favPlaces.setLayoutManager(layoutManager);
        favPlaces.setHasFixedSize(true);
        ArrayList<Beaches> beachList= getPlaces();

       StaggeredAdapter staggeredAdapter = new StaggeredAdapter(beachList);
        favPlaces.setAdapter(staggeredAdapter);

    }


    private  ArrayList<Beaches> getPlaces()
    {
        ArrayList<Beaches> deatils =new ArrayList<>();
        for(int i=0; i<placeImage.length ;i++)
        {
            deatils.add(new Beaches(placeImage[i],placeName[i]));

        }

        return  deatils;
    }


}
