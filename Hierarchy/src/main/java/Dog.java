public class Dog extends Animal {
    public String name;
    public String coatColor;
    public String breed;

    public Dog() {}

    public Dog(String name, String coatColor, String poroda) {
        this.name = name;
        this.coatColor = coatColor;
        this.breed = poroda;
    }



    public String getName() {
        return name;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEyesColor(String eyesColor) {
        this.coatColor = coatColor;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public void bark() {
        System.out.println(name +": 'Гав гав'");
    }
    @Override
    public void eat() {
        System.out.println(name + " кушает");
    }
    @Override
    public void sleep() {
        System.out.println(name + " спит");
    }

    public void coatColor() {
        System.out.println("у " + name + " " + coatColor + " цвет шерсти");
    }

    public void poroda() {
        System.out.println("порода " + name + " : " + breed);
    }

    public static Dog[] createDogs() {
        Dog dog1 = new Dog("Шарик", "рыже-золотистый","Шпиц");
        Dog dog2 = new Dog("Тузик", "черный", "Бульдог");
        Dog[] arr1 = {dog1,dog2};
        return arr1;
    }

}