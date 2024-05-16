package com.ftn.sbnz.model.models;
import com.ftn.sbnz.model.enums.MaritalStatus;
import com.ftn.sbnz.model.enums.UserRole;

public class BasicUser extends User{


    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    private MaritalStatus maritalStatus;

    public BasicUser(Long id, String email, String password, String name, String lastname, UserRole role, MaritalStatus maritalStatus) {
        super(id, email, password, name, lastname, role);
        this.maritalStatus = maritalStatus;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }
}
