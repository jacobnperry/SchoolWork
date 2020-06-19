public class petBAG {

    petBAG() {

    }

    public static void setType(String animalType) {
        petType = animalType;
    } // mutator

    public static void getType() {
        return petType;
    }

    public static void setName(String animalName) {
        petName = animalName;
    }

    public static void getName() {
        return petName;
    }

    public static void setAge(int animalAge) {
        petAge = animalAge;
    }

    public static void getAge() {
        return petAge;
    }

    public static void setDogSpace(int kennelSpace) {
        dogSpace = kennelSpace;
    }

    public static void getDogSpace() {
        return dogSpace;
    }

    public static void setWeight(int animalWeight) {
        dogWeight = animalWeight;
    }

    public static void getWeight() {
        return dogWeight;
    }

    public static void setGrooming(String grooming) {
        dogGroom = grooming;
    }

    public static void getGrooming() {
        return dogGroom;
    }

    public static void petCheckIn() {
        petBAG obj = new petBAG();

        String petType;
        String petName;
        int petAge;
        int dogSpace;
        int catSpace;
        int daysStay;
        float amountDue;

        petBAG.setType(petType); // set group
        petBAG.setName("Zoey");
        petBAG.setAge(5);
        petBAG.setDogSpace(1);
        petBAG.setWeight(123);
        petBAG.setGrooming("Yes");

        petBAG.getType(); // get group
        petBAG.getName();
        petBAG.getAge();
        petBAG.getDogSpace();
        petBAG.getWeight();
        petBAG.getGrooming();

        
    }
}