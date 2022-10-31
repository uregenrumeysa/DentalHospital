package com.uregenrumeysa.adsm.bean.entity;

import com.uregenrumeysa.adsm.bean.Person;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@SQLDelete(sql="update patient set is_deleted = id where id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "is_deleted = 0")
public class Patient extends Person {

    private Date registerDate;

    @OneToMany(mappedBy = "patient")
    private Set<Punishment> punishments;

    @OneToMany(mappedBy = "patient")
    Set<Appointment> appointments;

    public String getPatientNumber(){
        // gelen idyi 4 basamaklı stringe çevrilecek.
        return  String.valueOf(getId());
    }
}
