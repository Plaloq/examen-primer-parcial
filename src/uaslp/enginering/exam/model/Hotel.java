package uaslp.enginering.exam.model;

import java.util.ArrayList;


public class Hotel {
    private ArrayList<Reservation> reservations;
    private String name;
    private ArrayList <Room> rooms;
    private int pools=0;
    private int gyms=0;

    public Hotel(String name) {
        setName(name);
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

    public void addPool(){
        pools++;
    }

    public void addGym(){
        gyms++;
    }

    public int getPools() {
        return pools;
    }

    public int getGyms() {
        return gyms;
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
