public class Bird extends Animal {
    public String name;
    public String coatColor;
    public String type;

    public Bird() {}

    public Bird(String name, String coatColor, String type) {
        this.name = name;
        this.coatColor = coatColor;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public String getVid() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }
    public void setVid(String vid) {
        this.type = type;
    }
    @Override
    public void eat() {
        System.out.println(name + " ест");
    }
    @Override
    public void sleep() {
        System.out.println(name + " спит");
    }

    public void fly() {
        System.out.println(name + " летает");
    }

    public static Bird[] createBirds() {
        Bird bird1 = new Bird("Ястреб", "коричневый", "хищный");
        Bird bird2 = new Bird("Попугай", "разноцветный","попугаеобразный");
        Bird[] arr2 = {bird1,bird2};
        return arr2;
    }

}