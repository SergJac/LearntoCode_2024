package com.ps;

import java.util.*;

class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Which calculator would you like to use? (b)asic or (s)cientific?");
        String command = scanner.nextLine();

        switch(command.toLowerCase()){
            case"b":
                runBasicCalculator();
                break;
            case"s":
                runScientificCalculator();
                break;
            default:
                System.out.println("Command not found");
        }

//        if(command.equalsIgnoreCase("b")){
//            System.out.println("Run basic calculator");
//        } else if (command.equalsIgnoreCase("s")) {
//            System.out.println("Run scientific calculator");
//        } else {
//            System.out.println("Command not found");
//        }
    }

    public static void  runBasicCalculator(){
        System.out.println("Run basic calculator");
        // Operation
        // num1
        // num2
        System.out.println("What operation would kyou like to perform?");
        System.out.println("1: addition \n2: subtraction \n3: multiplication \n4: division \n5: modulo");

        int operation = scanner.nextInt();

        System.out.println("What is the first number?");
        int  numberOne = scanner.nextInt();

        System.out.println("What is the second number?");
        int  numberTwo = scanner.nextInt();

        System.out.println("Op: " + operation + ", num1: " + numberOne + ", num2: " + numberTwo);
        int result;

        switch (operation){
            case 1:
                printResult(numberOne + numberTwo);;
                break;
            case 2:
                printResult(numberOne - numberTwo);;
                break;
            case 3:
                printResult(numberOne * numberTwo);
                break;
            case 4:
                printResult(numberOne / numberTwo);
                break;
            case 5:
                printResult(numberOne % numberTwo);
                break;
            default:
                System.out.println("Operation not found");

        }
    }

    public static void runScientificCalculator(){
        System.out.println("Run scientific calculator");

    }

    public static void printResult(int result){
        System.out.println("Your result is: " + result);
    }

}



