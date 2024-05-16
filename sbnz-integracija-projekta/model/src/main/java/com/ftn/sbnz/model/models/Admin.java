package com.ftn.sbnz.model.models;

import com.ftn.sbnz.model.enums.UserRole;

public class Admin extends User{

    public Admin(Long id, String email, String password, String name, String lastname, UserRole role) {
        super(id, email, password, name, lastname, role);
    }
}
