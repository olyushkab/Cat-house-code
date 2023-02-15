package HW8;

import java.util.ArrayList;
import java.util.Scanner;
public class Main_task1 {
    public static void main(String[] args) {
      PetHouse pethouse = new PetHouse();
      Scanner scn = new Scanner(System.in);
      pethouse.cats.add(new Cat("Aurora",6.5,"Grey"));
      pethouse.cats.add(new Cat("Max",8,"Brown"));
      pethouse.cats.add(new Cat("Simon",5,"Brown"));
      for (int i=0; i<pethouse.cats.size(); i++){
          System.out.println(pethouse.cats.get(i).name);
      }

      System.out.print("Type the name of the cat: ");
      String typedName = scn.next();
      for (int j=0; j<pethouse.cats.size(); j++) {
          if(typedName.equals(pethouse.cats.get(j).name)) {
              System.out.println("This cat's color is "+pethouse.cats.get(j).color+" and his weight is "+pethouse.cats.get(j).weight+"lbs");
          }
      }

      System.out.print("Type desired color: ");
      String typedColor = scn.next();
      for (int k=0; k<pethouse.cats.size(); k++) {
          if(typedColor.equals(pethouse.cats.get(k).color)){
              System.out.println(pethouse.cats.get(k).name);
          }
      }

    }
}

class Cat{
    String name;
    double weight;
    String color;

    public Cat(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
}

class PetHouse{
    ArrayList<Cat> cats = new ArrayList<>();
}
