package com.pg.gateway.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.pg.gateway.modals.TrackModal.TrackModal;



@Repository
public class TrackModalRepository {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void saveTrackModal(String key, Long id, Object value) {
        redisTemplate.opsForHash().put(key, id, value);
    }

    public TrackModal getTrackModal(String key, Long id) {
        return (TrackModal) redisTemplate.opsForHash().get(key, id);
    }

    public void deleteTrackModal(String key, Long id) {
        redisTemplate.opsForHash().delete(key, id);
    }

}
