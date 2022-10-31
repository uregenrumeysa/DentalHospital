package com.uregenrumeysa.adsm.bean.entity;

import com.uregen.adsm.bean.Employee;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@SQLDelete(sql="update servant set is_deleted = id where id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "is_deleted = 0")
public class Servant extends Employee {

}
