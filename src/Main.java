//package com.company;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Main {

    final static String filename = "/Users/phillip.whiters/jcgFile.txt";


    public static void main(String[] args) {

        System.out.println("Hello World!");


        // write your code here

        String s1 = "ABC12DEF13GHI";
        Integer d = 123;

        PrintWriter pwp = new PrintWriter(System.out, true);
        pwp.println("This is a string");
        pwp.printf("This is a integer: %d",d);

        //From Google

        // the standard output as OutputStreamWriter

        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Java Code Geeks");

        int i = 5;

        double k = 10.0;

        pw.printf("i = %d and k = %f",i,k);

        // flush the instance pw

        pw.flush();


        System.out.println("\n---------------------------------------");


        // write sth in a file (deletes the lines if exist)

        PrintWriter pwFile = null;

        Date date = new Date();

        try{

            pwFile = new PrintWriter(filename);

            i++;

            // write a builtIn object

            pwFile.println(date);

            pwFile.write("Write something in a line. i = "+i);

            System.out.println("Write to the file successfully");

        }catch(FileNotFoundException e) {

            e.printStackTrace();

        }catch(SecurityException e) {

            e.printStackTrace();

        }finally {

            // always close the output stream

            if(pwFile != null){

                pwFile.close();

            }

        }

        // another way

        PrintWriter pwFile1 = null;

        Object obj = System.getProperty("line.separator")+"A new object";

        // write in a file in a newline (no deletion of previous writing)

        try {

            FileWriter fl = new FileWriter(filename, true);

            BufferedWriter br = new BufferedWriter(fl);

            pwFile1 = new PrintWriter(br) ;

            pwFile1.println(obj);

            // write the string beginning from the 3rd char until the 8th

            pwFile1.write("!!!JCG Test!!!",3 ,8);

            System.out.println("Add new lines to the file successfully");

        }catch(FileNotFoundException e) {

            e.printStackTrace();

        }catch(SecurityException e) {

            e.printStackTrace();

        } catch (IOException e) {

            // for FileWriter

            e.printStackTrace();

        }finally {

            // no matter what happen, close the output stream

            if(pwFile1 != null){

                pwFile1.close();

            }

        }

        System.out.println("Add new line for Hello My World!!!!");
        System.out.println("Just added this new line -- Add new line for Hello My World!!!!");
        System.out.println("3rd entyr -- Just added this new line -- Add new line for Hello My World!!!!");
    }
}
