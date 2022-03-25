package com.UttraTourist.UttraTourist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.UttraTourist.UttraTourist.adapter.RecentsAdapter;
import com.UttraTourist.UttraTourist.adapter.TopPlacesAdapter;
import com.UttraTourist.UttraTourist.model.RecentsData;
import com.UttraTourist.UttraTourist.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Rishikesh","India","From Rs 10000",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Badrinath","India","From Rs 15000",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Nainital","India","From RS 8000",R.drawable.recentimage3));
        recentsDataList.add(new RecentsData("Dehradun","India","From Rs 5000",R.drawable.recentimage4));
        recentsDataList.add(new RecentsData("Auli","India","From Rs12000",R.drawable.recentimage5));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Kedarnath","India","Ni pta",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Haridwar","India","Iska bhi nhi pta",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Ranikhet","India","Abhi toh bola ni pta",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Almora","India","Bohot ho gya ab",R.drawable.topplaces));

        setTopPlacesRecycler(topPlacesDataList);
    }

    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private  void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }
}
