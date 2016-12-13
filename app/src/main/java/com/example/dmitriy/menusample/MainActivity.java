package com.example.dmitriy.menusample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = (RecyclerView) findViewById(R.id.activity_main_list);
        list.setLayoutManager(new LinearLayoutManager(this));


        MainAdapter adapter = new MainAdapter(generateMockData(10), new MainAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, Item item) {
                //action by click item
            }
        });

        list.setAdapter(adapter);
    }

    private List<Item> generateMockData(int size) {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            items.add(new Item("Item " + i));
        }
        return items;
    }
}
