public class PredatoryCat extends Cat {
    public String name;
    public int victims;
    public PredatoryCat() {}

    public PredatoryCat(String name, int victims) {
        this.name = name;
        this.victims = victims;
    }

    public String getName() {
        return name;
    }

    public int getVictims() {
        return victims;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVictims(int victims) {
        this.victims = victims;
    }

    public void growl() {
        System.out.println(name + " R-r-r-r");
    }
    public void attack() {
        System.out.println(name + " нападает на какое-то животное");
    }
    public void hunt() {
        System.out.println(name + " охотиться на какое-то животное");
    }
    public void victim() {
        System.out.println("Число жертв у " + name + " : " +  victims);
    }

    public static PredatoryCat[] createPredatoryCat() {
        PredatoryCat predatoryCat1 = new PredatoryCat("Рысь" , 12);
        PredatoryCat predatoryCat2 = new PredatoryCat("Леопард", 9);
        PredatoryCat[] arr4 = {predatoryCat1, predatoryCat2};
        return arr4;
    }
}