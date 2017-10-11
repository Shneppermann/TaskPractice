package by.tc.task01.dao.impl.commandCreate;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerCreator implements CommandCreate{
    @Override
    public Appliance execute(Object[] obj){
        VacuumCleaner result = new VacuumCleaner();
        result.setPowerConsumption(Integer.parseInt(String.valueOf(obj[0])));
        result.setFilterType(String.valueOf(obj[1]).charAt(0));
        result.setBagType(String.valueOf(obj[2]));
        result.setWandType(String.valueOf(obj[3]));
        result.setMotorSpeedRegulation(Integer.parseInt(String.valueOf(obj[4])));
        result.setCleaningWidth(Integer.parseInt(String.valueOf(obj[5])));
        return result;

    }
}
