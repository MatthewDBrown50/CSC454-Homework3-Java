package homework3;

import homework3.network.Network;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Network network = new Network();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        while(true){

            String input = scanner.nextLine();

            char[] inputArray = input.toCharArray();

            if(inputArray.length == 2 && Character.isDigit(inputArray[0]) && Character.isDigit(inputArray[1])){

                int[] numericalInputArray = new int[]{inputArray[0] - '0', inputArray[1] - '0'};

                String networkOutput = network.executeMachineCycle(numericalInputArray);

                System.out.println(networkOutput);
            }
            else{

                System.out.println("Invalid Input!");
            }
        }
    }
}