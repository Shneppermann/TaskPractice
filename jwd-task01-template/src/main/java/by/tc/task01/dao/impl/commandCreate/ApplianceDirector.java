package by.tc.task01.dao.impl.commandCreate;

import java.util.HashMap;
import java.util.Map;

public class ApplianceDirector {
    private Map<String, CommandCreate> map = new HashMap<String,CommandCreate>();

    public ApplianceDirector(){
        map.put("Oven", new OvenCreator());
        map.put("Laptop", new LaptopCreator());
        map.put("Refrigerator", new RefrigeratorCreator());
        map.put("Speakers", new SpeakersCreator());
        map.put("TabletPC",new TabletPCCreator());
        map.put("VacuumCleaner",new VacuumCleanerCreator());
    }


    public CommandCreate getCommand(String applianceType){
        CommandCreate command;
        command = map.get(applianceType);
        return command;
    }
}
