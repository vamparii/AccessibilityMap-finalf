package org.centralhacks.project.accessbilitymap;

public class AccessibilityFeature {
    private Position position;

    public AccessibilityFeature() {}
    public AccessibilityFeature(Position position) {
        this.position = position;
    }

    public Position getPosition() {return position;}

    @Override
    public String toString() {
        if (position!=null) {
            return position.toString();
        } else {
            return "exists";
        }
    }
}
