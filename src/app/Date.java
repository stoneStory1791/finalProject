package app;


public class Date implements Comparable<Date>{
    private final int   day;
    private final Month month;
    private final int   year;

    public Date(){
        this(0, null, 0);
    }

    public Date(String date){
        String[] dateArray = date.split("-");
        this.day     = Integer.parseInt(dateArray[0]);
        this.month   = Month.valueOf(dateArray[1].toUpperCase());
        this.year    = Integer.parseInt(dateArray[2]);
    }

    public Date(int day, Month month, int year) {
        this.day    = day;
        this.month  = month;
        this.year   = year;
    }

    @Override
    public int compareTo(Date other) {
        if(year != other.year)
            return year - other.year;
        else if (!month.equals(other.month))
            return month.compareTo(other.month);
        return day - other.day;
    }

   public static int compareYears(Date first, Date second) {
        return first.year - second.year;
    }

    public boolean equals(Object obj){
        if(obj instanceof Date){
            Date other = (Date) obj;
            return  day == other.day   &&
                    year == other.year &&
                    month.equals(other.month);
        }
            return false;
    }

    public String toCSVFormat(){
        return String.format("%02d",day) + "-" + month + "-" + String.format("%02d",year);
    }

    public String toString() {
        return "Launch Date [day-month-year]: " + this.toCSVFormat();
    }
}
