package com.toko.viewmodel;

import java.math.BigDecimal;

public class StokBarangView {
    private String idBarang;
    private String nama;
    private int stok;
    private int stokMinimum;
    private BigDecimal harga;
    private String namaKategori;
    private String namaSupplier;
    private String statusStok;
    private String status;

    // Constructor
    public StokBarangView(String idBarang, String nama, int stok, int stokMinimum, 
                         BigDecimal harga, String namaKategori, String namaSupplier, 
                         String statusStok, String status) {
        this.idBarang = idBarang;
        this.nama = nama;
        this.stok = stok;
        this.stokMinimum = stokMinimum;
        this.harga = harga;
        this.namaKategori = namaKategori;
        this.namaSupplier = namaSupplier;
        this.statusStok = statusStok;
        this.status = status;
    }

    // Getters
    public String getIdBarang() {
        return idBarang;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public int getStokMinimum() {
        return stokMinimum;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public String getStatusStok() {
        return statusStok;
    }

    public String getStatus() {
        return status;
    }
}