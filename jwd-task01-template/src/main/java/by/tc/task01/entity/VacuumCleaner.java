package by.tc.task01.entity;

import java.io.Serializable;

public class VacuumCleaner extends Appliance implements Serializable{


    private int powerConsumption;
    private char filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public char getFilterType() {
        return filterType;
    }

    public void setFilterType(char filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    public VacuumCleaner(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VacuumCleaner that = (VacuumCleaner) o;

        if (powerConsumption != that.powerConsumption) return false;
        if (filterType != that.filterType) return false;
        if (motorSpeedRegulation != that.motorSpeedRegulation) return false;
        if (cleaningWidth != that.cleaningWidth) return false;
        if (!bagType.equals(that.bagType)) return false;
        return wandType.equals(that.wandType);
    }

    @Override
    public int hashCode() {
        int result = powerConsumption;
        result = 31 * result + (int) filterType;
        result = 31 * result + bagType.hashCode();
        result = 31 * result + wandType.hashCode();
        result = 31 * result + motorSpeedRegulation;
        result = 31 * result + cleaningWidth;
        return result;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption=" + powerConsumption +
                ", filterType=" + filterType +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }

    // you may add your own code here
}
