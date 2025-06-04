package com.toko.model;

import java.math.BigDecimal;

public class DetailPenjualan {
    private String idDetail;
    private String idPenjualan;
    private String idBarang;
    private int jumlah;
    private BigDecimal harga;
    private BigDecimal subtotal;
    private BigDecimal diskon;

    // Constructors
    public DetailPenjualan() {}

    public DetailPenjualan(String idDetail, String idPenjualan, String idBarang, int jumlah, 
                         BigDecimal harga, BigDecimal subtotal, BigDecimal diskon) {
        this.idDetail = idDetail;
        this.idPenjualan = idPenjualan;
        this.idBarang = idBarang;
        this.jumlah = jumlah;
        this.harga = harga;
        this.subtotal = subtotal;
        this.diskon = diskon;
    }

    // Getters and Setters
    public String getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(String idDetail) {
        this.idDetail = idDetail;
    }

    public String getIdPenjualan() {
        return idPenjualan;
    }

    public void setIdPenjualan(String idPenjualan) {
        this.idPenjualan = idPenjualan;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getDiskon() {
        return diskon;
    }

    public void setDiskon(BigDecimal diskon) {
        this.diskon = diskon;
    }
}