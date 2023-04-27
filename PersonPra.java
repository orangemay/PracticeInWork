class Person {
    int age;
    String name;
    Restaurant restaurant;
    
    public Person(String _name, int _age, Restaurant _restaurant) {
        this.name = _name;
        this.age = _age;
        this.restaurant = _restaurant;
    }

    public String show() {
        return String.format("%sです。%d歳です。%sというレストランが好きで、%sタイプです。", 
        this.name, 
        this.age,
        this.restaurant.name,
        this.restaurant.type);
    }

}

class Restaurant {
    String name;
    String type;

    public Restaurant(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

public class PersonPra {
   public static void main(String args[]) {
    Restaurant mcdonalds = new Restaurant(
        "マクド",
        "ファストフード"
    );

    Person person1 = new Person(
    "ゴミ",
    25,
    mcdonalds
    );
    
    System.out.println(person1.show());
   }
}