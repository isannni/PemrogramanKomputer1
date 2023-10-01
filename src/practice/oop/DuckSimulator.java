/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author Elsza
 */
import java.util.Scanner;

public class DuckSimulator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih jenis bebek:");
        System.out.println("1. Mallard Duck");
        System.out.println("2. Rubber Duck");
        System.out.println("3. Decoy Duck");
        System.out.println("4. Model Duck");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Duck duck = null;

        switch (choice) {
            case 1:
                duck = new MallardDuck();
                break;
            case 2:
                duck = new RubberDuck(new FlyNoWay(), new Squeak());
                break;
            case 3:
                duck = new DecoyDuck();
                break;
            case 4:
                duck = new ModelDuck();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(1);
        }

        System.out.println("Anda memilih " + duck.getClass().getSimpleName());
        System.out.println("Sifat atau perilaku dari bebek ini:");

        duck.performQuack();
        duck.performFly();
    }
}