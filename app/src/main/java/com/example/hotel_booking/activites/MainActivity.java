package com.example.hotel_booking.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hotel_booking.Adapter.ItemsAdapter;
import com.example.hotel_booking.Domain.ItemsDomain;
import com.example.hotel_booking.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapterPopular,adapterNew;
private RecyclerView recyclerViewPopular, recyclerViewNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<ItemsDomain> ItemsArraylist=new ArrayList<>();

        ItemsArraylist.add(new ItemsDomain("House with a great view","San Fransisco, CA 94110","This 2 bed 1/bath home boasts an enormous,\n" +
                "open-living plan, accented by striking \n" +
                "arcthectural features and high-end finishes. \n" +
                "Feel inspired by open sight lines that\n" +
                "embrace the outdoors, cowned by sturring\n" +
                "coffered ceilings. ",2,1,841856, "pic1", true));
        ItemsArraylist.add(new ItemsDomain("House with a great view","San Fransisco, CA 94110","This 2 bed 1/bath home boasts an enormous,\n" +
                "open-living plan, accented by striking \n" +
                "arcthectural features and high-end finishes. \n" +
                "Feel inspired by open sight lines that\n" +
                "embrace the outdoors, cowned by sturring\n" +
                "coffered ceilings. ",2,1,654987, "pic3", false));
        ItemsArraylist.add(new ItemsDomain("House with a great view","San Fransisco, CA 94110","This 2 bed 1/bath home boasts an enormous,\n" +
                "open-living plan, accented by striking \n" +
                "arcthectural features and high-end finishes. \n" +
                "Feel inspired by open sight lines that\n" +
                "embrace the outdoors, cowned by sturring\n" +
                "coffered ceilings. ",2,1,841856, "pic1", true));

        recyclerViewPopular=findViewById(R.id.viewPopular);
        recyclerViewNew=findViewById(R.id.viewNew);

        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        recyclerViewNew.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterNew=new ItemsAdapter(ItemsArraylist);
        adapterPopular=new ItemsAdapter(ItemsArraylist);

        recyclerViewNew.setAdapter(adapterNew);
        recyclerViewPopular.setAdapter(adapterPopular);
    }
}