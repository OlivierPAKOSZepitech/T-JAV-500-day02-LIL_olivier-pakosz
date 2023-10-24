public class Gecko {
    public String name;

    public Gecko() {
        this("Unknown");
    }

    public Gecko(String name) {
        this.name = name;
        if (name.equals("Unknown")) {
            System.out.println("Hello!");
        } else {
            System.out.println("Hello " + name + "!");
        }
    }

    public static void main(String[] args) {
        Gecko arthur = new Gecko("Arthur");
        Gecko benjy = new Gecko();
        System.out.println(arthur.name);
        System.out.println(benjy.name);
    }
}
