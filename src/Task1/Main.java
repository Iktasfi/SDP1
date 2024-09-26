package Task1;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        Product food = new FoodProduct();
        Product electronics = new ElectronicsProduct();
        Product clothing = new ClothingProduct();

        System.out.println("Food discount: " + calculator.calculateDiscount(food));
        System.out.println("Electronics discount: " + calculator.calculateDiscount(electronics));
        System.out.println("Clothing discount: " + calculator.calculateDiscount(clothing));
    }
}
