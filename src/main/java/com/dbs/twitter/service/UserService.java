package com.dbs.twitter.service;

import com.dbs.twitter.model.Tweet;
import com.dbs.twitter.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {
    User saveUser(User user);
    List<User> listAll();
    User findById(long id);
    void deleteUser(long id);

//    Tweet saveTweet(Tweet tweet);
//    List<Tweet> listAllTweet();
//    Tweet findTweetById(long id);
//    void deleteTweet(long id);
}
