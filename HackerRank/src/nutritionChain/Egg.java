package nutritionChain;

class Egg extends Food {
    Egg(double proteins, double fats, double carbs){
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }
    int tastyScore = 7;
    String type = "non-vegetarian";
    void getMacroNutrients() {
        System.out.println("An egg has " + this.proteins + " gms of protein, "+ this.fats + " gms of fats and " + this.carbs + " gms of carbohydrates.");
    }
}