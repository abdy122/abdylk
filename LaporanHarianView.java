package com.toko.viewmodel;

import java.math.BigDecimal;
import java.util.Date;

public class LaporanHarianView {
    private Date tanggal;
    private long totalTransaksi;
    private BigDecimal totalPenjualan;
    private BigDecimal rataRataTransaksi;
    private String namaKasir;
    private String idKaryawan;

    // Constructor
    public LaporanHarianView(Date tanggal, long totalTransaksi, BigDecimal totalPenjualan, 
                           BigDecimal rataRataTransaksi, String namaKasir, String idKaryawan) {
        this.tanggal = tanggal;
        this.totalTransaksi = totalTransaksi;
        this.totalPenjualan = totalPenjualan;
        this.rataRataTransaksi = rataRataTransaksi;
        this.namaKasir = namaKasir;
        this.idKaryawan = idKaryawan;
    }

    // Getters
    public Date getTanggal() {
        return tanggal;
    }

    public long getTotalTransaksi() {
        return totalTransaksi;
    }

    public BigDecimal getTotalPenjualan() {
        return totalPenjualan;
    }

    public BigDecimal getRataRataTransaksi() {
        return rataRataTransaksi;
    }

    public String getNamaKasir() {
        return namaKasir;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }
}