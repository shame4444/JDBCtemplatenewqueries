package io.pragra.spring2.demo2.Domain;

import lombok.Data;

@Data
public class Guest {
    private int id;
    private String firstName;
    private String lastName;
    private  Address address;
}
