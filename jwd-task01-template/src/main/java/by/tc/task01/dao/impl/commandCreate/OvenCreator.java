package by.tc.task01.dao.impl.commandCreate;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

public class OvenCreator implements CommandCreate {
    @Override
    public Appliance execute(Object[] obj){
        Oven result = new Oven();
        result.setPowerConsumption(Integer.parseInt(String.valueOf(obj[0])));
        result.setWeight(Integer.parseInt(String.valueOf(obj[1])));
        result.setCapacity(Integer.parseInt(String.valueOf(obj[2])));
        result.setDepth(Integer.parseInt(String.valueOf(obj[3])));
        result.setHeight(Double.parseDouble(String.valueOf(obj[4])));
        result.setWidth(Double.parseDouble(String.valueOf(obj[5])));
        return result;
    }
}
