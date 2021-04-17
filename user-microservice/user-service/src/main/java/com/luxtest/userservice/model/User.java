package com.luxtest.userservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(schema = "users", name = "user")
@Data
public class User implements Serializable {

    @Id
    private Long id;

    private String data;
}
