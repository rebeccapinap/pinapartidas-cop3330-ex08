package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int totalSlices = 0;
        int slicePerPerson = 0;
        int leftover = 0;

        // Calculates the number of slices per person and leftover slices
        System.out.print("How many people? ");
        int numPeople = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int numPizza = input.nextInt();

        System.out.print("How many slices per pizza? ");
        int numSlices = input.nextInt();

        totalSlices = numSlices * numPizza;
        slicePerPerson = totalSlices / numPeople;
        leftover = totalSlices - (slicePerPerson * numPeople);

        System.out.println(numPeople + " people with " + numPizza + " pizzas (" + totalSlices + " slices)");
        System.out.println("Each person gets " + slicePerPerson + " pieces of pizza.");
        System.out.println("There are " + leftover + " leftover pieces.");
    }
}
