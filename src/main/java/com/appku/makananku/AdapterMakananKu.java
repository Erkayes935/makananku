package com.appku.makananku;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterMakananKu extends RecyclerView.Adapter<AdapterMakananKu.CardViewHolder> {
    private ArrayList<MakananList> ListMakanan;
    private Context context;

    public AdapterMakananKu(Context context) {
        this.context = context;
    }

    public ArrayList<MakananList> getListMakanan() {
        return ListMakanan;
    }

    public void setListMakanan(ArrayList<MakananList> listMakanan) {
        this.ListMakanan = listMakanan;
    }

    public CardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_makanan, viewGroup, false);
        CardViewHolder viewHolder = new CardViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder cardViewHolder, int i) {
        MakananList culinary = getListMakanan().get(i);
        Glide.with(context)
                .load(culinary.getFoto())
                .override(100, 200)
                .into(cardViewHolder.poto);
        cardViewHolder.nama_makanan.setText(culinary.getNama());
        cardViewHolder.no_pilihan.setText(culinary.getPilihan());
        cardViewHolder.more = culinary;
        cardViewHolder.favourite.setOnClickListener(new OnItemClickListener(i, new OnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Berhasil Favoritkan " + getListMakanan().get(position).getNama(), Toast.LENGTH_SHORT).show();
            }
        }));

    }

    @Override
    public int getItemCount() {
        return getListMakanan().size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView poto;
        TextView nama_makanan, no_pilihan;
        Button klik, favourite;
        MakananList more;

        public CardViewHolder(View itemView) {
            super(itemView);
            poto = itemView.findViewById(R.id.foto);
            nama_makanan = itemView.findViewById(R.id.nama);
            no_pilihan = itemView.findViewById(R.id.pilihan);
            klik = itemView.findViewById(R.id.tombol_more);
            favourite = itemView.findViewById(R.id.tombol_fave);
            klik.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            more = getListMakanan().get(getAdapterPosition());
            Intent intent = new Intent(context, DetailMakanan.class);
            intent.putExtra("MakananList", more);
            context.startActivity(intent);
        }
    }
}
