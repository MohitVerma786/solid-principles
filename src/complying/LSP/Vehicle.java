package complying.LSP;

class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void accelerate() {
        System.out.println("accelerate " + name);
    }

    public void stop() {
        System.out.println("stop " + name);
    }

    public String getName() {
        return name;
    }
}
