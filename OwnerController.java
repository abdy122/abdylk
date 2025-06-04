package com.toko.controller;

import com.toko.model.Owner;
import java.util.ArrayList;
import java.util.List;

public class OwnerController {
    private List<Owner> daftarOwner = new ArrayList<>();
    
    // Create
    public void tambahOwner(Owner owner) {
        daftarOwner.add(owner);
    }
    
    // Read
    public List<Owner> getAllOwner() {
        return daftarOwner;
    }
    
    public Owner getOwnerById(String idOwner) {
        for (Owner owner : daftarOwner) {
            if (owner.getIdOwner().equals(idOwner)) {
                return owner;
            }
        }
        return null;
    }
    
    // Authentication
    public Owner authenticate(String username, String password) {
        for (Owner owner : daftarOwner) {
            if (owner.getUsername().equals(username) && 
                owner.getPassword().equals(password)) {
                return owner;
            }
        }
        return null;
    }
    
    // Update
    public boolean updateOwner(Owner ownerUpdate) {
        for (int i = 0; i < daftarOwner.size(); i++) {
            if (daftarOwner.get(i).getIdOwner().equals(ownerUpdate.getIdOwner())) {
                daftarOwner.set(i, ownerUpdate);
                return true;
            }
        }
        return false;
    }
    
    // Update notification preferences
    public boolean updateNotificationPref(String idOwner, boolean kirimEmail, boolean setujuWaataEmail) {
        for (Owner owner : daftarOwner) {
            if (owner.getIdOwner().equals(idOwner)) {
                owner.setKirimEmail(kirimEmail);
                owner.setSetujuWaataEmail(setujuWaataEmail);
                return true;
            }
        }
        return false;
    }
}