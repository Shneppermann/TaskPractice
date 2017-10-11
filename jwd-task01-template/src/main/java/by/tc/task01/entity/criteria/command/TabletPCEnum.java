package by.tc.task01.entity.criteria.command;

import by.tc.task01.entity.criteria.SearchCriteria;

public class TabletPCEnum implements CommandSort{

    public Enum [] execute(){

        return SearchCriteria.TabletPC.values();
    }

}
