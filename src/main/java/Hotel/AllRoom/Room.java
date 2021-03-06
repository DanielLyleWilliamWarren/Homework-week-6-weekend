package Hotel.AllRoom;

import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {

    protected ArrayList<Guest> guests;
    protected int capacity;

    public Room(ArrayList<Guest> guests, int capacity) {
        this.guests = new ArrayList<>();
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
        return this.guests.size();
    }

    public boolean hasAvaliableCapacity() {
        if(this.capacity > guestCount());
        return true;
    }

    public boolean isBedroomBooked() {
        boolean answer = false;
        if (guestCount() > 0){
            answer = true;
        }
        return answer;
    }


    public String geustsNamesInRoom(){
    ArrayList<String> nameArray = new ArrayList<String>();
    for (Guest guest : guests) nameArray.add(guest.getName());
    return nameArray.toString();
    }
}

