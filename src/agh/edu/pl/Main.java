package agh.edu.pl;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Box integerBox = new Box();
        integerBox.add(new Integer(10));
        Integer someInteger = (Integer) integerBox.get();
        System.out.println(someInteger);
    }
    }


