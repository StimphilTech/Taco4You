package com.pluralsight;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TacoFileManager {
    public void printOrder (Order order){

        try (BufferedReader br = new BufferedReader(new FileReader("TACO_PRICING.csv"))) {




    } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }}