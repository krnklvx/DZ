public class DomesticCat extends Cat {
    public String name;
    public String breed;

    public DomesticCat() {}

    public DomesticCat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void purring() {
        System.out.println(name + ": мяу");
    }
    public void run() {
        System.out.println(name + " бегает");
    }
    public void por() {
        System.out.println("порода у " + name + " : " + breed);
    }

    public static DomesticCat[] createDomesticCat() {
        DomesticCat domesticCat1 = new DomesticCat("Буся", "Швейцарский кот");
        DomesticCat domesticCat2 = new DomesticCat("Айсик", "Британский кот");
        DomesticCat[] arr3 = {domesticCat1,domesticCat2};
        return arr3;
    }
}