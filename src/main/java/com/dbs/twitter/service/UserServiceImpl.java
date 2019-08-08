package com.dbs.twitter.service;

import com.dbs.twitter.model.Tweet;
import com.dbs.twitter.model.User;
import com.dbs.twitter.repository.TweetRepository;
import com.dbs.twitter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TweetRepository tweetRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository){ this.userRepository=userRepository;}

    @Override
    @Transactional
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public List<User> listAll() {
         return this.userRepository.findAll();
    }

    @Override
    @Transactional
    public User findById(long id) {
        return this.userRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        this.userRepository.delete(this.userRepository.findById(id).get());
    }

    @Override
    public Tweet saveTweet(Tweet tweet) { return tweetRepository.save(tweet); }

    @Override
    public List<Tweet> listAllTweet() {
        return tweetRepository.findAll();
    }

    @Override
    public Tweet findTweetById(long id) {
        return this.tweetRepository.findById(id).get();
    }

    @Override
    public void deleteTweet(long id) {
        this.tweetRepository.delete(this.tweetRepository.findById(id).get());
    }
}
