package by.tc.task01.entity;

import java.io.Serializable;


public class Refrigerator extends Appliance implements Serializable{

    private int PowerConsumption;
    private int Weight;
    private int FreezerCapacity;
    private double OverallCapacity;
    private int Height;
    private int Width;

    public int getPowerConsumption() {
        return PowerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        PowerConsumption = powerConsumption;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getFreezerCapacity() {
        return FreezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        FreezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return OverallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        OverallCapacity = overallCapacity;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public Refrigerator(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Refrigerator that = (Refrigerator) o;

        if (PowerConsumption != that.PowerConsumption) return false;
        if (Weight != that.Weight) return false;
        if (FreezerCapacity != that.FreezerCapacity) return false;
        if (Double.compare(that.OverallCapacity, OverallCapacity) != 0) return false;
        if (Height != that.Height) return false;
        return Width == that.Width;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = PowerConsumption;
        result = 31 * result + Weight;
        result = 31 * result + FreezerCapacity;
        temp = Double.doubleToLongBits(OverallCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + Height;
        result = 31 * result + Width;
        return result;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "PowerConsumption=" + PowerConsumption +
                ", Weight=" + Weight +
                ", FreezerCapacity=" + FreezerCapacity +
                ", OverallCapacity=" + OverallCapacity +
                ", Height=" + Height +
                ", Width=" + Width +
                '}';
    }

    // you may add your own code here
}
