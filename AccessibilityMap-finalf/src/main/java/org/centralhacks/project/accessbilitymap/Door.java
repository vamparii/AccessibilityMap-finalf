package org.centralhacks.project.accessbilitymap;

public class Door extends AccessibilityFeature {
    private DoorDirection direction = DoorDirection.BOTH;

    public Door() {}
    public Door(DoorDirection direction) {
        this.direction = direction;
    }
    public Door(Position position, DoorDirection direction) {
        super(position);
        this.direction = direction;
    }
    public Door(Position position) {
        super(position);
    }

    public DoorDirection getDirection() {return direction;}

    @Override
    public String toString() {
        return direction + " - " + super.toString();
    }
}
