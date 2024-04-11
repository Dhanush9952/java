class InterfaceDemo1 {
   public static void main(String[] args) {
       Animal dog = new Dog();
       Animal cat = new Cat();
       ((Swimmer) dog).swim();
       ((Player) dog).play();
       ((Swimmer) cat).swim();
       ((Player) cat).play();
   }
}

interface Swimmer {
   void swim();
}

interface Player {
   void play();
}

abstract class Animal {
}

class Dog extends Animal implements Swimmer, Player {
    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}

class Cat extends Animal implements Swimmer, Player {
    @Override
    public void swim() {
        System.out.println("Cat is swimming");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
