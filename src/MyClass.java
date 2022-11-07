public class MyClass {
    private String surname;
    private String name;
    private int age;
    private String food;
    private String[] lesson;

    public MyClass(String surname,String name, int age){
        this.surname=surname;
        this.name=name;
        this.age=age;
    }
    public MyClass(String food,String[] lesson){
        this.food=food;
        this.lesson=lesson;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFood() {
        return food;
    }

    public String[] getLesson() {
        return lesson;

    }
}
