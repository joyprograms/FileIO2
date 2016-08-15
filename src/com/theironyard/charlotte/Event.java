package com.theironyard.charlotte;

import java.util.Scanner;

/**®
 * Created by meekinsworks on 8/12/16.
 */
public class Event {
String name;
    int age;
    String date;
    String survey;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSurvey() {
        return survey;
    }

    public void setSurvey(String survey) {
        this.survey = survey;
    }

    public static Event createEvent()

    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("What is the name of your friend/family member?");
    String name = scanner.nextLine();

            System.out.println("How old is he/she?");
    String age = scanner.nextLine();

            System.out.println("Which event would you like to add?");
    String event = scanner.nextLine();

            System.out.println("What is the date of the event?");
    String date = scanner.nextLine();

            System.out.println("Has he/she taken the survey?");
    String survey = scanner.nextLine();

        return new Event();


}

}


