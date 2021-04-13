package com.tts;
import  java.util.Scanner;



public class AnimalSounds{

    /************************** findIndex function to return an index of specific item in an array*********************/
    public static int findIndex(String arr[], String t)
    {
        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String name = "";
            /**************************With one dimensional arrays*********************/
            final String[] animals = {"sheep", "horse", "cat", "dog", "cow", "duck"};
            final String[] sounds = {"bahh!", "neigh!", "moew!", "woof!", "moooo!", "quack!"};
            while (!name.equals("0")) {
                System.out.println("What animal do you have?");
                name = input.nextLine();

                for (String i : animals) {
                    if (name.equalsIgnoreCase(i)) {
                        System.out.println(sounds[findIndex(animals,i)]);
                    }

                }
            }
        /**************************With two dimensional array*********************/

        final String[][] animalSounds={{"sheep", "horse", "cat", "dog", "cow", "duck"},{"bahh!", "neigh!", "moew!", "woof!", "moooo!", "quack!"}};
        while (!name.equals("0")) {
            String sound="Ooops! Sorry I Did not recognize your animal!!!";
            System.out.println("What animal do you have?");
             name = input.nextLine();
            for(int i=0;i<animalSounds[0].length;i++){
               if(animalSounds[0][i].equalsIgnoreCase(name)){
                  sound=animalSounds[1][i];
                }
               }
            System.out.println(sound);

        }
        /************************** With conditional statements ********************/
        while (!name.equals("0")) {
            System.out.println("What animal do you have?");
            name = input.nextLine();
            if (name.equalsIgnoreCase("sheep")) {
                System.out.print("bahh!");
                break;
            } else if (name.equalsIgnoreCase("horse")) {
                System.out.print("neigh!");
                break;
            } else if (name.equalsIgnoreCase("cat")) {
                System.out.print("moew!");
                break;
            } else if (name.equalsIgnoreCase("dog")) {
                System.out.print("wooof!");
                break;
            } else if (name.equalsIgnoreCase("cow")) {
                System.out.print("moooo!");
                break;
            } else if (name.equalsIgnoreCase("duck")) {
                System.out.print("quack!");
                break;
            } else {
                System.out.print("Try a different animal. ");
                break;
            }
        }


}}




