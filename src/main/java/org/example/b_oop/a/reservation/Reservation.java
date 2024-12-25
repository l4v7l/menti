package org.example.b_oop.a.reservation;

import java.time.LocalDate;

public abstract class Reservation {

    protected int reservationId;
    protected String customerName;
    protected LocalDate date;

    public Reservation(int reservationId, String customerName, LocalDate date) {
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.date = date;
    }

    public abstract void checkStatus();

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
