package com.uregenrumeysa.adsm.bean.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class AppointmentId implements Serializable {

    @Column(name = "dentist_id")
    private Long dentistId;

    @Column(name = "patient_id")
    private Long patientId;

    public AppointmentId(){
    }

    public AppointmentId(Long dentistId,Long patientId){
        this.dentistId = dentistId;
        this.patientId = patientId;
    }

    @Override
    public boolean equals(Object data){
        if(data instanceof AppointmentId){
            if(((AppointmentId) data).getDentistId() == this.dentistId
                    && ((AppointmentId) data).getPatientId() == this.patientId)
                return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.dentistId, this.patientId);
    }
}
