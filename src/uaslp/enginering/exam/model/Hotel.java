package uaslp.enginering.exam.model;

import java.util.ArrayList;


public class Hotel {
    private ArrayList<Reservation> reservations;
    private String name;
    private ArrayList <Room> rooms;

    public Hotel() {
        reservations = new ArrayList<>();
        rooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room){
        rooms.add(room);
    }




    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }



    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

}
