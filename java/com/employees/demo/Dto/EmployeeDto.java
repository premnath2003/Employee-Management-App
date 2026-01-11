package com.employees.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private long id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeDto(Object id, Object firstName, Object lastName, Object email) {
    }

    public Object getId() {
        return null;
    }

    public Object getFirst() {
        return null;
    }

    public Object getLastName() {
        return null;
    }

    public Object getEmail() {
        return null;
    }

    public Object getFirstName() {
        return null;
    }
}
