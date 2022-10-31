package com.uregenrumeysa.adsm.repository;

import com.uregenrumeysa.adsm.bean.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
}
