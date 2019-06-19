package com.appku.makananku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailMakanan extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_makanan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        MakananList details = getIntent().getParcelableExtra("MakananList");

        ImageView futu = findViewById(R.id.foto);
        TextView namane = findViewById(R.id.nama);
        TextView dipilih = findViewById(R.id.pilihan);
        TextView cerita = findViewById(R.id.penjelasan);
        TextView kategori = findViewById(R.id.keterangan);
        TextView bahane = findViewById(R.id.bahan);
        TextView jenise = findViewById(R.id.jenis_makanan);

        Glide.with(this)
                .load(details.getFoto())
                .override(100, 200)
                .into(futu);
        namane.setText(details.getNama());
        dipilih.setText(details.getPilihan());
        cerita.setText(details.getPenjelasan());
        kategori.setText(details.getKeterangan());
        bahane.setText(details.getBahan());
        jenise.setText(details.getJenis());

        Log.i("Foto", details.getFoto());
        Log.i("Nama : ", details.getNama());
        Log.i("Kategori : ", details.getKeterangan());
        Log.i("Bahan - Bahan : ", details.getBahan());
        Log.i("Macam - macamnya : ", details.getJenis());
    }
}
