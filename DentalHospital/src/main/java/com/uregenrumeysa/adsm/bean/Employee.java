package com.uregenrumeysa.adsm.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public abstract class Employee extends Person{
    private String relativeClose;

    public String getEmployeeNumber(){
        //  Gelen idyi 4 basamaklı stringe çevrilecek.
        return  String.valueOf(getId());
    }
}
