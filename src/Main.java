
public class Main {
    public static void main(String[] args){
        Person Daniil = new Person("Даниил", "Лапицкий", "26.11.2006");
        Car car = new Car("Lamborghini Countach", 2023, 300.0);
        Book book = new Book("Создатель Ламборгини ", "Лапицкий Д.В.", 2007);

        Daniil.display();
        car.display();
        book.display();

        Daniil.displayout(car, book);
    }
}
class Person{
    String Name;
    String Surname;
    String Birthday;
    Person(String Name, String Surname, String Birthday){
        this.Name = Name;
        this.Surname = Surname;
        this.Birthday = Birthday;
    }

    void display(){
        System.out.printf( "%s %s. Год рождения: %s\n", Name, Surname, Birthday);
    }

    void displayout(Car car, Book book){
        System.out.println(Name + " читает книгу " + book.Title + " про машину " + car.Title);
    }
}

class Car{
    String Title;
    int Year;
    double Capacity;

    Car(String Title, int Year, double Capacity){
        this.Title = Title;
        this.Year = Year;
        this.Capacity = Capacity;
    }

    void display(){
        System.out.printf( "%s Год выпуска: %s. Объем двигателя: %s\n", Title, Year, Capacity);
    }
}

class Book{
    String Title;
    String Author;
    int Year;

    Book(String Title, String Author, int Year){
        this.Title = Title;
        this.Author = Author;
        this.Year = Year;
    }

    void display(){
        System.out.printf( "%s %s. Год выпуска издания: %s\n", Title, Author, Year);
    }
}