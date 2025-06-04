package com.toko.model;

public class Customer {
    private String idCustomer;
    private String nama;
    private String email;
    private String noTelp;
    private String alamat;
    private boolean setujuWaataEmail;

    // Constructors
    public Customer() {}

    public Customer(String idCustomer, String nama, String email, 
                   String noTelp, String alamat, boolean setujuWaataEmail) {
        this.idCustomer = idCustomer;
        this.nama = nama;
        this.email = email;
        this.noTelp = noTelp;
        this.alamat = alamat;
        this.setujuWaataEmail = setujuWaataEmail;
    }

    // Getters and Setters
    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public boolean isSetujuWaataEmail() {
        return setujuWaataEmail;
    }

    public void setSetujuWaataEmail(boolean setujuWaataEmail) {
        this.setujuWaataEmail = setujuWaataEmail;
    }
}