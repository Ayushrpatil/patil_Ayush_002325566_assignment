package info5100.university.example.Campus;

import java.util.ArrayList;
import java.util.List;

class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}

class Room {
    private String roomNumber;
    private boolean hasSprinkler;

    public Room(String roomNumber, boolean hasSprinkler) {
        this.roomNumber = roomNumber;
        this.hasSprinkler = hasSprinkler;
    }

    public boolean isSafe() {
        return hasSprinkler; // Room is safe if it has a sprinkler
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + (hasSprinkler ? " (Sprinkler installed)" : " (No Sprinkler)");
    }
}

class Floor {
    private String floorNumber;
    private List<Room> rooms;

    public Floor(String floorNumber) {
        this.floorNumber = floorNumber;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public boolean isSafe() {
        for (Room room : rooms) {
            if (!room.isSafe()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Floor " + floorNumber + ": " + rooms.size() + " rooms";
    }
}

class Building {
    private String name;
    private List<Floor> floors;

    public Building(String name) {
        this.name = name;
        this.floors = new ArrayList<>();
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public boolean isSafe() {
        for (Floor floor : floors) {
            if (!floor.isSafe()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return name + " (" + floors.size() + " floors)";
    }
}

class Campus {
    private String campusName;
    private Address address;
    private List<Building> buildings;

    public Campus(String campusName, Address address) {
        this.campusName = campusName;
        this.address = address;
        this.buildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public boolean isSafe() {
        for (Building building : buildings) {
            if (!building.isSafe()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return campusName + " located at " + address.toString();
    }
}

public class CampusMainExample {

    public static void main(String[] args) {
        // Step 0: Create Address object
        Address campusAddress = new Address("123 Main St", "Boston", "MA", "02118");

        // Step 1: Create campus object
        Campus campus = new Campus("Northeastern University", campusAddress);

        // Step 2: Create and add buildings
        Building building1 = new Building("Snell Library");
        Building building2 = new Building("Curry Student Center");

        // Step 3: Create and add floors to buildings
        Floor floor1 = new Floor("1st Floor");
        Floor floor2 = new Floor("2nd Floor");

        // Step 4: Create and add rooms to floors
        Room room1 = new Room("101", true); // Room with sprinkler
        Room room2 = new Room("102", false); // Room without sprinkler
        Room room3 = new Room("201", true);

        floor1.addRoom(room1);
        floor1.addRoom(room2);
        floor2.addRoom(room3);

        building1.addFloor(floor1);
        building1.addFloor(floor2);

        // Add buildings to campus
        campus.addBuilding(building1);
        campus.addBuilding(building2);

        // Step 5: Check if campus is safe
        System.out.println("Campus safety check: " + (campus.isSafe() ? "Safe" : "Not Safe"));
    }
}
