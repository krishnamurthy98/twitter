package com.dbs.twitter.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

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
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Tweet> tweets = new HashSet<>();

    public void addTweet(Tweet tweet){
        this.tweets.add(tweet);
        tweet.setUser(this);
    }
}
