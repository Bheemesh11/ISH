package com.his.ssnapi.rest;

import com.his.ssnapi.bindings.CitizenInput;
import com.his.ssnapi.bindings.StateOfCitizen;
import com.his.ssnapi.service.SsnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ssnapi")
public class SsnController {

    @Autowired
    SsnService ssnService;

    @PostMapping("/getState")
    public ResponseEntity<StateOfCitizen> getState(@RequestBody CitizenInput citizenInput) {
        StateOfCitizen citizenState = ssnService.getCitizenState(citizenInput);
        return ResponseEntity.ok(citizenState);
    }
}
