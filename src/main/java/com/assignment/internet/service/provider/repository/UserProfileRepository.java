package com.assignment.internet.service.provider.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserProfileRepository {

    public boolean userProfileExists(Long userId) {
        // Make the DB query here to check if user ID exists in DB
        return userId == 101;
    }
}
