package com.toko.model;

public class Owner {
    private String idOwner;
    private String nama;
    private String email;
    private String noTelp;
    private String username;
    private String password;
    private boolean kirimEmail;
    private boolean setujuWaataEmail;

    // Constructors
    public Owner() {}

    public Owner(String idOwner, String nama, String email, String noTelp, 
                String username, String password, boolean kirimEmail, boolean setujuWaataEmail) {
        this.idOwner = idOwner;
        this.nama = nama;
        this.email = email;
        this.noTelp = noTelp;
        this.username = username;
        this.password = password;
        this.kirimEmail = kirimEmail;
        this.setujuWaataEmail = setujuWaataEmail;
    }

    // Getters and Setters
    public String getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(String idOwner) {
        this.idOwner = idOwner;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isKirimEmail() {
        return kirimEmail;
    }

    public void setKirimEmail(boolean kirimEmail) {
        this.kirimEmail = kirimEmail;
    }

    public boolean isSetujuWaataEmail() {
        return setujuWaataEmail;
    }

    public void setSetujuWaataEmail(boolean setujuWaataEmail) {
        this.setujuWaataEmail = setujuWaataEmail;
    }
}