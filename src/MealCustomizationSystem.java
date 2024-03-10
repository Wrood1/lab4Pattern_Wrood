import java.util.ArrayList;
import java.util.List;

// Product Class
class Meal {
    private List<String> parts = new ArrayList<>();
    
    public void addPart(String part) {
        parts.add(part);
    }
    
    public void showParts() {
        System.out.println("Meal Components: " + String.join(", ", parts));
    }
}

// Builder Interface
interface MealBuilder {
    void buildAppetizer();
    void buildMainCourse();
    void buildSide();
    void buildDessert();
    Meal getMeal();
}

// Concrete Builder - VeganMeal
class VeganMealBuilder implements MealBuilder {
    private Meal meal = new Meal();
    
    public void buildAppetizer() { meal.addPart("Vegan Spring Rolls"); }
    public void buildMainCourse() { meal.addPart("Vegan Burger"); }
    public void buildSide() { meal.addPart("Kale Salad"); }
    public void buildDessert() { meal.addPart("Fruit Sorbet"); }
    public Meal getMeal() { return meal; }
}

// Concrete Builder - KetoMeal
class KetoMealBuilder implements MealBuilder {
    private Meal meal = new Meal();
    
    public void buildAppetizer() { meal.addPart("Cheese Plate"); }
    public void buildMainCourse() { meal.addPart("Grilled Steak"); }
    public void buildSide() { meal.addPart("Avocado Salad"); }
    public void buildDessert() { meal.addPart("Berries with Cream"); }
    public Meal getMeal() { return meal; }
}

// Director Class
class Director {
    private MealBuilder mealBuilder;
    
    public Director(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }
    
    public void constructMeal() {
        mealBuilder.buildAppetizer();
        mealBuilder.buildMainCourse();
        mealBuilder.buildSide();
        mealBuilder.buildDessert();
    }
    
    public Meal getMeal() {
        return mealBuilder.getMeal();
    }
}

// Main class 
public class MealCustomizationSystem {
    public static void main(String[] args) {
        MealBuilder veganMealBuilder = new VeganMealBuilder();
        Director director = new Director(veganMealBuilder);
        director.constructMeal();
        Meal veganMeal = director.getMeal();
        veganMeal.showParts();

        MealBuilder ketoMealBuilder = new KetoMealBuilder();
        director = new Director(ketoMealBuilder);
        director.constructMeal();
        Meal ketoMeal = director.getMeal();
        ketoMeal.showParts();
    }
}
