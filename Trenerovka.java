import java.util.Scanner;


public class Trenerovka {
    enum enumGender {
        M,
        W
    }
    public static void main(String [] args){
        Human human1 = new Human("Lesha",14,'M',60.12,1.70);
        System.out.println(human1);
        human1.setName("Andrey");
        human1.setAge(16);
        human1.setGender('M');
        human1.setHight(1.23);
        human1.setWeight(52.2);
        //System.out.println(human1.getAge() + human1.getName() + human1.getGender() + human1.getHight() + human1.getWeight());
        human1.gender = enumGender.M;
    }
}
class Human{
    private String name;
    private int age;
    private char gender;
    private double weight,hight;

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

    public char getGender(){return gender;}

    public void setGender(char userGender){
        this.gender = userGender;
        if(userGender== 'M' || userGender=='W') {
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

    public double getHight(){
        return hight;
    }
    public void setHight(double userHight){
        this.hight = userHight;
        if(userHight < 0){
            System.out.println("Vi vveli  hight < 0 ");
        }
        else {
            System.out.println("Hight = " + userHight);
        }
    }

    public Human(String name,int age,char gender,double weight,double hight){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.hight = hight;
    }

    public String toString(){
        return name+","+age+","+weight+","+hight+","+gender;
    }


}
