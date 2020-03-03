package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank
    @Max(99)
    private String location;

    public Employer(String location){
        super();
        this.location = location;
    }

    public Employer(){}


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
