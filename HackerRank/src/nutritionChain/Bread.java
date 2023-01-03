package nutritionChain;

class Bread extends Food {
    Bread(double proteins, double fats, double carbs){
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }
    int tastyScore = 8;
    String type = "vegetarian";
    void getMacroNutrients() {
        System.out.println("A slice of bread has " + this.proteins + " gms of protein, "+ this.fats + " gms of fats and " + this.carbs + " gms of carbohydrates.");
    }
}