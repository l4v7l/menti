package org.example.b_oop.a.reservation;

import java.time.LocalDate;

public class RailwayReservation extends Reservation {

    private int seatNumber;

    public RailwayReservation(int reservationId, String customerName, LocalDate date, int roomNumber) {
        super(reservationId, customerName, date);
        this.seatNumber = roomNumber;
    }

    @Override
    public void checkStatus() {
        System.out.println("id = " + reservationId +
                "\ncustoner name = " + customerName +
                "\ndue date = " + date +
                "\nroom number = " + seatNumber);
    }

    public int getRoomNumber() {
        return seatNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.seatNumber = roomNumber;
    }
}
