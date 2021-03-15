package io.erehsawsaltul.flightcheckin.Integration.Impl;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import io.erehsawsaltul.flightcheckin.Integration.ReservationRestClient;
import io.erehsawsaltul.flightcheckin.entities.Reservation;
import io.erehsawsaltul.flightcheckin.entities.UpdateReservationRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {

	private static final String RESERVATION_REST_URL = "http://localhost:8080/flightReservation/reservations/";

	@Override
	public Reservation findReservation(Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(RESERVATION_REST_URL+id, Reservation.class);
	}

	@Override
	public Reservation updateReservation(UpdateReservationRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(RESERVATION_REST_URL, request, Reservation.class);
	}
}
