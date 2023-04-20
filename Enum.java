enum Weekday{
     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class EnumExample{
    public static void main (String[] args){
        Weekday day= Weekday.SUNDAY;

        for(Weekday wd:Weekday.values()){
            System.out.println(wd);
        }
        //System.out.println(day);
    }
}