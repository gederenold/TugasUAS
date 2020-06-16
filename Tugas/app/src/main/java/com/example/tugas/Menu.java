package com.example.tugas;

public class Menu {
    private String nama;
    private  String penulis;
    private String penerbit;
    private  String kategori;
    private  String gambar;
    private String tahun;
    private  String harga;

    public Menu(String d_gambar, String d_nama,String d_penulis,String d_penerbit,String d_kategori, String d_tahun, String d_harga){
        gambar = d_gambar;
        nama = d_nama;
        penerbit = d_penerbit;
        penulis = d_penulis;
        kategori = d_kategori;
        tahun = d_tahun;
        harga = d_harga;
    }

    public String getGambar(){
        return gambar;
    }

    public String getNama(){
        return nama;
    }

    public String getPenerbit(){
        return penerbit;
    }

    public String getPenulis(){
        return penulis;
    }

    public String getKategori(){
        return kategori;
    }

    public String getTahun(){
        return tahun;
    }

    public String getHarga(){
        return harga;
    }

}
