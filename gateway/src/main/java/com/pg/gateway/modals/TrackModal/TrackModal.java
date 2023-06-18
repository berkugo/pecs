package com.pg.gateway.modals.TrackModal;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import com.pg.gateway.modals.TrackModal.Kinematics.TrackKinematicsModal;

@RedisHash
public class TrackModal implements Serializable {

    @Id
    Long trackId = (long) 0;

    Long sourceTn = (long) 00001;

    TrackKinematicsModal kinematics;

    public Long getTrackId() {
        return trackId;
    }

    public void setTrackId(Long trackId) {
        this.trackId = trackId;
    }

    public Long getSourceTn() {
        return sourceTn;
    }

    public void setSourceTn(Long sourceTn) {
        this.sourceTn = sourceTn;
    }

    public TrackKinematicsModal getKinematics() {
        return kinematics;
    }

    public void setKinematics(TrackKinematicsModal kinematics) {
        this.kinematics = kinematics;
    }

}
