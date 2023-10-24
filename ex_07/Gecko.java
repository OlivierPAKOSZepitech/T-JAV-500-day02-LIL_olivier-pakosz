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
        this.energy = 100; 
        if (name.equals("Unknown")) {
            System.out.println("Hello!");
        } else {
            System.out.println("Hello " + name + "!");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void work(){
        if(this.energy >= 25){
            setEnergy(this.energy - 9);
            System.out.println("I'm working T.T"); 
        }
        else {setEnergy(this.energy + 50);
        System.out.println("Heyyy I'm too sleepy, better take a nap!");
        }
    }

    

    public void setEnergy(int energy) {
        if (energy < 0){
            this.energy = 0;
        } else if (energy > 100) {
            this.energy = 100;
        } else {
            this.energy = energy;}
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
