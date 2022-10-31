package com.uregenrumeysa.adsm.bean.entity;

import com.uregenrumeysa.adsm.bean.enums.AppointmentState;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import java.util.Date;

@Entity
public class Appointment {
    @EmbeddedId
    private AppointmentId id;

    @ManyToOne
    @MapsId("dentistId")
    Dentist dentist;

    @ManyToOne
    @MapsId("patientId")
    Patient patient;

    private Date appointmentDate;

    private AppointmentState appointmentState;

}
