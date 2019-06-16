public class Main {

    public static void main( String[] args ) {

        Animal animal = new Animal();
        Canine canine = new Canine();
        Dog dog = new Dog();
        Bulldog bulldog = new Bulldog();
        Wolf wolf = new Wolf();
        Chihuahua chiguagua = new Chihuahua();
        GrayWolf greyWolf = new GrayWolf();


        sayWhoYouAre(animal);
        sayWhoYouAre(canine);
        sayWhoYouAre(dog);
        sayWhoYouAre(bulldog);
        sayWhoYouAre(wolf);
        sayWhoYouAre(chiguagua);
        sayWhoYouAre(greyWolf);

    }

    public static void sayWhoYouAre(Animal animal){
        animal.whoAreYou();
    }
}
