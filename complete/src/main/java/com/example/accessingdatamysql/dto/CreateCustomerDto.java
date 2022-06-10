package com.example.accessingdatamysql.dto;
import javax.validation.constraints.*;

public class CreateCustomerDto{
    @NotNull(message = "phone must not be null")
    @NotEmpty(message = "phone must not be empty")
    @Pattern(regexp="[0-9]*",message = "Invalid Input")
    public String phone;

    @NotNull(message = "name must not be null")
    @NotEmpty(message = "name must not be empty")
    @Pattern(regexp="[A-Za-z]*",message = "Invalid Input")
    public String name;

    @NotNull
    @NotEmpty
    @Pattern(regexp="[A-Za-z]* [0-9]*",message = "Invalid Input")
    public String street;

    @NotNull(message = "postcode must not be null")
    @NotEmpty(message = "postcode must not be empty")
    @Pattern(regexp="[0-9]*",message = "Invalid Input")
    public String postcode;

    @NotNull(message = "location must not be null")
    @NotEmpty(message = "location must not be empty")
    @Pattern(regexp="[A-Za-z]",message = "Invalid Input")
    public String location;

    @NotNull
    @NotEmpty
    public String particularities;

    @NotNull
    @NotEmpty
    public String trial;
}
