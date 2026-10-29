package org.example;

public class Student {
    private String name;
    private int age;
    private String group;
public Student(String name, int age, String group)
{
    this.name=name;
    this.age=age;
    this.group=group;
}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getGroup(){
    return group;
    }
    public void setGroup(String group){
    this.group=group;
    }
    public String getName(){
    return name;
    }
    public void setName(String name){
    this.name=name;
    }
    public String displayInfo(){
    return "Имя"+"\n"+
            this.name+ "\n"+ "Возраст"+ this.age+ "\n"+"Группа"+this.group;
    }
    public static void main (String[] args){
Student student1=new Student("Ваня",12,"T-393");
        Student student2=new Student("Ваня",12,"T-393");
        student2.setAge(13);
        System.out.println(student1.displayInfo());
        System.out.println(student2.displayInfo());
}


}
