package com.toko.model;

public class Kategori {
    private String idKategori;
    private String namaKategori;
    private String deskripsi;
    private String status;

    // Constructors
    public Kategori() {}

    public Kategori(String idKategori, String namaKategori, String deskripsi, String status) {
        this.idKategori = idKategori;
        this.namaKategori = namaKategori;
        this.deskripsi = deskripsi;
        this.status = status;
    }

    // Getters and Setters
    public String getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(String idKategori) {
        this.idKategori = idKategori;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}