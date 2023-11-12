package ControlStatements;

import java.sql.SQLOutput;

public class ForLabels {
    public static void main(String[] args) {

        loop1: for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if(i == 2) {
                    continue loop1;
                }
            System.out.println("i -> " + i + " | j -> " + j);
            }
        }
    }
}
