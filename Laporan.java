package com.toko.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class Laporan {
    private String idLaporan;
    private Date tanggalMulai;
    private Date tanggalSelesai;
    private Timestamp createdDatetime;
    private Timestamp updatedDatetime;
    private BigDecimal totalPenjualan;
    private int totalTransaksi;
    private String status;
    private String idKasir;
    private String tipeLaporan;
    private String deskripsi;

    // Constructors
    public Laporan() {}

    public Laporan(String idLaporan, Date tanggalMulai, Date tanggalSelesai, Timestamp createdDatetime, 
                  Timestamp updatedDatetime, BigDecimal totalPenjualan, int totalTransaksi, 
                  String status, String idKasir, String tipeLaporan, String deskripsi) {
        this.idLaporan = idLaporan;
        this.tanggalMulai = tanggalMulai;
        this.tanggalSelesai = tanggalSelesai;
        this.createdDatetime = createdDatetime;
        this.updatedDatetime = updatedDatetime;
        this.totalPenjualan = totalPenjualan;
        this.totalTransaksi = totalTransaksi;
        this.status = status;
        this.idKasir = idKasir;
        this.tipeLaporan = tipeLaporan;
        this.deskripsi = deskripsi;
    }

    // Getters and Setters
    public String getIdLaporan() {
        return idLaporan;
    }

    public void setIdLaporan(String idLaporan) {
        this.idLaporan = idLaporan;
    }

    public Date getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(Date tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public Date getTanggalSelesai() {
        return tanggalSelesai;
    }

    public void setTanggalSelesai(Date tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }

    public Timestamp getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Timestamp createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public Timestamp getUpdatedDatetime() {
        return updatedDatetime;
    }

    public void setUpdatedDatetime(Timestamp updatedDatetime) {
        this.updatedDatetime = updatedDatetime;
    }

    public BigDecimal getTotalPenjualan() {
        return totalPenjualan;
    }

    public void setTotalPenjualan(BigDecimal totalPenjualan) {
        this.totalPenjualan = totalPenjualan;
    }

    public int getTotalTransaksi() {
        return totalTransaksi;
    }

    public void setTotalTransaksi(int totalTransaksi) {
        this.totalTransaksi = totalTransaksi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdKasir() {
        return idKasir;
    }

    public void setIdKasir(String idKasir) {
        this.idKasir = idKasir;
    }

    public String getTipeLaporan() {
        return tipeLaporan;
    }

    public void setTipeLaporan(String tipeLaporan) {
        this.tipeLaporan = tipeLaporan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}