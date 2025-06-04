package com.toko.model;

import java.sql.Timestamp;

public class Notifikasi {
    private String idNotifikasi;
    private String pesan;
    private Timestamp tanggalDatetime;
    private String status;
    private String idBarang;
    private String tipeNotifikasi;
    private String prioritas;

    // Constructors
    public Notifikasi() {}

    public Notifikasi(String idNotifikasi, String pesan, Timestamp tanggalDatetime, 
                     String status, String idBarang, String tipeNotifikasi, String prioritas) {
        this.idNotifikasi = idNotifikasi;
        this.pesan = pesan;
        this.tanggalDatetime = tanggalDatetime;
        this.status = status;
        this.idBarang = idBarang;
        this.tipeNotifikasi = tipeNotifikasi;
        this.prioritas = prioritas;
    }

    // Getters and Setters
    public String getIdNotifikasi() {
        return idNotifikasi;
    }

    public void setIdNotifikasi(String idNotifikasi) {
        this.idNotifikasi = idNotifikasi;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public Timestamp getTanggalDatetime() {
        return tanggalDatetime;
    }

    public void setTanggalDatetime(Timestamp tanggalDatetime) {
        this.tanggalDatetime = tanggalDatetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getTipeNotifikasi() {
        return tipeNotifikasi;
    }

    public void setTipeNotifikasi(String tipeNotifikasi) {
        this.tipeNotifikasi = tipeNotifikasi;
    }

    public String getPrioritas() {
        return prioritas;
    }

    public void setPrioritas(String prioritas) {
        this.prioritas = prioritas;
    }
}