package day39_CastomClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();

        dog1.setInfo("Husky", "Large", 3,"White", "Ace"  );
        dog2.setInfo("Labrador", "Large", 4,"Black", "Hank"  );
        dog3.setInfo("Golden Retriever", "Large", 10,"Gold", "Murphy"  );
        dog4.setInfo("Bulldog", "Small", 2,"Brown", "Ollie"  );
        dog5.setInfo("Poodle", "Medium", 5,"Gray", "Oreo"  );

        dog1.getInfo();
        dog2.getInfo();
        dog3.getInfo();
        dog4.getInfo();
        dog5.getInfo();

        System.out.println();
        System.out.println();

        dog1.drink();
        dog2.eat();
        dog3.sleep();
        dog4.bark();
        dog5.play();


    }
}
