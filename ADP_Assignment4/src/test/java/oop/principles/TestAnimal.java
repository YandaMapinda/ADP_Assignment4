package oop.principles;



import oop.principles.inheritance_Encapsulation.Animal;
import oop.principles.inheritance_Encapsulation.Cat;
import oop.principles.inheritance_Encapsulation.Dog;

import oop.principles.polymorphysm.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAnimal {
    private Animal animals;


    @Before
    public void setUp() throws Exception{
        animals = new Animal();
        //Animal dog = new Dog();
    }


    @Test
   public void testEncapsulation(){
        //animals.getAverageWeight();
        Double results = animals.getAverageWeight(6);
        assertEquals(results,6,0);
    }
    @Test
    public void testSheepEat(){
       Sheep sheep = new Sheep();
        //sheep.eat();
       String results = sheep.eat();
      assertEquals(results,"Sheep eat grass");
      // assertEquals("Bird eat plants",results);

    }
    @Test
    public void testPigEat(){
       Pig pig = new Pig();
        //pig.eat();
        String results = pig.eat();
        assertEquals(results," Eats pig food");
    }
    @Test
    public  void testDogDetails(){
        Dog dog = new Dog();
        //dog.dogDetails();
        //String results = dog.dogDetails();
        assertEquals("Spider has 4 legs", dog.dogDetails());
    }
    @Test
    public void testCatDetails(){
        Cat cat = new Cat();
        //cat.catDetails();
        assertEquals("Kitty has 4 legs and makes Meow! sound",cat.catDetails());
    }
}
