package com.toko.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class Penjualan {
    private String idPenjualan;
    private Date tanggal;
    private Timestamp datetime;
    private BigDecimal total;
    private String idKasir;
    private String idCustomer;
    private String statusKonfirmasi;
    private boolean kirimViaEmail;
    private String metodePembayaran;
    private BigDecimal kembalian;

    // Constructors
    public Penjualan() {}

    public Penjualan(String idPenjualan, Date tanggal, Timestamp datetime, BigDecimal total, 
                    String idKasir, String idCustomer, String statusKonfirmasi, 
                    boolean kirimViaEmail, String metodePembayaran, BigDecimal kembalian) {
        this.idPenjualan = idPenjualan;
        this.tanggal = tanggal;
        this.datetime = datetime;
        this.total = total;
        this.idKasir = idKasir;
        this.idCustomer = idCustomer;
        this.statusKonfirmasi = statusKonfirmasi;
        this.kirimViaEmail = kirimViaEmail;
        this.metodePembayaran = metodePembayaran;
        this.kembalian = kembalian;
    }

    // Getters and Setters
    public String getIdPenjualan() {
        return idPenjualan;
    }

    public void setIdPenjualan(String idPenjualan) {
        this.idPenjualan = idPenjualan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getIdKasir() {
        return idKasir;
    }

    public void setIdKasir(String idKasir) {
        this.idKasir = idKasir;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getStatusKonfirmasi() {
        return statusKonfirmasi;
    }

    public void setStatusKonfirmasi(String statusKonfirmasi) {
        this.statusKonfirmasi = statusKonfirmasi;
    }

    public boolean isKirimViaEmail() {
        return kirimViaEmail;
    }

    public void setKirimViaEmail(boolean kirimViaEmail) {
        this.kirimViaEmail = kirimViaEmail;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public BigDecimal getKembalian() {
        return kembalian;
    }

    public void setKembalian(BigDecimal kembalian) {
        this.kembalian = kembalian;
    }
}