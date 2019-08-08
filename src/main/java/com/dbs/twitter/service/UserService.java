package com.dbs.twitter.service;

import com.dbs.twitter.model.Tweet;
import com.dbs.twitter.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> listAll();
    User findById(long id);
    void deleteUser(long id);

    Tweet saveTweet(Tweet tweet);
    List<Tweet> listAllTweet();
    Tweet findTweetById(long id);
    void deleteTweet(long id);
}
