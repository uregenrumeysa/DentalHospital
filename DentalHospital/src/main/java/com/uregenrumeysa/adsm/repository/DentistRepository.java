package com.uregenrumeysa.adsm.repository;

import com.uregenrumeysa.adsm.bean.entity.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends JpaRepository<Dentist,Long> {
}
