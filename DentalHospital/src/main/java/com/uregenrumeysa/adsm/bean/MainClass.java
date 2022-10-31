package com.uregenrumeysa.adsm.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class MainClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date createdDate;

    private Date updatedDate;

    // Eğer ki 0 değilse silinmiş demektir.
    private Long isDeleted;

    @PreUpdate
    public void setPreUpdate(){
        this.updatedDate= new Date();
    }

    @PrePersist
    public void setPrePersist(){
        this.createdDate= new Date();
        this.isDeleted=0L;
    }

}

