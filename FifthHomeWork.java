/**
 * Java 1. Homework #5
 *
 * @author Dmitry Chivkin
 * @version 21.12.2021
 */
 
class FifthHomeWork {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("Viktor", "Policeman", "viktor@mail.com", "89636431332", 50000, 30);
        person[1] = new Person("Sergey", "Teacher", "serg@mail.com", "89633221122", 150000, 39);
        person[2] = new Person("Dimon", "Driver", "@mail.com", "8963643332", 35000, 29);
        person[3] = new Person("Evgeniy", "Slesar", "viktor@mail.com", "8963643332", 25000, 45);
        person[4] = new Person("Islam", "Cleaner", "viktor@mail.com", "8963643332", 15000, 41);
        for (int i = 0; i < person.length; i++) {
            if(person[i].getAge() > 40) {
                System.out.println(person[i].toString());
            }
        }
    }
}


class Person {
     private String name;
     private String position;
     private String email;
     private String phone;
     private int salary;
     private int age;
    //constructor
    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
        //getter
    public int getAge() {
        return age;
    }


    
    
    
    @Override
    public String toString() {
        return name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }
}