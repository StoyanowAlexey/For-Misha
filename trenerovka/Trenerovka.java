package trenerovka;


public class Trenerovka {

    public static void main(String [] args){
        Human human1 = new Human("Lesha",Gender.MALE,14,60.12,1.70);
        System.out.println(human1);
        human1.setName("Andrey");
        human1.setAge(16);
        human1.setGender(Gender.MALE);
        human1.setHeight(1.23);
        human1.setWeight(52.2);
        //System.out.println(human1.getAge() + human1.getName() + human1.getGender() + human1.getHight() + human1.getWeight())
    }
}

