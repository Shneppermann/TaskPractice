package by.tc.task01.dao.impl.commandCreate;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorCreator implements CommandCreate{

    @Override
    public Appliance execute(Object[] obj) {
        Refrigerator result = new Refrigerator();
        result.setPowerConsumption(Integer.parseInt(String.valueOf(obj[0])));
        result.setWeight(Integer.parseInt(String.valueOf(obj[1])));
        result.setFreezerCapacity(Integer.parseInt(String.valueOf(obj[2])));
        result.setOverallCapacity(Double.parseDouble(String.valueOf(obj[3])));
        result.setHeight(Integer.parseInt(String.valueOf(obj[4])));
        result.setWidth(Integer.parseInt(String.valueOf(obj[5])));
        return result;

    }
}
