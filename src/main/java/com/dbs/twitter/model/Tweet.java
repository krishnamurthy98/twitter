package com.dbs.twitter.model;

import javax.persistence.*;
import java.util.Objects;

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

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "tid=" + tid +
                ", message='" + message + '\'' +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tweet tweet = (Tweet) o;
        return tid == tweet.tid &&
                Objects.equals(message, tweet.message) &&
                Objects.equals(user, tweet.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tid, message, user);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
