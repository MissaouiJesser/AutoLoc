package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Reservation;

import java.util.Set;

public interface IReservationService {

    Set<Reservation> retrieveAllReservations();

    Reservation retrieveReservation(Long reservationId);

    Reservation addReservation(Reservation reservation);

    void removeReservation(Long reservationId);

    Reservation modifyReservation(Reservation reservation);
}