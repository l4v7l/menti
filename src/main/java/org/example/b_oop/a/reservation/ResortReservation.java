package org.example.b_oop.a.reservation;

import java.time.LocalDate;

public class ResortReservation extends Reservation {

    private int roomNumber;

    public ResortReservation(int reservationId, String customerName, LocalDate date, int roomNumber) {
        super(reservationId, customerName, date);
        this.roomNumber = roomNumber;
    }

    @Override
    public void checkStatus() {
        System.out.println("id = " + reservationId +
                "\ncustoner name = " + customerName +
                "\ndue date = " + date +
                "\nroom number = " + roomNumber);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
