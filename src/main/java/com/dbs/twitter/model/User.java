package com.dbs.twitter.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table
public class User {
    public User(){}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name cannot be null")
    private String name;


    public User(long id, String name){
        this.id = id;
        this.name = name;
    }
    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
