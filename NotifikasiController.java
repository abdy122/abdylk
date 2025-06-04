package com.toko.controller;

import com.toko.model.Notifikasi;
import java.util.ArrayList;
import java.util.List;

public class NotifikasiController {
    private List<Notifikasi> daftarNotifikasi = new ArrayList<>();
    
    // Create
    public void tambahNotifikasi(Notifikasi notifikasi) {
        daftarNotifikasi.add(notifikasi);
    }
    
    // Read
    public List<Notifikasi> getAllNotifikasi() {
        return daftarNotifikasi;
    }
    
    public List<Notifikasi> getUnreadNotifikasi() {
        List<Notifikasi> result = new ArrayList<>();
        for (Notifikasi notifikasi : daftarNotifikasi) {
            if (notifikasi.getStatus().equals("unread")) {
                result.add(notifikasi);
            }
        }
        return result;
    }
    
    // Mark as read
    public boolean markAsRead(String idNotifikasi) {
        for (Notifikasi notifikasi : daftarNotifikasi) {
            if (notifikasi.getIdNotifikasi().equals(idNotifikasi)) {
                notifikasi.setStatus("read");
                return true;
            }
        }
        return false;
    }
    
    // Get by type
    public List<Notifikasi> getNotifikasiByType(String tipeNotifikasi) {
        List<Notifikasi> result = new ArrayList<>();
        for (Notifikasi notifikasi : daftarNotifikasi) {
            if (notifikasi.getTipeNotifikasi().equals(tipeNotifikasi)) {
                result.add(notifikasi);
            }
        }
        return result;
    }
    
    // Get critical stock notifications
    public List<Notifikasi> getStokKritisNotifikasi() {
        List<Notifikasi> result = new ArrayList<>();
        for (Notifikasi notifikasi : daftarNotifikasi) {
            if (notifikasi.getTipeNotifikasi().equals("stok_rendah") || 
                notifikasi.getTipeNotifikasi().equals("stok_habis")) {
                result.add(notifikasi);
            }
        }
        return result;
    }
}