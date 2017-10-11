package by.tc.task01.entity.criteria.command;

import by.tc.task01.entity.criteria.SearchCriteria;

public class VacuumCleanerEnum implements CommandSort{

    public Enum [] execute(){

        return SearchCriteria.VacuumCleaner.values();
    }

}
