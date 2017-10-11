package by.tc.task01.entity.criteria.command;

import by.tc.task01.entity.criteria.SearchCriteria;

public class OvenEnum implements CommandSort{

    public Enum [] execute(){

        return SearchCriteria.Oven.values();
    }

}
