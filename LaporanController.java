package com.toko.controller;

import com.toko.model.Laporan;
import com.toko.model.Penjualan;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LaporanController {
    private List<Laporan> daftarLaporan = new ArrayList<>();
    private PenjualanController penjualanController;
    
    public LaporanController(PenjualanController penjualanController) {
        this.penjualanController = penjualanController;
    }
    
    // Generate Laporan
    public Laporan generateLaporan(Date tanggalMulai, Date tanggalSelesai, 
                                  String idKasir, String tipeLaporan) {
        // Get penjualan data
        List<Penjualan> penjualanList = penjualanController.getPenjualanByPeriode(tanggalMulai, tanggalSelesai);
        
        // Filter by kasir if needed
        if (idKasir != null && !idKasir.isEmpty()) {
            penjualanList.removeIf(p -> !p.getIdKasir().equals(idKasir));
        }
        
        // Calculate totals
        BigDecimal totalPenjualan = BigDecimal.ZERO;
        for (Penjualan p : penjualanList) {
            totalPenjualan = totalPenjualan.add(p.getTotal());
        }
        
        int totalTransaksi = penjualanList.size();
        
        // Create laporan
        String idLaporan = "LAP_" + System.currentTimeMillis();
        Laporan laporan = new Laporan();
        laporan.setIdLaporan(idLaporan);
        laporan.setTanggalMulai(tanggalMulai);
        laporan.setTanggalSelesai(tanggalSelesai);
        laporan.setTotalPenjualan(totalPenjualan);
        laporan.setTotalTransaksi(totalTransaksi);
        laporan.setIdKasir(idKasir);
        laporan.setTipeLaporan(tipeLaporan);
        laporan.setStatus("final");
        
        daftarLaporan.add(laporan);
        return laporan;
    }
    
    // Get Laporan
    public List<Laporan> getAllLaporan() {
        return daftarLaporan;
    }
    
    public Laporan getLaporanById(String idLaporan) {
        for (Laporan laporan : daftarLaporan) {
            if (laporan.getIdLaporan().equals(idLaporan)) {
                return laporan;
            }
        }
        return null;
    }
}