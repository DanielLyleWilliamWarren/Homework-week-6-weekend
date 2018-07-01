package Hotel.AllRoom;

import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guests;
    private int capacity;

    public Room(ArrayList<Guest> guests, int capacity) {
        this.guests = guests;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addGuest(Guest guest) {
        if (guests.size() < capacity) {
            this.guests.add(guest);
        }
    }

    public ArrayList<Guest> getGuests(){
        return new ArrayList<>(this.guests);
    }

    public int checkedGuestsOut(){
        guests.clear();
        return guests.size();
    }

    public int guestCount(){
        return guests.size();
    }


    public boolean hasAvaliableCapacity() {
        if(this.capacity > guestCount());
        return true;
    }
}
