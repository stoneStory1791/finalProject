package testing;

import app.Date;
import app.Time;
import coordinates.Point;
import coordinates.Rectangle;
import static modules.TModule.linearSearch;
import static modules.TModule.quickSort;
import utility.List;
import utility.ArrayList;

public class CompareTest {

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" \t \t C O M P A R E   O B J E C T S  ");
        System.out.println(" \t \t    T E S T    P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
    }

    public static void findPoint(){
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();

        Point p1 = new Point(1, 3);
        Point p2 = new Point(5, 8);
        Point p3 = new Point(3, 9);
        Point p4 = new Point(2, 7);
        Point p5 = new Point(1, 8);

        Point[] points = {p1, p4, p5, p2, p3,};

        System.out.println("Where is p2 located?: " + linearSearch(points, p2));

    }

    public static void compareDates(){
        System.out.println();
        System.out.println("*****************COMPARE DATE**********************************");
        System.out.println();
        List<Date> list = new ArrayList<>();
        list.add(new Date("24-Mar-06"));
        list.add(new Date("21-Mar-07"));
        list.add(new Date("3-Aug-08"));
        list.add(new Date("28-Sep-08"));
        list.add(new Date("14-Jul-09"));
        list.add(new Date("4-Jun-10"));
        list.add(new Date("8-Dec-10"));
        list.add(new Date("22-May-12"));
        list.add(new Date("8-Oct-12"));
        list.add(new Date("24-Mar-06"));

        System.out.println("------- DATE: before sorting --------");
        for(int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + ": " + list.get(i));
        }
        System.out.println();

        System.out.println("------- DATE: ordering by year, month, day--------");
        quickSort(list);
        for(int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + " : " + list.get(i));
        }
        System.out.println();
        System.out.println("------- DATE: ordering by year, using comparator--------");
        quickSort(list, Date::compareYears);
        for(int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + " : " + list.get(i));
        }
    }



    public static void compareTimes(){
        System.out.println();
        System.out.println("*****************COMPARE TIME**********************************");
        System.out.println();
        List<Time> list = new ArrayList<>();
        list.add(new Time("11:22"));
        list.add(new Time("21:01"));
        list.add(new Time("15:13"));
        list.add(new Time("02:33"));
        list.add(new Time("01:55"));
        list.add(new Time("9:12"));
        list.add(new Time("20:22"));
        list.add(new Time("19:20"));
        list.add(new Time("18:25"));
        list.add(new Time("05:25"));

        System.out.println("------- TIME: before sorting --------");
        for(int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + ": " + list.get(i));
        }
        System.out.println();

        System.out.println("------- TIME: ordering by time--------");
        quickSort(list);

        for(int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + " : " + list.get(i));
        }
    }
    public static void comparePoints(){
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        List<Point> list = new ArrayList<>();
        list.add(new Point(6, 5));
        list.add(new Point(8, 6));
        list.add(new Point(3, 7));
        list.add(new Point(7, 9));
        list.add(new Point(2, 5));
        list.add(new Point(5, 4));
        list.add(new Point(5, 6));
        list.add(new Point(1, 8));
        list.add(new Point(7, 5));
        list.add(new Point(4, 8));

        System.out.println("------- dimensions: before sorting --------");
        for(int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + ": " + list.get(i));
        }
        System.out.println();

        System.out.println("------- dimensions: natural ordering --------");
        quickSort(list);

        for(int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + " : " + list.get(i));
        }

    }
    public static void compareRectangles(){
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        List<Rectangle> list = new ArrayList<>();
        list.add(new Rectangle(7, 9));
        list.add(new Rectangle(5, 4));
        list.add(new Rectangle(8, 6));
        list.add(new Rectangle(3, 7));
        list.add(new Rectangle(1, 8));
        list.add(new Rectangle(6, 5));
        list.add(new Rectangle(4, 8));
        list.add(new Rectangle(7, 5));
        list.add(new Rectangle(2, 5));
        list.add(new Rectangle(5, 9));

        System.out.println("------- dimensions: before sorting --------");
        for(int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + ": " + list.get(i));
        }

        System.out.println();
        System.out.println("------- dimensions: natural ordering --------");
        quickSort(list);

        for(int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + " : " + list.get(i));
        }

        System.out.println();
        System.out.println("------- areas: different ordering --------");
        quickSort(list, Rectangle::compareAreas);

        // use for i loop instead of for each loop, for each loop is not support by utility.List
        for (int i = 0; i < list.size(); i++){ //Rectangle rectangle : list)
            System.out.println(list.get(i) + ": " + list.get(i).area());
        }

        System.out.println();
        System.out.println("------- perimeters: different ordering --------");
        quickSort(list, Rectangle::comparePerimeters);

        // use for i loop instead of for each loop, for each loop is not support by utility.List
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + ": " + list.get(i).perimeter());
        }
    }
    
    public static void main(String[] args) {
        intro();
//        findPoint();
//        comparePoints();
//        compareRectangles();
        compareDates();
        //compareTimes();
        // TODO: compareMissions, comparePayloads, use comparator for missions, payloads, dates, times
    }
}
