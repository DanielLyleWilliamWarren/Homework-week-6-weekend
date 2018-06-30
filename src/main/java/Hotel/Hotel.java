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




}




