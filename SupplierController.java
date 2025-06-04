package com.toko.controller;

import com.toko.model.Supplier;
import java.util.ArrayList;
import java.util.List;

public class SupplierController {
    private List<Supplier> daftarSupplier = new ArrayList<>();
    
    // Create
    public void tambahSupplier(Supplier supplier) {
        daftarSupplier.add(supplier);
    }
    
    // Read
    public List<Supplier> getAllSupplier() {
        return daftarSupplier;
    }
    
    public Supplier getSupplierById(String idSupplier) {
        for (Supplier supplier : daftarSupplier) {
            if (supplier.getIdSupplier().equals(idSupplier)) {
                return supplier;
            }
        }
        return null;
    }
    
    // Update
    public boolean updateSupplier(Supplier supplierUpdate) {
        for (int i = 0; i < daftarSupplier.size(); i++) {
            if (daftarSupplier.get(i).getIdSupplier().equals(supplierUpdate.getIdSupplier())) {
                daftarSupplier.set(i, supplierUpdate);
                return true;
            }
        }
        return false;
    }
    
    // Delete
    public boolean hapusSupplier(String idSupplier) {
        for (Supplier supplier : daftarSupplier) {
            if (supplier.getIdSupplier().equals(idSupplier)) {
                daftarSupplier.remove(supplier);
                return true;
            }
        }
        return false;
    }
    
    // Get active suppliers
    public List<Supplier> getActiveSupplier() {
        List<Supplier> result = new ArrayList<>();
        for (Supplier supplier : daftarSupplier) {
            if (supplier.getStatus().equals("aktif")) {
                result.add(supplier);
            }
        }
        return result;
    }
}