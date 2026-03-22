/**
 * Cereal.java
 *
 * @author – Your name
 * @author – Class period
 *
 */
public class Cereal
{
    // private instance variables to hold info about a cereal from the data set
    // the name, calories, fiber, carbohydrates, and cups
    private String name;
    private int calories;
    private double fiber;
    private double carbohydrates;
    private double cups;
    // constructor that creates a cereal object
    public Cereal(String name, int calories, double fiber, double carbohydrates, double cups){
        this.name = name;
        this.calories = calories;
        this.fiber = fiber;
        this.carbohydrates = carbohydrates;
        this.cups = cups;
    }
    // accessor methods for each instance variable
    public String getName(){
        return name;
    }
    public int getCalories(){
        return calories;
    }
    public double getFiber(){
        return fiber;
    }
    public double getCarbohydrates(){
        return carbohydrates;
    }
    public double getCups(){
        return cups;
    }
    /* toString method returns the values stored in the instance variables
       concatenated in a sentence starting with "Cereal: " */
    public String toString(){
        return "Cereal: " + getName() + ", calories: " + getCalories() + ", fiber: " + getFiber() + ", carbohydrates: " + getCarbohydrates() + ", cups: " + getCups();
    }
}


