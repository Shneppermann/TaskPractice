package by.tc.task01.dao.impl.commandCreate;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

public class LaptopCreator implements CommandCreate{
    @Override
    public Appliance execute(Object[] obj){
        Laptop result = new Laptop();
        result.setBatteryCapacity(Double.parseDouble(String.valueOf(obj[0])));
        result.setOs(String.valueOf(obj[1]));
        result.setMemoryRom(Integer.parseInt(String.valueOf(obj[2])));
        result.setSystemMemory(Integer.parseInt(String.valueOf(obj[3])));
        result.setCPU(Double.parseDouble(String.valueOf(obj[4])));
        result.setDisplayInches(Integer.parseInt(String.valueOf(obj[5])));
        return result;
    }
}
