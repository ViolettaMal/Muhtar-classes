package day39_CastomClass;

public class DogPark {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog[] dogPark = { new Dog() , new Dog(), new Dog(), new Dog(), new Dog()  };

        dogPark[0].setInfo("Husky", "Large", 3,"White", "Ace");
        dogPark[1].setInfo("Labrador", "Large", 4,"Black", "Hank"  );
        dogPark[2].setInfo("Golden Retriever", "Large", 10,"Gold", "Murphy"  );
        dogPark[3].setInfo("Bulldog", "Small", 2,"Brown", "Ollie"  );
        dogPark[4].setInfo("Poodle", "Medium", 5,"Gray", "Oreo"  );

        for (int i = 0; i < dogPark.length; i ++){
            dogPark[i].getInfo();
        }
        System.out.println("====================");
        String drink = "milk";
        for (Dog eachDog : dogPark){ // how to add drink
            eachDog.drink();

        }
        System.out.println("========================");
        String food = "treats";
        for (Dog eachDog : dogPark){
            eachDog.eat();

        }





    }
}
