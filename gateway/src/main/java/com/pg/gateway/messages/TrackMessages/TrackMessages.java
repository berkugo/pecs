package com.pg.gateway.messages.TrackMessages;

import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Component;

@Component
public class TrackMessages {

    Long trackId;

    String message;

    ChannelTopic topic;

    String channelTopicName = "TrackMessage";

    public ChannelTopic getTopic() {
        return topic;
    }

    public TrackMessages() {
        topic = new ChannelTopic(channelTopicName);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTrackId(Long trackId) {
        this.trackId = trackId;
    }

}
