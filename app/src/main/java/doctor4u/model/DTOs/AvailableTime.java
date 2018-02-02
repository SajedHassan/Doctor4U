package doctor4u.model.DTOs;


import java.util.ArrayList;

public class AvailableTime {
    String day;


    //array list because he may have more than 1 period a day
    //eg  from 3 to 5 and from 9 to 11
    public ArrayList<Float> startingHours;
    public ArrayList<Float> endingHours;
}
