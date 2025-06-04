package com.toko.controller;

import com.toko.model.Karyawan;
import java.util.ArrayList;
import java.util.List;

public class KaryawanController {
    private List<Karyawan> daftarKaryawan = new ArrayList<>();
    
    // Create
    public void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
    }
    
    // Read
    public List<Karyawan> getAllKaryawan() {
        return daftarKaryawan;
    }
    
    public Karyawan getKaryawanById(String idKaryawan) {
        for (Karyawan karyawan : daftarKaryawan) {
            if (karyawan.getIdKaryawan().equals(idKaryawan)) {
                return karyawan;
            }
        }
        return null;
    }
    
    // Update
    public boolean updateKaryawan(Karyawan karyawanUpdate) {
        for (int i = 0; i < daftarKaryawan.size(); i++) {
            if (daftarKaryawan.get(i).getIdKaryawan().equals(karyawanUpdate.getIdKaryawan())) {
                daftarKaryawan.set(i, karyawanUpdate);
                return true;
            }
        }
        return false;
    }
    
    // Delete
    public boolean hapusKaryawan(String idKaryawan) {
        for (Karyawan karyawan : daftarKaryawan) {
            if (karyawan.getIdKaryawan().equals(idKaryawan)) {
                daftarKaryawan.remove(karyawan);
                return true;
            }
        }
        return false;
    }
    
    // Authentication
    public Karyawan authenticate(String username, String password) {
        for (Karyawan karyawan : daftarKaryawan) {
            if (karyawan.getUsername().equals(username) && 
                karyawan.getPassword().equals(password)) {
                return karyawan;
            }
        }
        return null;
    }
}