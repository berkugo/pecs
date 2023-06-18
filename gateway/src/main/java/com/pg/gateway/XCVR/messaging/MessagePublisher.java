package com.pg.gateway.XCVR.messaging;

import org.springframework.data.redis.listener.ChannelTopic;

public interface MessagePublisher {
    void publish(ChannelTopic topic, String message);
}