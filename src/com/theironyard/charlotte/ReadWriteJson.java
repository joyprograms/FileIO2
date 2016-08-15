package com.theironyard.charlotte;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by meekinsworks on 8/14/16.
 */
public class ReadWriteJson {
    public static void main(String[] args) throws IOException {

        Event birthday = new Event();

            //write json
            File f = new File("event.json");
            JsonSerializer serializer = new JsonSerializer();
            String json = serializer.serialize(birthday);
            FileWriter fw = new FileWriter(f);
            fw.write(json);
            fw.close();
                try {

                } catch (IndexOutOfBoundsException e) {
                    System.err.println("IndexOutOfBoundsException: " + e.getMessage());


                }
            // read json
            Scanner s = new Scanner (f);
            s.useDelimiter("\\Z");
            String contents = s.next();
            JsonParser parser = new JsonParser();
            Event e2 = parser.parse(contents, Event.class);
            System.out.println(e2);


        }
    }





