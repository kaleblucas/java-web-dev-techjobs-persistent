package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank
    @Max(99)
    private String description;

    public Skill(String description){
        super();
        this.description = description;
    }

    public Skill(){}


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}