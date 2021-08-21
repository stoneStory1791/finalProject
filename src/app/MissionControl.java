package app;

import java.io.File;
import java.io.FileNotFoundException;
import static modules.TModule.linearSearch;
import static modules.TModule.quickSort;

public class MissionControl {

    public static void main(String[] args) throws FileNotFoundException {
        String inputLocation = "." + File.separator + "data"
                + File.separator + "spacex_mission_data.csv";
        String outputLocation = "." + File.separator + "results"
                + File.separator + "result.txt";
        FileManager fileManager = new FileManager(inputLocation, outputLocation);
        fileManager.read();
        quickSort(fileManager.getList());
        fileManager.write();

//        Mission mission = new Mission.Builder()
//                                     .setFlightNumber("F1-3")
//                                     .setFailureReason("Collision During Launch")
//                                     .build();
//        System.out.println(mission);
    }
}
