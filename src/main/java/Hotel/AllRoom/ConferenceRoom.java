package Hotel.AllRoom;

import Hotel.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {
    private String name;
    private double dailyRate;

    public ConferenceRoom(int capacity, ArrayList<Guest> guests, String name, double dailyRate) {
        super(guests, capacity);
        this.name = name;
        this.dailyRate = dailyRate;

    }

    public String getConferenceRoomName() {
        return this.name;
    }
}

