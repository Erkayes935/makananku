package com.appku.makananku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView jenis;
    private ArrayList<MakananList> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jenis = findViewById(R.id.jenis_makanan);
        jenis.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(DataMakananKu.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        jenis.setLayoutManager(new LinearLayoutManager(this));
        AdapterMakananKu adapterMakananKu = new AdapterMakananKu(this);
        adapterMakananKu.setListMakanan(list);
        jenis.setAdapter(adapterMakananKu);
    }
}
