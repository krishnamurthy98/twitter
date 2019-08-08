package com.dbs.twitter.model;
import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
public class Tweet {
    @Id
    @GeneratedValue
    @Getter
    private long id;
    private String message;
    private List<String> mediaUrls;

}

