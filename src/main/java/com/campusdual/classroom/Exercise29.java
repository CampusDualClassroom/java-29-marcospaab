package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            int x = 12/0;
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
