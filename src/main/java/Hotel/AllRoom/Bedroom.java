package Hotel.AllRoom;

import Hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room{

    private int roomNumber;
    private double nightlyRate;

    public Bedroom(int roomNumber, ArrayList<Guest> guests, BedroomType bedroomType) {
        super(guests, bedroomType.getCapacity());
        this.roomNumber = roomNumber;
        this.nightlyRate = bedroomType.getNightlyRate();
    }


    public int getRoomNumber() {
        return this.roomNumber;
    }

    public double getDailyRate() {
        return this.nightlyRate;
    }
}
