package Hotel.AllRoom;

import Hotel.Guest;

import java.util.ArrayList;

public class DiningRoom extends Room {

    private String name;

    public DiningRoom(int capacity, String name, ArrayList<Guest> guests){
        super(guests, capacity);
        this.name = name;
    }

    public String getDiningRoomName() {
        return this.name = name;
    }
}
