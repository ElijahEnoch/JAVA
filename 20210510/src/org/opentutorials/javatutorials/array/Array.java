package org.opentutorials.javatutorials.array;

public class Array {
    public static void main(String[] args) {

        String[] members = { "문빈", "산하", "은우", "정우" };
//        System.out.println(classGroup[0]);
//        System.out.println(classGroup[1]);
//        System.out.println(classGroup[2]);
//        System.out.println(classGroup[3]);
        for (String e : members) {
            System.out.println(e + " 상담을 받았습니다.");
        }

    }
}
