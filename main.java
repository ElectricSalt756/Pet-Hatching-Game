import java.util.Scanner;
import java.util.Random;

public class main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String[] eggs=new String[6];
        int[] eggsCost=new int[6];

        eggs[0]="Common Egg";
        eggs[1]="Uncomme Egg";
        eggs[2]="Rare Egg";
        eggs[3]="Epic Egg";
        eggs[4]="Legendary Egg";
        eggs[5]="Mythic Egg";

        eggsCost[0]=5;
        eggsCost[1]=10;
        eggsCost[2]=20;
        eggsCost[3]=50;
        eggsCost[4]=100;
        eggsCost[5]=300;

        int commonEggNumber=0;
        int uncommonEggNumber=0;
        int rareEggNumber=0;
        int epicEggNumber=0;
        int legendaryEggNumber=0;
        int mythicEggNumber=0;

        int money=10;
        boolean gameRunning=true;
        String buyAgain="yes";
        while(gameRunning==true){
            System.out.println("Do you want to buy, sell or hatch an egg or equip a pet. You can also quit (Your progress does NOT save).");
            String input=scan.next();
            if(input.equals("buy")){
                while(buyAgain.equals("yes")){
                    for(int e=0;e<6;e++){
                        System.out.println(eggs[e]+": $"+eggsCost[e]);
                    }
                    System.out.println("What egg do you want to buy?");
                    System.out.println("You have $"+money);
                    input=scan.next();
                    if(input.equals("common")){
                        if(money<eggsCost[0]){
                            System.out.println("You don't have enough money to buy a common egg.");
                        }
                        else{
                            System.out.println("You bought a common egg.");
                            commonEggNumber=commonEggNumber+1;
                            money=money-eggsCost[0];
                        }
                    }
                    else if(input.equals("uncommon")){
                        if(money<eggsCost[1]){
                            System.out.println("You don't have enough money to buy a uncommon egg.");
                        }
                        else{
                            System.out.println("You bought an uncommon egg.");
                            uncommonEggNumber=uncommonEggNumber+1;
                            money=money-eggsCost[1];
                        }
                    }
                    else if(input.equals("rare")){
                        if(money<eggsCost[2]){
                            System.out.println("You don't have enough money to buy a rare egg.");
                        }
                        else{
                            System.out.println("You bought a rare egg.");
                            rareEggNumber=rareEggNumber+1;
                            money=money-eggsCost[2];
                        }
                    }
                    else if(input.equals("epic")){
                        if(money<eggsCost[3]){
                            System.out.println("You don't have enough money to buy a epic egg.");
                        }
                        else{
                            System.out.println("You bought an epic egg.");
                            epicEggNumber=epicEggNumber+1;
                            money=money-eggsCost[3];
                        }
                    }
                    else if(input.equals("legendary")){
                        if(money<eggsCost[4]){
                            System.out.println("You don't have enough money to buy a legendary egg.");
                        }
                        else{
                            System.out.println("You bought a legendary egg.");
                            legendaryEggNumber=legendaryEggNumber+1;
                            money=money-eggsCost[4];
                        }
                    }
                    else if(input.equals("mythic")){
                        if(money<eggsCost[5]){
                            System.out.println("You don't have enough money to buy a mythic egg.");
                        }
                        else{
                            System.out.println("You bought a mythic egg.");
                            mythicEggNumber=mythicEggNumber+1;
                            money=money-eggsCost[5];
                        }
                    }
                    System.out.println("Common Eggs:"+commonEggNumber);
                    System.out.println("Uncommon Eggs:"+uncommonEggNumber);
                    System.out.println("Rare Eggs:"+rareEggNumber);
                    System.out.println("Epic Eggs:"+epicEggNumber);
                    System.out.println("Legendary Eggs:"+legendaryEggNumber);
                    System.out.println("Mythic Eggs:"+mythicEggNumber);

                    System.out.println("Do you want to buy another egg?");
                    buyAgain=scan.next();
                }
            }
            if(input.equals("hatch")){
                
            }
        }
    }
}