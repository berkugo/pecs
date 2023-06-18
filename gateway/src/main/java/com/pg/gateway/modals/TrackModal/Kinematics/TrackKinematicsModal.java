package com.pg.gateway.modals.TrackModal.Kinematics;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

@RedisHash 
public class TrackKinematicsModal implements Serializable{

    int speed;
    int longitude;
    public int getLongitude() {
        return longitude;
    }
    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
    int latitude;
    
}
