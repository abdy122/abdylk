package com.toko.model;

public class Karyawan {
    private String idKaryawan;
    private String nama;
    private String role;
    private String username;
    private String password;
    private String status;

    // Constructors
    public Karyawan() {}

    public Karyawan(String idKaryawan, String nama, String role, String username, String password, String status) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.role = role;
        this.username = username;
        this.password = password;
        this.status = status;
    }

    // Getters and Setters
    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}