package com.buyern.authentication.models;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.util.Date;

@Data
@RedisHash("login_tracker")
public class LoginTracker {
    @Id
    private Long id;
    private String userUid;
    private Date lastLoginTime = new Date();
}
