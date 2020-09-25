package org.horizoncolumbus.hs;

public class TechDistribution {

    public static void main(String[] args) {
        boolean isJunior = true;
        boolean isSenior = false;
        boolean isStudent = true;
        boolean hasCTE = false;
        boolean isTeacher = false;
        boolean isAdmin = false;
        boolean atHome = false;

        if(isJunior && isStudent || isSenior && isStudent && hasCTE) {
            System.out.println("Windows Laptop received.");
        }else if (isTeacher || isAdmin && atHome) {
            System.out.println("Macbook received.");
        }else {
            System.out.println("Chromebook received.");
        }
    }
}

