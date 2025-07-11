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
        System.out.println("Do you want to buy, sell or hatch an egg or equip a pet");
        String input=scan.next();
        if(input.equals("buy")){
            for(int e=0;e<6;e++){
                System.out.println(eggs[e]+": $"+eggsCost[e]);
            }
            System.out.println("What egg do you want to buy?");
            System.out.println("You have $"+money);
            String bought=scan.next();
            if(input.equals("common")){
                commonEggNumber=commonEggNumber+1;
            }
            if(input.equals("uncommon")){
                uncommonEggNumber=uncommonEggNumber+1;
            }
            if(input.equals("rare")){
                rareEggNumber=rareEggNumber+1;
            }
            if(input.equals("epic")){
                epicEggNumber=epicEggNumber+1;
            }
            if(input.equals("legendary")){
                legendaryEggNumber=legendaryEggNumber+1;
            }
            if(input.equals("mythic")){
                mythicEggNumber=mythicEggNumber+1;
            }
            System.out.println(commonEggNumber);
            System.out.println(uncommonEggNumber);
            System.out.println(rareEggNumber);
            System.out.println(epicEggNumber);
            System.out.println(legendaryEggNumber);
            System.out.println(mythicEggNumber);
        }
    }
}