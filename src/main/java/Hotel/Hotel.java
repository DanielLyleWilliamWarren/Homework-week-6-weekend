package Hotel;

import Hotel.AllRoom.*;
import Hotel.AllRoom.Room;
import java.util.ArrayList;

import static Hotel.AllRoom.BedroomType.SINGLE;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<DiningRoom> diningRooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.diningRooms = diningRooms;
        this.conferenceRooms = conferenceRooms;
    }


    public ArrayList<Bedroom> getBedrooms() {
        return this.bedrooms;
    }

    public ArrayList<DiningRoom> getDiningRoom() {
        return this.diningRooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRoom() {
        return this.conferenceRooms;
    }

    public int bedroomCount() {
        return bedrooms.size();
    }

    public void addABedroom(Bedroom singleBedroom) {
        bedrooms.add(singleBedroom);
    }

    public int diningRoomCount() {
        return diningRooms.size();
    }

    public int conferenceRoomCount() {
        return conferenceRooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRooms.add(conferenceRoom);
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        diningRooms.add(diningRoom);
    }

    public Bedroom findBedroomByNumber(int roomNumber) {
        Bedroom foundRoom = null;
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.getRoomNumber() == roomNumber)
                foundRoom = bedroom;
        }
        return foundRoom;
    }


}


