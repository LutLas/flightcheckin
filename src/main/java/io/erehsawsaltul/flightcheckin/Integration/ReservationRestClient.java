package io.erehsawsaltul.flightcheckin.Integration;

import io.erehsawsaltul.flightcheckin.entities.Reservation;
import io.erehsawsaltul.flightcheckin.entities.UpdateReservationRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Integer id);
	
	public Reservation updateReservation(UpdateReservationRequest request);
}
