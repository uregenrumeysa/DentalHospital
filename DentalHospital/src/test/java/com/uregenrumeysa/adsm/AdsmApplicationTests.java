package com.uregenrumeysa.adsm;

import com.uregenrumeysa.adsm.repository.DentistRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AdsmApplicationTests {

	@Autowired
	DentistRepository dentistRepository;

	@Test
	void contextLoads() {
	}

	/*
	@Test
	void dentist_crud_operations(){
		Dentist dentist = new Dentist();
		dentist.setName("Rümeysa");
		dentist.setSurName("Üregen");
		dentist.setPhoneNumber("4123123123123");
		dentist.setAddress("Kırıkkale falan filan");
		dentist.setRelativeClose("Zekai");
		dentist.setDHBId("123123123");
		dentist.setDhbRegisterDate(new Date());
		dentist.setGender("K");
        dentist = dentistRepository.save(dentist);

        assert(dentist.getName().equals(dentistRepository.findById(dentist.getId()).get().getName()));

        dentistRepository.delete(dentist);

        List<Dentist> dentistList =  dentistRepository.findAll();

		Dentist finalDentist = dentist;
		assert (dentistList != null && !dentistList.stream().anyMatch(dentistNew -> dentistNew.getId().equals(finalDentist.getId())));

	}*/

}
