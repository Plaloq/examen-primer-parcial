package uaslp.enginering.exam.model;

import java.util.ArrayList;


public class Hotel {
    private ArrayList<Reservation> reservations;
    private String name;
    private ArrayList <Room> rooms;

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

    }


    public Hotel() {
        reservations = new ArrayList<>();
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

    public static class Room {
        private int number;
        private String status;
        private RoomStatus roomStatus;

        Room(int number, String status, RoomStatus roomStatus){
            this.number = number;
            this.status = status;
            this.roomStatus = roomStatus;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public RoomStatus getRoomStatus() {
            return roomStatus;
        }

        public void setRoomStatus(RoomStatus roomStatus) {
            this.roomStatus = roomStatus;
        }
    }

    public enum RoomStatus {
        SEMEOLVIDOCOMOCAMBIARELVALOR, DIRTY, CLEAN;
    }
}
