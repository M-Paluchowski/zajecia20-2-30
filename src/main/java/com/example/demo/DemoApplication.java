package com.example.demo;

import com.example.demo.manytomany.domain.Author;
import com.example.demo.manytomany.domain.Book;
import com.example.demo.manytomany.repository.AuthorRepository;
import com.example.demo.manytomany.repository.BookRepository;
import com.example.demo.manytomany.service.AuthorService;
import com.example.demo.onetomany.domain.Car;
import com.example.demo.onetomany.domain.Owner;
import com.example.demo.onetomany.repository.CarRepository;
import com.example.demo.onetomany.repository.OwnerRepository;
import com.example.demo.onetoone.domain.Address;
import com.example.demo.onetoone.domain.Person;
import com.example.demo.onetoone.repository.AddressRepository;
import com.example.demo.onetoone.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

//        AddressRepository addressRepository = context.getBean(AddressRepository.class);
//        PersonRepository personRepository = context.getBean(PersonRepository.class);
//
//        Address address = new Address();
//        address.setCity("Wroclaw");
//        address.setFlatNumber("5");
//        address.setHouseNumber("5");
//        address.setStreet("Obornicka");
//
//        Person person = new Person();
//        person.setFirstName("Marcin");
//        person.setLastName("P");
//        person.setAddress(address);
//
////        addressRepository.save(address);
//        personRepository.save(person);

//        OwnerRepository ownerRepository = context.getBean(OwnerRepository.class);
//        CarRepository carRepository = context.getBean(CarRepository.class);

//        Owner owner = new Owner();
//        owner.setFirstName("Marcin");
//        owner.setLastName("P");
//        ownerRepository.save(owner);

//        Car car = new Car();
//        car.setColor("Red");
//        car.setModel("Honda");

//        Car secondCar = new Car();
//        secondCar.setModel("Audi");
//        secondCar.setColor("Black");

//        car.setOwner(owner);
//        secondCar.setOwner(owner);
//        carRepository.save(car);
//        carRepository.save(secondCar);
//        owner.addCar(car);
//        owner.addCar(secondCar);
//        ownerRepository.save(owner);

        AuthorRepository authorRepository = context.getBean(AuthorRepository.class);
        BookRepository bookRepository = context.getBean(BookRepository.class);
        AuthorService authorService = context.getBean(AuthorService.class);

        Book firstBook = new Book();
        firstBook.setTitle("1");

        Book secondBook = new Book();
        secondBook.setTitle("2");

        Book thirdBook = new Book();
        thirdBook.setTitle("3");

        Author firstAuthor = new Author();
        firstAuthor.setName("A");

        Author secondAuthor = new Author();
        secondAuthor.setName("B");

        bookRepository.save(firstBook);
        bookRepository.save(secondBook);
        bookRepository.save(thirdBook);

        firstAuthor.getBooks().add(firstBook);
        firstAuthor.getBooks().add(secondBook);
        secondAuthor.getBooks().add(secondBook);
        secondAuthor.getBooks().add(thirdBook);

        authorRepository.save(firstAuthor);
        authorRepository.save(secondAuthor);

        authorService.printAllBooks();

        authorRepository.deleteById(1L);

        authorService.printAllBooks();
    }
}
