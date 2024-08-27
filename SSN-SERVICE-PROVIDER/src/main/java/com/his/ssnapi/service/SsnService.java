package com.his.ssnapi.service;

import com.his.ssnapi.bindings.CitizenInput;
import com.his.ssnapi.bindings.StateOfCitizen;
import org.springframework.stereotype.Service;

@Service
public class SsnService {

    public StateOfCitizen getCitizenState(CitizenInput citizenInput) {
        Integer citizenSsn = citizenInput.getCitizenSsn()%100;
        StateOfCitizen stateOfCitizen = new StateOfCitizen();
        stateOfCitizen.setCitizenSsn(citizenSsn);
        switch (citizenSsn){
            case 01 -> stateOfCitizen.setStateOfCitizen("California");
            case 02 -> stateOfCitizen.setStateOfCitizen("RhodeIsland");
            case 03 -> stateOfCitizen.setStateOfCitizen("New York");
            case 04 -> stateOfCitizen.setStateOfCitizen("Texas");
            case 05 -> stateOfCitizen.setStateOfCitizen("Florida");
            case 06 -> stateOfCitizen.setStateOfCitizen("Georgia");
            case 07 -> stateOfCitizen.setStateOfCitizen("Washington");

            default -> throw new IllegalArgumentException("Invalid SSN");

        }
        return stateOfCitizen;
    }

}
