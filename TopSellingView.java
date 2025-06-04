package com.toko.viewmodel;

import java.math.BigDecimal;

public class TopSellingView {
    private String idBarang;
    private String nama;
    private long totalTerjual;
    private BigDecimal totalPendapatan;
    private long jumlahTransaksi;
    private BigDecimal hargaRataRata;

    // Constructor
    public TopSellingView(String idBarang, String nama, long totalTerjual, 
                         BigDecimal totalPendapatan, long jumlahTransaksi, 
                         BigDecimal hargaRataRata) {
        this.idBarang = idBarang;
        this.nama = nama;
        this.totalTerjual = totalTerjual;
        this.totalPendapatan = totalPendapatan;
        this.jumlahTransaksi = jumlahTransaksi;
        this.hargaRataRata = hargaRataRata;
    }

    // Getters
    public String getIdBarang() {
        return idBarang;
    }

    public String getNama() {
        return nama;
    }

    public long getTotalTerjual() {
        return totalTerjual;
    }

    public BigDecimal getTotalPendapatan() {
        return totalPendapatan;
    }

    public long getJumlahTransaksi() {
        return jumlahTransaksi;
    }

    public BigDecimal getHargaRataRata() {
        return hargaRataRata;
    }
}