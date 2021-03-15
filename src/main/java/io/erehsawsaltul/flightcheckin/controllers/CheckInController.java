package io.erehsawsaltul.flightcheckin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.erehsawsaltul.flightcheckin.Integration.ReservationRestClient;
import io.erehsawsaltul.flightcheckin.entities.Reservation;
import io.erehsawsaltul.flightcheckin.entities.UpdateReservationRequest;

@Controller
public class CheckInController {

	@Autowired
	ReservationRestClient reservationRestClient;

	@RequestMapping("/showStartCheckIn")
	public String showStartCheckIn() {
		return "startCheckIn";
	}

	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("reservationId") Integer reservationId, ModelMap modelMap) {
		Reservation reservation = reservationRestClient.findReservation(reservationId);
		modelMap.addAttribute("reservation", reservation);
		return "displayReservationDetails";
	}

	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") Integer reservationId, ModelMap modelMap,
			@RequestParam("numberOfBags") int numberOfBags) {
		UpdateReservationRequest reservationUpdateRequest = new UpdateReservationRequest();
		reservationUpdateRequest.setId(reservationId);
		reservationUpdateRequest.setCheckedIn(true);
		reservationUpdateRequest.setNumberOfBags(numberOfBags);
		Reservation updatedReservation = reservationRestClient.updateReservation(reservationUpdateRequest);
		modelMap.addAttribute("updatedReservation", updatedReservation);
		return "checkInConfirmation";
	}
}
