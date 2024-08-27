package com.his.ssnapi.bindings;

import lombok.Data;

@Data
public class CitizenInput {
    private  Integer citizenSsn;
    private String citizenName;
    private String DOB;
}
