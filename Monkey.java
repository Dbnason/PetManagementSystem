// Project Pet Bag
// IT 145
// Created By Darren Nason
// Monkey.java child class file


public class Monkey extends RescueAnimal {
    // Declared Variables 
    private String tailLength;
    private String monkeyHeight;
    private String monkeyBodyLength;
    private String monkeySpecies;

    // General construcor 
    public Monkey(){}
    // Constructor
    public Monkey( String name, String gender, String age,
                  String weight, String tailLength, String monkeyHeight, String monkeyBodyLength, String monkeySpecies, String acquisitionDate, String acquisitionCountry,
                  String trainingStatus, boolean reserved, String inServiceCountry) {
        super();
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }
    // Accessors & Mutators specific to the monkey class
    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    public String getTailLength(){
        return tailLength;
    }

    public void setMonkeyHeight(String monkeyHeight){
        this.monkeyHeight = monkeyHeight;
    }

    public String getMonkeyHeight(){
        return monkeyHeight;
    }

    public void setMonkeyBodyLength(String monkeyBodyLength){
        this.monkeyBodyLength = monkeyBodyLength;
    }

    public String getMonkeyBodyLength(){
        return monkeyBodyLength;
    }

    public void setMonkeySpecies(String monkeySpecies){
        this.monkeySpecies = monkeySpecies;
    }

    public String getMonkeySpecies(){
        return monkeySpecies;
    }


    // toString method to format the ArrayList to properly output the fields
    @Override
    public String toString() {
        return "\nMonkey {" + "\n" +
                " name: " + getName() +
                ", gender: " + getGender()  +
                ", age: " + getAge()  +
                ", weight: " + getWeight()  +
                ", tail length: " + getTailLength() +
                ", height: " + getMonkeyHeight() +
                ", body length: " + getMonkeyBodyLength() +
                ", species: " + getMonkeySpecies() +
                ", acquisitionDate: " + getAcquisitionDate()  +
                ", acquisitionLocation: " + getAcquisitionLocation()  +
                ", trainingStatus: " + getTrainingStatus()  +
                ", reserved: " + getReserved() +
                ", inServiceCountry: " + getInServiceLocation()  +
                '}' + "\n\n";
    }
}
