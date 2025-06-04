package com.toko.controller;

import com.toko.model.Penjualan;
import com.toko.model.DetailPenjualan;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PenjualanController {
    private List<Penjualan> daftarPenjualan = new ArrayList<>();
    private List<DetailPenjualan> daftarDetailPenjualan = new ArrayList<>();
    
    // Create Penjualan
    public void tambahPenjualan(Penjualan penjualan) {
        daftarPenjualan.add(penjualan);
    }
    
    // Create Detail Penjualan
    public void tambahDetailPenjualan(DetailPenjualan detail) {
        daftarDetailPenjualan.add(detail);
        updateTotalPenjualan(detail.getIdPenjualan());
    }
    
    // Read
    public List<Penjualan> getAllPenjualan() {
        return daftarPenjualan;
    }
    
    public Penjualan getPenjualanById(String idPenjualan) {
        for (Penjualan penjualan : daftarPenjualan) {
            if (penjualan.getIdPenjualan().equals(idPenjualan)) {
                return penjualan;
            }
        }
        return null;
    }
    
    public List<DetailPenjualan> getDetailPenjualan(String idPenjualan) {
        List<DetailPenjualan> result = new ArrayList<>();
        for (DetailPenjualan detail : daftarDetailPenjualan) {
            if (detail.getIdPenjualan().equals(idPenjualan)) {
                result.add(detail);
            }
        }
        return result;
    }
    
    // Update
    public boolean updateStatusPenjualan(String idPenjualan, String status) {
        for (Penjualan penjualan : daftarPenjualan) {
            if (penjualan.getIdPenjualan().equals(idPenjualan)) {
                penjualan.setStatusKonfirmasi(status);
                return true;
            }
        }
        return false;
    }
    
    // Helper method to update total
    private void updateTotalPenjualan(String idPenjualan) {
        BigDecimal total = BigDecimal.ZERO;
        for (DetailPenjualan detail : daftarDetailPenjualan) {
            if (detail.getIdPenjualan().equals(idPenjualan)) {
                total = total.add(detail.getSubtotal());
            }
        }
        
        for (Penjualan penjualan : daftarPenjualan) {
            if (penjualan.getIdPenjualan().equals(idPenjualan)) {
                penjualan.setTotal(total);
                break;
            }
        }
    }
    
    // Generate Laporan
    public List<Penjualan> getPenjualanByPeriode(Date mulai, Date selesai) {
        List<Penjualan> result = new ArrayList<>();
        for (Penjualan penjualan : daftarPenjualan) {
            if (!penjualan.getTanggal().before(mulai) && 
                !penjualan.getTanggal().after(selesai)) {
                result.add(penjualan);
            }
        }
        return result;
    }
}