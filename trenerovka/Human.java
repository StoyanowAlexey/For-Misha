package trenerovka;

public class Human {
    private String name;
    private Gender gender;
    private int age;
    private double weight;
    private double height;

    public String getName(){
        return name;
    }

    public void setName(String userName){
        this.name = userName;
        if(userName.isEmpty()){
            System.out.println("Vi vveli pustoe imya ");
        }
        else {
            System.out.println("name - " + userName);
        }
    }
    public int getAge() {return age;}

    public void setAge(int userAge){
        this.age = userAge;
        if(userAge < 0) {
            System.out.println("Vi vveli vosrast < 0");
        }
        else {
            System.out.println("age = " + age);
        }
    }

    public Gender getGender(){return gender;}

    public void setGender(Gender userGender){
        this.gender = userGender;
        if(userGender == Gender.MALE || userGender== Gender.FEMALE || userGender == Gender.OTHER) {
            System.out.println("Gender = " + userGender);
        }
        else {
            System.out.println("Vi vveli nepravilniy gender");
        }
    }

    public double getWeight(){return weight;}

    public void setWeight(double userWeight){
        this.weight = userWeight;
        if(userWeight < 0) {
            System.out.println("Vi vveli vosras menshe 0");
        }
        else {
            System.out.println("Weight = " + userWeight);
        }
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double userHight){
        this.height = userHight;
        if(userHight < 0){
            System.out.println("Vi vveli  hight < 0 ");
        }
        else {
            System.out.println("Hight = " + userHight);
        }
    }

    public Human(String name, Gender gender, int age,double weight,double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.height = height;
    }

    public String toString(){
        return name+","+age+","+weight+","+ height +","+gender;
    }

}
