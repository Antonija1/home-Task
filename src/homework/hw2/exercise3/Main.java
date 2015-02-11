package homework.hw2.exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Tonja on 12.02.2015.
 */
public class Main {
    int a;
    public static void main(String[] args) throws IOException{
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Vvedite chislo:");
       int a = Integer.parseInt(reader.readLine());
        if ( a%2==0){
            System.out.println(a+"-chetnoe chislo");
    } else {
            System.out.println(a+"-nechetnoe chislo");
        }
    }
}
