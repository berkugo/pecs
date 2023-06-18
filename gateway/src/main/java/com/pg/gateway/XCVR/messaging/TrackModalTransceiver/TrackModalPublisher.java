package com.pg.gateway.XCVR.messaging.TrackModalTransceiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.pg.gateway.XCVR.messaging.MessagePublisherImpl;
import com.pg.gateway.messages.TrackMessages.TrackMessages;

@Primary
@Service
public class TrackModalPublisher extends MessagePublisherImpl {
    
    @Autowired
    TrackMessages message;

    public void createNewTrackMessage(Long trackId) {

        message.setMessage("createNewTrack");
        message.setTrackId(trackId);
        super.publish(message.getTopic(), message.toString());

    }

}