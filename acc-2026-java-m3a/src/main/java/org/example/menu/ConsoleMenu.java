package org.example.menu;

import org.example.model.*;
import org.example.shelter.Shelter;

import java.util.Scanner;

public class ConsoleMenu {
    private final Shelter<Animal> shelter;
    private final Scanner scanner =  new Scanner(System.in);
    public ConsoleMenu(Shelter<Animal> shelter) {
        this.shelter = shelter;
    }

    public void start(){
        boolean running = true;
        while(running)
        {
            printMenu();
            System.out.println("Select an option: ");
            String option = scanner.nextLine();
            switch (option)
            {
                case "1":
                    addAnimal();
                    break;
                case "2":
                    listAllAnimals();
                    break;
                case "3":
                    findBySpecies();
                    break;
                case "4":
                    listAvailableAnimals();
                    break;
                case "5":
                    markAsAdopted();
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    void  addAnimal()
    {
        System.out.printf("Animal Species (Bird/Cat/Dog): ");
        String species = scanner.nextLine();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        Animal animal = createAnimal(species, name, age);
        if (animal == null)
        {
            System.out.println("Invalid animal species");
        } else {
            shelter.addAnimal(animal);
            System.out.println("Animal added successfully");
        }
    }
    private Animal createAnimal(String species, String name, int age)
    {
        switch (species.toLowerCase())
        {
            case "bird":
                return new Bird(new AnimalId(), name, age);
            case "cat":
                return new Cat(new AnimalId(), name, age);
            case "dog":
                return new Dog(new AnimalId(), name, age);
            default:
                return null;
        }
    }

    void listAllAnimals()
    {
        for (Animal animal : shelter.getAllAnimals())
        {
            System.out.println(animal);
        }
    }

    void findBySpecies()
    {
        System.out.println("Species to search: ");
        String species = scanner.nextLine();
        for (Animal animal : shelter.findBySpecies(species))
        {
            System.out.print(animal);
        }
    }

    void listAvailableAnimals()
    {
        for (Animal animal : shelter.findAvailableAnimals())
        {
            System.out.println(animal);
        }
    }

     void markAsAdopted()
     {
         System.out.println("Animal ID to mark as adopted: ");
         String id = scanner.nextLine();
         shelter.markAsAdopted(id);
         System.out.println("Animal ID marked as adopted.");
     }

    private void printMenu(){
        System.out.println("""
                1. Add animal
                2. List all animals
                3. Find animals by species
                4. List available animals
                5. Mark animal as adopted
                0. Exit
                """);
    }
}
