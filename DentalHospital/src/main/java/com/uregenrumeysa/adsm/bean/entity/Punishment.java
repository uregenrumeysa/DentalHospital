package com.uregenrumeysa.adsm.bean.entity;

import com.uregenrumeysa.adsm.bean.MainClass;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@SQLDelete(sql="update punishment set is_deleted = id where id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "is_deleted = 0")
public class Punishment extends MainClass {

    @ManyToOne
    private Patient patient;
}
