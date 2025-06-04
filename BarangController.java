package com.toko.controller;

import com.toko.model.Barang;
import java.util.ArrayList;
import java.util.List;

public class BarangController {
    private List<Barang> daftarBarang = new ArrayList<>();
    
    // Create
    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }
    
    // Read
    public List<Barang> getAllBarang() {
        return daftarBarang;
    }
    
    public Barang getBarangById(String idBarang) {
        for (Barang barang : daftarBarang) {
            if (barang.getIdBarang().equals(idBarang)) {
                return barang;
            }
        }
        return null;
    }
    
    // Update
    public boolean updateBarang(Barang barangUpdate) {
        for (int i = 0; i < daftarBarang.size(); i++) {
            if (daftarBarang.get(i).getIdBarang().equals(barangUpdate.getIdBarang())) {
                daftarBarang.set(i, barangUpdate);
                return true;
            }
        }
        return false;
    }
    
    // Delete
    public boolean hapusBarang(String idBarang) {
        for (Barang barang : daftarBarang) {
            if (barang.getIdBarang().equals(idBarang)) {
                daftarBarang.remove(barang);
                return true;
            }
        }
        return false;
    }
    
    // Other business logic methods
    public List<Barang> getBarangStokRendah() {
        List<Barang> result = new ArrayList<>();
        for (Barang barang : daftarBarang) {
            if (barang.getStok() <= barang.getStokMinimum()) {
                result.add(barang);
            }
        }
        return result;
    }
}