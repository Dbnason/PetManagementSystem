// Project Pet Bag
// IT 145
// Created By Darren Nason
// Dog.java child class file


public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;

    // Constructor
    public Dog(String name, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }
    // Default Constructor 
    public Dog(){}

    @Override
    public String toString() {
        return "Dog {" + "\n" +
                "name: " + getName() + ", " +
                "breed: " + getBreed() +
                ", gender: " + getGender()  +
                ", age: " + getAge()  +
                ", weight: " + getWeight()  +
                ", acquisitionDate: " + getAcquisitionDate()  +
                ", acquisitionLocation: " + getAcquisitionLocation()  +
                ", trainingStatus: " + getTrainingStatus()  +
                ", reserved: " + getReserved() +
                ", inServiceCountry: " + getInServiceLocation()  +
                '}' + "\n\n";
    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

}
