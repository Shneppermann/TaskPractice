package by.tc.task01.entity;

import java.io.Serializable;

public class Laptop extends Appliance implements Serializable{


    private double batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double CPU;
    private int displayInches;

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCPU() {
        return CPU;
    }

    public void setCPU(double CPU) {
        this.CPU = CPU;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public Laptop(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        if (Double.compare(laptop.batteryCapacity, batteryCapacity) != 0) return false;
        if (memoryRom != laptop.memoryRom) return false;
        if (systemMemory != laptop.systemMemory) return false;
        if (Double.compare(laptop.CPU, CPU) != 0) return false;
        if (displayInches != laptop.displayInches) return false;
        return os.equals(laptop.os);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(batteryCapacity);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + os.hashCode();
        result = 31 * result + memoryRom;
        result = 31 * result + systemMemory;
        temp = Double.doubleToLongBits(CPU);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + displayInches;
        return result;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", CPU=" + CPU +
                ", displayInches=" + displayInches +
                '}';
    }

    // you may add your own code here
}
