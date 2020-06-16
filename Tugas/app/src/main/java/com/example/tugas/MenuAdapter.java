package com.example.tugas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    public Context context;
    public ArrayList<Menu> menus;

    public MenuAdapter(Context mcontext, ArrayList<Menu> menubuku){
        context = mcontext;
        menus = menubuku;
    }
    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_menu,parent,false);
        return new MenuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        Menu menubaru = menus.get(position);

        String gambarbaru = menubaru.getGambar();
        String harga = menubaru.getHarga();
        String nama = menubaru.getNama();
        String penulis = menubaru.getPenulis();
        String penerbit = menubaru.getPenerbit();
        String kategori = menubaru.getKategori();
        String tahun = menubaru.getTahun();

        holder.tvnamadata.setText(nama);
        holder.tvkategoridata.setText(kategori);
        holder.tvpenulisdata.setText(penulis);
        holder.tvpenerbitdata.setText(penerbit);
        holder.tvtahundata.setText(tahun);
        holder.tvhargadata.setText(harga);

        Glide
                .with(context)
                .load(gambarbaru)
                .centerCrop()
                .into(holder.imdata);
    }

    @Override
    public int getItemCount() {
       return menus.size();
    }


    public class MenuViewHolder extends RecyclerView.ViewHolder{
        public ImageView imdata;
        public TextView tvnamadata;
        public TextView tvpenulisdata;
        public TextView tvpenerbitdata;
        public TextView tvkategoridata;
        public TextView tvtahundata;
        public TextView tvhargadata;

        public MenuViewHolder(@NonNull View itemView){
            super(itemView);
            imdata  = itemView.findViewById(R.id.img_menu);
            tvhargadata = itemView.findViewById(R.id.tv_harga);
            tvtahundata = itemView.findViewById(R.id.tv_tahun);
            tvnamadata = itemView.findViewById(R.id.tv_nama);
            tvpenerbitdata = itemView.findViewById(R.id.tv_penerbit);
            tvpenulisdata = itemView.findViewById(R.id.tv_penulis);
            tvkategoridata = itemView.findViewById(R.id.tv_kategori);
        }
    }
}
