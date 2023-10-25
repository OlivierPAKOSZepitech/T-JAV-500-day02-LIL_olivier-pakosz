public class Gecko {
    private String name;
    private int age;
    private int energy;

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
        String foodLowerCase = food.toLowerCase();
        if (foodLowerCase.equals("meat")) {
            System.out.println("Yummy!");
            setEnergy(Math.min(100, getEnergy() + 10));
        } else if (foodLowerCase.equals("vegetable")) {
            System.out.println("Erk!");
            setEnergy(Math.max(0, getEnergy() - 10));
        } else {
            System.out.println("I can't eat this!");
        }
    }

    public void work() {
        if (energy >= 25) {
            System.out.println("I'm working T.T");
            setEnergy(getEnergy() - 9);
        } else {
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
            setEnergy(Math.min(100, getEnergy() + 50));
        }
    }

public void fraternize(Object friend) {
        if (friend instanceof Gecko) {
            Gecko friendGecko = (Gecko) friend;
            if (this.energy >= 30 && friendGecko.getEnergy() >= 30) {
                this.setEnergy(this.energy - 30);
                friendGecko.setEnergy(friendGecko.getEnergy() - 30);
                System.out.println("I'm going to drink with " + friendGecko.getName() + "!");
                System.out.println("I'm going to drink with " + this.name + "!");
            } else if (!(this.energy >= 30) && friendGecko.getEnergy() >= 30) {
                System.out.println("Sorry " + friendGecko.getName() + ", I'm too tired to go out tonight.");
                System.out.println("Oh! That's too bad, another time then!");
            } else if (this.energy >= 30 && !(friendGecko.getEnergy() >= 30)) {
                System.out.println("Sorry " + this.name + ", I'm too tired to go out tonight.");
                System.out.println("Oh! That's too bad, another time then!");
            } else {
                System.out.println("Not today!");
                System.out.println("Not today!");
            }
        } else if (friend instanceof Snake) {
            if (this.energy >= 10) {
                System.out.println("LET'S RUN AWAY!!!");
                this.setEnergy(0);
            }
            else {
                System.out.println("...");
            }
        }
    }

    public static void main(String[] args) {
        Gecko mimi = new Gecko("Mimi");
        mimi.hello("Titi");
        mimi.eat("Meat");

        Gecko friend = new Gecko("Friend");
        friend.setEnergy(50);

        mimi.fraternize(friend);
        System.out.println("Mimi's energy: " + mimi.getEnergy());
        System.out.println("Friend's energy: " + friend.getEnergy());
    }
}
