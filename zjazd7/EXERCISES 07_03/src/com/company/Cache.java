/*
 * SUMMARY: Exercises 07_03
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;
import java.io.*;
import java.nio.channels.OverlappingFileLockException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Cache {
    private static Cache instance = null;
    private LocalDateTime lastDataGetTime;
    // variable of type String
    private ArrayList<CacheData> data;

    // private constructor restricted to this class itself
    private Cache() {
        data = new ArrayList<CacheData>();
    }

    // static method to create instance of Singleton class
    public static Cache getInstance() {
        if (instance == null) {
            instance = new Cache();
        }

        return instance;
    }

    public ArrayList<CacheData> GetDataFromCsv() {
        if(this.lastDataGetTime != null) {
            long minutes = ChronoUnit.MINUTES.between(this.lastDataGetTime, LocalDateTime.now());
            if (minutes < 5) {
                return this.data;
            }
        }

        ArrayList<CacheData> cacheData = this.ReadFromCsv();
        this.data = cacheData;
        return this.data;
    }

    private ArrayList<CacheData> ReadFromCsv(){
        ArrayList<CacheData> cacheDataArrayList = new ArrayList<CacheData>();
        Context context = null;
        this.lastDataGetTime = LocalDateTime.now();
        try {
            BufferedReader lineReader = new BufferedReader(new FileReader("src/com/company/csv/wojewodztwa.csv"));
            String lineText = null;
            lineReader.readLine(); // skip header line

            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                CacheData cacheData = new CacheData();
                cacheData.ID = Integer.parseInt(data[0].trim());
                cacheData.IntKey = Integer.parseInt(data[1].trim());
                cacheData.StringKey = data[2].trim();
                cacheData.Value = data[3].trim();
                cacheData.EnumerationName = data[4].trim();

                cacheDataArrayList.add(cacheData);
            }
            lineReader.close();

        } catch (FileNotFoundException ex) {
            context = new Context(new NoFileStrategy());
        }
        catch (OverlappingFileLockException ex){
            context = new Context(new FileInUseStrategy());
        } catch(IOException ex) {
            context = new Context(new NotValidDataStrategy());
        } finally {
            if(context != null){
                context.executeStrategy();
            }
        }
        return cacheDataArrayList;
    }
}
