package Hotel;

import Hotel.AllRoom.Bedroom;
import Hotel.AllRoom.ConferenceRoom;
import Hotel.AllRoom.DiningRoom;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<DiningRoom> diningRooms, ArrayList<ConferenceRoom> conferenceRooms){
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

    public int conferenceRoomCount(){
        return conferenceRooms.size();
    }
}




