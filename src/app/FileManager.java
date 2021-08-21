package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import java.util.Scanner;
import utility.ArrayList;
import utility.List;

public class FileManager {
    private String               csvFileHeader;
    private String               inputFileLocation;
    private String               outDirectory;
    private final List<Mission>  list;

    public FileManager() {
        this("","");
    }
    public FileManager(String inputFileLocation, String outDirectory) {
        this.outDirectory        = outDirectory;
        this.inputFileLocation   = inputFileLocation;
        csvFileHeader            = "Flight Number,Launch Date,Launch Time,Launch Site,Vehicle Type,Payload Name," +
                                    "Payload Type,Payload Mass (kg),Payload Orbit,Customer Name,Customer Type," +
                                    "Customer Country,Mission Outcome,Failure Reason,Landing Type,Landing Outcome";
        list                     = new ArrayList<>();
    }

    private Mission parse(String line) throws IllegalArgumentException {
        String[] str       = line.split(",");
        String[] column    = new String[16];

        //copy any smaller str data to larger array to fix issues with splitting.
        // since empty spot in txt file by using split won't work as what we expected
        for (int i = 0; i < str.length ; i++) {
            column[i]   = str[i];
        }

        //null values at the end is padded with empty strings
        if (str.length < column.length) {
            for (int i = str.length; i < column.length; i++) {
                column[i] = "";

            }
        }
        String      flightNumber    = column[0];
        Date        launchDate      = new Date(column[1]);
        Time        launchTime      = new Time(column[2]);
        String      launchSite      = column[3];
        String      vehicleType     = column[4];
        double      mass            = column[7].equals("") ? 0.0 : Double.parseDouble(column[7]);
        Payload     payload         = new Payload(column[5], column[6], mass, column[8] );
        Customer    customer        = new Customer(column[9], column[10], column[11]);
        String      missionOutcome  = column[12];
        String      failureReason   = column[13];
        String      landingType     = column[14];
        String      landingOutcome  = column [15];

        return new   Mission.Builder()
                      .setFlightNumber(flightNumber)
                      .setLaunchDate(launchDate)
                      .setLaunchTime(launchTime)
                      .setLaunchSite(launchSite)
                      .setVehicleType(vehicleType)
                      .setPayload(payload)
                      .setCustomer(customer)
                      .setMissionOutcome(missionOutcome)
                      .setFailureReason(failureReason)
                      .setLandingType(landingType)
                      .setLandingOutcome(landingOutcome)
                      .build();
    }

    public void read() throws FileNotFoundException {
        File    file      = new File(inputFileLocation);
        Scanner input     = new Scanner(file);
        Mission mission   = null;

        if (input.hasNextLine())
            csvFileHeader = input.nextLine();

        while (input.hasNextLine()) {
            mission = parse(input.nextLine());
            list.add(mission);
        }
        input.close();
    }

    public void setInputFileLocation(String inputFileLocation) {
        this.inputFileLocation = inputFileLocation;
    }

    public void setOutDirectory(String outDirectory) {
        this.outDirectory = outDirectory;
    }

    public List<Mission> getList(){
        return list;
    }

    public void write() throws FileNotFoundException{
        PrintStream   output    = new PrintStream(outDirectory);
        StringBuilder builder   = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i).toCSVFormat()).append("\n");
        }
        output.println(csvFileHeader);
        output.print(builder);
        output.close();
    }
}
