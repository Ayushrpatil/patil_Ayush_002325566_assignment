package info5100.university.example.Campus;

import java.util.ArrayList;

/**
 * Represents a building on the campus with a number, address, and a list of floors.
 */
public class Building {
    private int number;  // Building number
    private ArrayList<Floor> floors;  // List of floors in the building
    private Address address;  // Address of the building

    /**
     * Constructor to create a Building with a specific number and address.
     * 
     * @param number The building number.
     * @param address The address of the building.
     */
    public Building(int number, Address address) {
        this.number = number;
        this.address = address;
        this.floors = new ArrayList<>();  // Initialize the list of floors
    }

    /**
     * Adds a new floor to the building.
     * 
     * @param number The floor number.
     * @return The newly added Floor object.
     */
    public Floor addNewFloor(int number) {
        Floor floor = new Floor(number, this);  // Create a new floor and associate it with the building
        floors.add(floor);  // Add the floor to the list of floors
        return floor;
    }

    /**
     * Checks if the building is safe by ensuring all floors are safe.
     * 
     * @return True if all floors are safe, false otherwise.
     */
    public Boolean isBuildingSafe() {
        // Building is safe if all floors are safe
        for (Floor floor : floors) {
            if (!floor.isFloorSafe()) {
                return false;  // If any floor is unsafe, the building is not safe
            }
        }
        return true;  // All floors are safe, so the building is safe
    }

    // Getters and setters for number, floors, and address (optional, if needed)
}
