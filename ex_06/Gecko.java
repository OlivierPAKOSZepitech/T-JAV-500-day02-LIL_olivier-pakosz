public class Gecko {
    private String name;
    private int age;
    private int energy; // New energy attribute

    public Gecko() {
        this("Unknown", 0);
    }

    public Gecko(String name) {
        this(name, 0);
    }

    public Gecko(String name, int age) {
        this.name = name;
        this.age = age;
        this.energy = 100; // Set initial energy to 100
        if (name.equals("Unknown")) {
            System.out.println("Hello!");
        } else {
            System.out.println("Hello " + name + "!");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if (energy >= 0 && energy <= 100) {
            this.energy = energy;
        } else {
            System.out.println("Invalid energy value");
        }
    }

    public void status() {
        switch (age) {
            case 0:
                System.out.println("Unborn Gecko");
                break;
            case 1:
            case 2:
                System.out.println("Baby Gecko");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Adult Gecko");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("Old Gecko");
                break;
            default:
                System.out.println("Impossible Gecko");
        }
    }

    public void hello(Object arg) {
        if (arg instanceof String) {
            System.out.println("Hello " + arg + ", I'm " + name + "!");
        } else if (arg instanceof Integer) {
            int num = (int) arg;
            for (int i = 0; i < num; i++) {
                System.out.println("Hello, I'm " + name + "!");
            }
        }
    }

    public void eat(String food) {
        String foodLowerCase = food.toLowerCase(); // Make the input case-insensitive
        if (foodLowerCase.equals("meat")) {
            System.out.println("Yummy!");
            setEnergy(Math.min(100, getEnergy() + 10)); // Increase energy but not beyond 100
        } else if (foodLowerCase.equals("vegetable")) {
            System.out.println("Erk!");
            setEnergy(Math.max(0, getEnergy() - 10)); // Decrease energy but not below 0
        } else {
            System.out.println("I can't eat this!");
        }
    }

    public static void main(String[] args) {
        Gecko mimi = new Gecko("Mimi");
        mimi.hello("Titi");
        mimi.eat("Meat");
        mimi.eat("Vegetable");
        mimi.eat("Pizza");
        System.out.println("Energy: " + mimi.getEnergy());
    }
}
