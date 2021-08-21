package testing;

import utility.ArrayList;
import utility.List;
import utility.Iterator;

public class ArrayListTest {

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" \t \t \t M Y   A R R A Y   L I S T ");
        System.out.println(" \t \t \t T E S T   P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
    }

    public static void libraryVersionTest(){
        System.out.println();
        System.out.println(" \t  L I B R A R Y    A P I ");
        java.util.List<String> list = new java.util.ArrayList<>();
        System.out.println(" \t =========== T E S T   A D D =========== ");

        // size() test
        System.out.println(list);
        System.out.println("list size: " + list.size());
        System.out.println();

        System.out.println(" \t =========== T E S T   A D D =========== ");

        // add(item) check
        list.add("Tom");
        System.out.println(list);
        list.add("Ben");
        System.out.println(list);
        list.add("Sam");
        System.out.println(list);
        list.add("John");
        System.out.println(list);
        list.add("Tim");
        list.add("Will");
        list.add("John");
        list.add("Bob");
        list.add("Matt");
        list.add("Jim");
        System.out.println();

        System.out.println(" \t =========== T E S T   R E M O V E =========== ");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("Item Removed From Index 1: " + list.remove(1));
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("Item Removed From Index 4: " + list.remove(4));
        System.out.println(list.size());
        System.out.println(list);

//        // ensureCapacity() test
//        System.out.println(" == A D D  1 1 t h  I T E M == ");
//        list.add("Tim");
//        System.out.println(list);
//        System.out.println();
//
//        // remove(index) test
//        System.out.println(" == R E M O V E  T E S T  ( I N D E X ) == ");
//        list.remove(9);
//        System.out.println(list);
//        list.remove(8);
//        System.out.println(list);
//        list.remove(7);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//        System.out.println();
//
//        // remove(index) test
//        System.out.println(" == R E M O V E  T E S T  ( I T E M ) == ");
//        list.remove("Tim");
//        System.out.println(list);
//        System.out.println();
//
//        // add(index, item) test
//        System.out.println(" == A D D  A T  I N D E X == ");
//        list.add(4, "Not Tim");
//        System.out.println(list);
//        System.out.println();
//
//        // set(index, item) test
//        System.out.println(" == S E T   T E S T == ");
//        list.set(0, "Lauren");
//        System.out.println(list);
//        System.out.println();
//
//        // contains(item) test
//        System.out.println("== C O N T A I N S  T E S T ==");
//        System.out.println("Does list contain John? " + list.contains("John"));
//        System.out.println();
//
//        // get(index) test
//        System.out.println("== G E T   T E S T ==");
//        System.out.println("Index 3's value is: " + list.get(3));
//        System.out.println();
//
//        // indexOf(item) test
//        System.out.println("== I N D E X   T E S T ==");
//        System.out.println("John is at index: " + list.indexOf("John"));
//        System.out.println();
//
//        // clear() test
//        System.out.println("list size before clear: " + list.size());
//        list.clear();
//        System.out.println("list size after clear: " + list.size());

        // Iterator test
        System.out.println("== I T E R A T O R    T E S T ==");
        java.util.Iterator<String> itr = list.iterator();
        System.out.println(list);

        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println();

    }

    public static void myVersionTest(){
        System.out.println();
        System.out.println(" \t  M Y   A P I ");
        List<String> list = new ArrayList<>();
        System.out.println(" \t =========== T E S T   A D D =========== ");
        // isEmpty() test
        System.out.println("Is the array empty? " + list.isEmpty());
        System.out.println();

        // size() test
        System.out.println(list);
        System.out.println("list size: " + list.size());
        System.out.println();

        System.out.println(" \t =========== T E S T   A D D =========== ");

        // add(item) check
        list.add("Tom");
        System.out.println(list);
        list.add("Ben");
        System.out.println(list);
        list.add("Sam");
        System.out.println(list);
        list.add("John");
        System.out.println(list);
        list.add("Tim");
        list.add("Will");
        list.add("John");
        list.add("Bob");
        list.add("Matt");
        list.add("Jim");
        System.out.println();

        System.out.println(" \t =========== T E S T   R E M O V E =========== ");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("Item Removed From Index 1: " + list.remove(1));
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("Item Removed From Index 4: " + list.remove(4));
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(" \t =========== T E S T   C L E A R =========== ");
        list.clear();
        System.out.println("Size: " + list.size());
        System.out.println(list);

//        // ensureCapacity() test
//        System.out.println(" == A D D  1 1 t h  I T E M == ");
//        list.add("Tim");
//        System.out.println(list);
//        System.out.println();
//
//        // remove(index) test
//        System.out.println(" == R E M O V E  T E S T  ( I N D E X ) == ");
//        list.remove(9);
//        System.out.println(list);
//        list.remove(8);
//        System.out.println(list);
//        list.remove(7);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//        System.out.println();
//
//        // remove(index) test
//        System.out.println(" == R E M O V E  T E S T  ( I T E M ) == ");
//        list.remove("Tim");
//        System.out.println(list);
//        System.out.println();
//
//        // add(index, item) test
//        System.out.println(" == A D D  A T  I N D E X == ");
//        list.add(4, "Not Tim");
//        System.out.println(list);
//        System.out.println();
//
//        // set(index, item) test
//        System.out.println(" == S E T   T E S T == ");
//        list.set(0, "Lauren");
//        System.out.println(list);
//        System.out.println();
//
//        // contains(item) test
//        System.out.println("== C O N T A I N S  T E S T ==");
//        System.out.println("Does list contain John? " + list.contains("John"));
//        System.out.println();
//
//        // get(index) test
//        System.out.println("== G E T   T E S T ==");
//        System.out.println("Index 3's value is: " + list.get(3));
//        System.out.println();
//
//        // indexOf(item) test
//        System.out.println("== I N D E X   T E S T ==");
//        System.out.println("John is at index: " + list.indexOf("John"));
//        System.out.println();
//
//        // clear() test
//        System.out.println("list size before clear: " + list.size());
//        list.clear();
//        System.out.println("list size after clear: " + list.size());

        // Iterator test
        System.out.println("== I T E R A T O R    T E S T ==");
        Iterator<String> itr = list.iterator();
        System.out.println(list);

        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println();

    }

    public static void main(String[] args) {
        intro();
        //libraryVersionTest();
        myVersionTest();
    }
}
