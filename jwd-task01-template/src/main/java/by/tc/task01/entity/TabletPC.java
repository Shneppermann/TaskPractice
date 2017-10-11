package by.tc.task01.entity;

import java.io.Serializable;

public class TabletPC extends Appliance implements Serializable{


    private int batteryCapacity;
    private int displayInches;
    private int memoryROM;
    private int flashMemoryCapacity;
    private String color;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TabletPC(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TabletPC tabletPC = (TabletPC) o;

        if (batteryCapacity != tabletPC.batteryCapacity) return false;
        if (displayInches != tabletPC.displayInches) return false;
        if (memoryROM != tabletPC.memoryROM) return false;
        if (flashMemoryCapacity != tabletPC.flashMemoryCapacity) return false;
        return color.equals(tabletPC.color);
    }

    @Override
    public int hashCode() {
        int result = batteryCapacity;
        result = 31 * result + displayInches;
        result = 31 * result + memoryROM;
        result = 31 * result + flashMemoryCapacity;
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryROM=" + memoryROM +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }

    // you may add your own code here
}
