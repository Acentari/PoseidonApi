package com.example.accessingdatamysql.dto;

import javax.validation.constraints.Pattern;

public class UpdateCustomerDto {
    @Pattern(regexp="[0-9]*")
    public String phone;

    @Pattern(regexp="[A-Za-z]*")
    public String name;

    @Pattern(regexp="[A-Za-z]* [0-9]*")
    public String street;

    @Pattern(regexp="[0-9]*")
    public String postcode;

    @Pattern(regexp="[A-Za-z]*")
    public String location;

    public String particularities;

    public String trial;
}
