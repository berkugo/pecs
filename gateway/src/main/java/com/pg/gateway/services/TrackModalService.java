package com.pg.gateway.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pg.gateway.repositories.TrackModalRepository;

import com.pg.gateway.XCVR.messaging.TrackModalTransceiver.TrackModalPublisher;
import com.pg.gateway.modals.TrackModal.TrackModal;

@Service
public class TrackModalService {

    final private String MODAL_NAME = "TrackModal";

    @Autowired
    private TrackModalRepository trackModalRepository;

    @Autowired
    private TrackModalPublisher publisher;

    public void setTrack(TrackModal track) {

        trackModalRepository.saveTrackModal(MODAL_NAME, track.getTrackId(), track);
        publisher.createNewTrackMessage(track.getTrackId());

    }

    public void createNewTrack(TrackModal track) {

        trackModalRepository.saveTrackModal(MODAL_NAME, track.getTrackId(), track);
        publisher.createNewTrackMessage(track.getTrackId());
    }

    public TrackModal getTrack(Long trackId) {
        return (TrackModal) trackModalRepository.getTrackModal(MODAL_NAME, trackId);
    }

}
