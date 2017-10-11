package by.tc.task01.dao.impl.commandCreate;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class SpeakersCreator implements CommandCreate {
    @Override
    public Appliance execute(Object[] obj) {
        Speakers result = new Speakers();
        result.setPowerConsumption(Integer.parseInt(String.valueOf(obj[0])));
        result.setNumberOfSpeakers(Integer.parseInt(String.valueOf(obj[1])));
        result.setFrequencyRange(String.valueOf(obj[2]));
        result.setCordLenght(Integer.parseInt(String.valueOf(obj[3])));
        return result;

    }
}
