package uaslp.enginering.exam.model;

public class Room {
    private int number;
    private String description;
    private RoomStatus roomStatus;

    public Room(int number, String description, RoomStatus roomStatus) {
        this.number = number;
        this.description = description;
        this.roomStatus = roomStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }
}
