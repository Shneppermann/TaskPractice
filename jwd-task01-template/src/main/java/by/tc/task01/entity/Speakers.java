package by.tc.task01.entity;

import java.io.Serializable;


public class Speakers extends Appliance implements Serializable{

    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLenght;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLenght() {
        return cordLenght;
    }

    public void setCordLenght(int cordLenght) {
        this.cordLenght = cordLenght;
    }

    public Speakers(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Speakers speakers = (Speakers) o;

        if (powerConsumption != speakers.powerConsumption) return false;
        if (numberOfSpeakers != speakers.numberOfSpeakers) return false;
        if (cordLenght != speakers.cordLenght) return false;
        return frequencyRange.equals(speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        int result = powerConsumption;
        result = 31 * result + numberOfSpeakers;
        result = 31 * result + frequencyRange.hashCode();
        result = 31 * result + cordLenght;
        return result;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLenght=" + cordLenght +
                '}';
    }

}
