package by.tc.task01.entity.criteria.command;

import by.tc.task01.entity.criteria.SearchCriteria;

public class LaptopEnum implements CommandSort{

    public Enum [] execute(){

        return SearchCriteria.Laptop.values();
    }

}
