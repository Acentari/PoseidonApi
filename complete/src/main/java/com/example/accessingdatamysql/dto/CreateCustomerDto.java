package com.example.accessingdatamysql.dto;
import javax.validation.constraints.*;

public class CreateCustomerDto{
    @NotNull
    @NotEmpty
    @Pattern(regexp="[0-9]*")
    public String phone;

    @NotNull
    @NotEmpty
    @Pattern(regexp="[A-Za-z]*")
    public String name;

    @NotNull
    @NotEmpty
    @Pattern(regexp="[A-Za-z]* [0-9]*")
    public String street;

    @NotNull
    @NotEmpty
    @Pattern(regexp="[0-9]*")
    public String postcode;

    @NotNull
    @NotEmpty
    @Pattern(regexp="[A-Za-z]*")
    public String location;

    @NotNull
    @NotEmpty
    public String particularities;

    @NotNull
    @NotEmpty
    public String trial;
}
