public class teenager extends Person{
    public int Mark = 12;
    public int getMark(){
        return Mark;
    }

    public void setMark(int userMark){
        userMark = this.Mark;
        System.out.print("Your mark is " + userMark);
        if(userMark < 9 && userMark >= 1) System.out.println("You hve BAD mark");
        else if(userMark > 9 && userMark <= 12) System.out.println("You have GOOD mark");
        else System.out.println("Error");
    }

    public void Studying(){
        System.out.println("I study in school");
    }
    public void Marks(){

    }
}
