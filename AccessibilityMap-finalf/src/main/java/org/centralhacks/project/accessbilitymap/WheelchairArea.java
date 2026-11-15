package org.centralhacks.project.accessbilitymap;

public class WheelchairArea extends AccessibilityFeature {
    private boolean motorized;

    public WheelchairArea() {}
    public WheelchairArea(boolean motorized) {
        super();
        this.motorized = motorized;
    }
    public WheelchairArea(Position position, boolean motorized) {
        super(position);
        this.motorized = motorized;
    }
    public WheelchairArea(Position position) {
        super(position);
    }

    public boolean getMotorized() {return motorized;}

    @Override
    public String toString() {
        if (motorized) {
            return super.toString()+", is motorized.";
        } else {
            return super.toString()+", is not motorized.";
        }
    }
}
