package com.toko.controller;

import com.toko.model.Kategori;
import java.util.ArrayList;
import java.util.List;

public class KategoriController {
    private List<Kategori> daftarKategori = new ArrayList<>();
    
    // Create
    public void tambahKategori(Kategori kategori) {
        daftarKategori.add(kategori);
    }
    
    // Read
    public List<Kategori> getAllKategori() {
        return daftarKategori;
    }
    
    public Kategori getKategoriById(String idKategori) {
        for (Kategori kategori : daftarKategori) {
            if (kategori.getIdKategori().equals(idKategori)) {
                return kategori;
            }
        }
        return null;
    }
    
    // Update
    public boolean updateKategori(Kategori kategoriUpdate) {
        for (int i = 0; i < daftarKategori.size(); i++) {
            if (daftarKategori.get(i).getIdKategori().equals(kategoriUpdate.getIdKategori())) {
                daftarKategori.set(i, kategoriUpdate);
                return true;
            }
        }
        return false;
    }
    
    // Delete
    public boolean hapusKategori(String idKategori) {
        for (Kategori kategori : daftarKategori) {
            if (kategori.getIdKategori().equals(idKategori)) {
                daftarKategori.remove(kategori);
                return true;
            }
        }
        return false;
    }
    
    // Get active categories
    public List<Kategori> getActiveKategori() {
        List<Kategori> result = new ArrayList<>();
        for (Kategori kategori : daftarKategori) {
            if (kategori.getStatus().equals("aktif")) {
                result.add(kategori);
            }
        }
        return result;
    }
}