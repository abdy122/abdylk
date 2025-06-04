package com.toko.model;

import java.math.BigDecimal;

public class Barang {
    private String idBarang;
    private String nama;
    private String deskripsi;
    private int stok;
    private BigDecimal harga;
    private String idKategori;
    private String idSupplier;
    private int stokMinimum;
    private String status;

    // Constructors
    public Barang() {}

    public Barang(String idBarang, String nama, String deskripsi, int stok, BigDecimal harga, 
                 String idKategori, String idSupplier, int stokMinimum, String status) {
        this.idBarang = idBarang;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.stok = stok;
        this.harga = harga;
        this.idKategori = idKategori;
        this.idSupplier = idSupplier;
        this.stokMinimum = stokMinimum;
        this.status = status;
    }

    // Getters and Setters
    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public String getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(String idKategori) {
        this.idKategori = idKategori;
    }

    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

    public int getStokMinimum() {
        return stokMinimum;
    }

    public void setStokMinimum(int stokMinimum) {
        this.stokMinimum = stokMinimum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}