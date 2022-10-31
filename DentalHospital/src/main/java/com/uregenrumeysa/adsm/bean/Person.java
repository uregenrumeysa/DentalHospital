package com.uregenrumeysa.adsm.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class Person extends MainClass{
    private String name;
    private String surName;
    private String phoneNumber;
    private String address;

    @Column(nullable = false)
    private String gender;

    private Date birthDate;
}
