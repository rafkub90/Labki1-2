package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        float minRand  = 0f;
        float maxRand  = 1f;
        List<Number> numberList = new ArrayList<Number>();
        Scanner scanner = new Scanner(System.in);

        int a, i, n;
        double w = 0.0;

        System.out.println("How many numbers?: ");
        n = scanner.nextInt();

        for( i = 0; i < n; i++ )
        {
            System.out.println(String.format("Enter number [%s]: ",i+1));
            a = scanner.nextInt();
            float randFloat = rand.nextFloat() * (maxRand - minRand) + minRand;
            System.out.println(String.format("Number: %s",a));
            System.out.println(String.format("Wage: %s",randFloat));
            numberList.add(new Number(a,randFloat));
            for(Number nr : numberList){

            }
        }

        //wypisz wynik
        System.out.println(String.format("Weighted average: %s", WeightedAverage(numberList)));
        scanner.next();
    }

    public static float WeightedAverage(final List<Number> numbers){
        float sum = 0f;
        float wages = 0f;
        for(Number number:numbers){
            sum += number.number*number.wage;
            wages += number.wage;
        }
        return sum/wages;
    }
}

class Number{
    final int number;
    final float wage;

    public Number(int number, float wage) {
        this.number = number;
        this.wage = wage;
    }
}