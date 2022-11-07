import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    MyClass myClass=new MyClass("jenishbekov","yntymak",20);
    System.out.println("surname: "+myClass.getSurname()+"\n" +
            "name: "+myClass.getName()+"\n" +
            "age: "+myClass.getAge());

    MyClass myClass1=new MyClass("manty",new String[]{"java","engl","soft"});

        System.out.println("food: "+myClass1.getFood()+"\n" +
                "lesson: "+Arrays.toString(myClass1.getLesson()));
    }
}