package com.toko.model;

public class Supplier {
    private String idSupplier;
    private String namaSupplier;
    private String kontak;
    private String alamat;
    private String email;
    private String status;

    // Constructors
    public Supplier() {}

    public Supplier(String idSupplier, String namaSupplier, String kontak, 
                   String alamat, String email, String status) {
        this.idSupplier = idSupplier;
        this.namaSupplier = namaSupplier;
        this.kontak = kontak;
        this.alamat = alamat;
        this.email = email;
        this.status = status;
    }

    // Getters and Setters
    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}