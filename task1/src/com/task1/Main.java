package com.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Choose your wanted type of character: --Werewolf--Orc--Troll--Elve--Dragon--Vampire--");
        try {
            String a = null;
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();
            System.out.println("Your choice is :" + choice);

            character chart = new character();

            if("Werewolf".equalsIgnoreCase(choice)){
                chart.setAct(new werewolf());
            }
            else if( "Orc".equalsIgnoreCase(choice)){
                chart.setAct(new orc());
            }
            else if("Troll".equalsIgnoreCase(choice)){
                chart.setAct(new troll());
            }
            else if("Elve".equalsIgnoreCase(choice)){
                chart.setAct(new elve());
            }
            else if("Dragon".equalsIgnoreCase(choice)){
                chart.setAct(new dragon());
            }
            else if("Vampire".equalsIgnoreCase(choice)){
                chart.setAct(new vampire());
            }
            else{
                System.out.println(a.charAt(0));
            }
            System.out.println("Mode of action has : "+
                    chart.getAct());
            chart.functionality();
            chart.StartGame();
        } catch(NullPointerException e) {
            System.out.println("To start a game, you have to choose your character. Please, choose your wanted type of character ");
        }
    }
}

