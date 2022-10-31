package com.uregenrumeysa.adsm.repository;

import com.uregenrumeysa.adsm.bean.entity.Servant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServantRepository extends JpaRepository<Servant,Long> {
}
