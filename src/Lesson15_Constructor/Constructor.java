package Lesson15_Constructor;

import java.sql.SQLOutput;

public class Constructor {
    public void foo() {
        Flower flower = new Flower();
        flower.name = "rose";
        flower.color = "Red";
        Flower flower2 = new Flower("Pos", "Green");

        System.out.println(flower.name + " " + flower.color);
        System.out.println(flower2.name + " " + flower2.color);
    }
}
