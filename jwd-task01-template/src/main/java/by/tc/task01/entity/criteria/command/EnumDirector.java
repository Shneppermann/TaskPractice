package by.tc.task01.entity.criteria.command;

import java.util.HashMap;
import java.util.Map;

public class EnumDirector {

        private Map<String, CommandSort> map = new HashMap<String,CommandSort>();

        public EnumDirector(){
            map.put("Oven", new OvenEnum());
            map.put("Laptop", new LaptopEnum());
            map.put("Refrigerator", new RefrEnum());
            map.put("Speakers", new SpeakersEnum());
            map.put("TabletPC",new TabletPCEnum());
            map.put("VacuumCleaner",new VacuumCleanerEnum());
        }


        public CommandSort getCommand(String enumName){
            CommandSort command;
            command = map.get(enumName);
            return command;
        }

    }


