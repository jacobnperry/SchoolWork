public class Dog {

    public class Pets {
    private String petType;
    private String petName;
    private int petAge;
    private double amountDue;
    private int dogSpace = 0;
    private int daysStay = 0;    
    private int dogWeight = 0;
    private String dogGroom = "Yes";

    public void setType(String animalType){
        petType = animalType;
    } //mutator

    public void getType (){
        return petType;
    }

    public void setName(String animalName) {
        petName = animalName;
    }

    public void getName(){
        return petName;
    }

    public void setAge(int animalAge) {
        petAge = animalAge;
    }

    public void getAge() {
        return petAge;
    }

    public void setDogSpace(int kennelSpace){
        dogSpace = kennelSpace;
    }

    public void getDogSpace() {
        return dogSpace;
    }

    public void setWeight(int animalWeight) {
        dogWeight = animalWeight;
    }

    public void getWeight() {
        return dogWeight;
    }

    public void setGrooming(String grooming) {
        dogGroom = grooming;
    }

    public void getGrooming() {
        return dogGroom;
    }


    public static void main(String[] args) {
        Animals dogs = new Pets();



        dogs.setType(petType);  //set group
        dogs.setName("Zoey");
        dogs.setAge(5);
        dogs.setDogSpace(1);
        dogs.setWeight(123);
        dogs.setGrooming("Yes");
     
        dogs.getType(petType);  //get group
        dogs.getName("Zoey");
        dogs.getAge(5);
        dogs.getDogSpace(1);
        dogs.getWeight(123);
        dogs.getGrooming("Yes");
    }

}



   
}




