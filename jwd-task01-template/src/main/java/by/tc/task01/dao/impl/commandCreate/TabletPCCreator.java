package by.tc.task01.dao.impl.commandCreate;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class TabletPCCreator implements CommandCreate {
    @Override
    public Appliance execute(Object[] obj){

        TabletPC result = new TabletPC();
        result.setBatteryCapacity(Integer.parseInt(String.valueOf(obj[0])));
        result.setDisplayInches(Integer.parseInt(String.valueOf(obj[1])));
        result.setMemoryROM(Integer.parseInt(String.valueOf(obj[2])));
        result.setFlashMemoryCapacity(Integer.parseInt(String.valueOf(obj[3])));
        result.setColor(String.valueOf(obj[4]));
        return result;

    }
}
