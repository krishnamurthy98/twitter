package com.dbs.twitter.model;

import javax.persistence.*;

@Entity
@Table
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tid;
    private String message;
    @ManyToOne
    @JoinColumn(name = "t_id" , nullable = false)
    private User user;

}
