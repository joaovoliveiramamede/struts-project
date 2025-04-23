package com.example.struts.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonRequest implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
