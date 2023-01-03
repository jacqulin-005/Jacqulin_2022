package carFueling;

import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<2;i++) {
            String input = sc.nextLine();
            Car suv = new SUV();
            if(input.equals("topSpeed")){
                suv.topSpeed();
            }
            if(input.equals("fuelType")){
                suv.fuelType();
            }
            Car car = new Car();
            if(input.equals("topSpeed")){
                car.topSpeed();
            }
            if(input.equals("fuelType")){
                car.fuelType();
            }
        }
    }
}