/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.util.Scanner;

public class PizzaParty {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int people, pizzas, slices, left, totalSlices;

        System.out.printf ("How many people? ");
        people = input.nextInt();

        System.out.printf ("How many pizzas do you have? ");
        pizzas = input.nextInt();

        System.out.printf ("How many slices per pizza? ");
        slices = input.nextInt();

        totalSlices = pizzas*slices;
        left = totalSlices%people;

        System.out.printf ("%d people with %d pizzas (%d slices)\n", people, pizzas, totalSlices);
        System.out.println("Each person gets "+ totalSlices/people + " pieces of pizza.");
        System.out.println ("There are "+ left + " leftover pieces");


    }//End of method
}//End of class
