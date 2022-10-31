package com.uregenrumeysa.adsm.bean.entity;

import com.uregenrumeysa.adsm.bean.Employee;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@SQLDelete(sql="update dentist set is_deleted = id where id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "is_deleted = 0")
public class Dentist extends Employee {
    private String dHBId;
    private Date dhbRegisterDate;

    @OneToMany(mappedBy = "dentist")
    Set<Appointment> appointments;
}
