package ucu.edu.ua;

import java.beans.Transient;

//import java.beans.Transient;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Getter;
import lombok.Setter;

@EntityScan
//@Table
@Getter
@Setter

public class Student {
    String name;
    String gender;
   // @Transient
    int age;
    public Student(int age) {
        this.age = age;
    }
    long id;

  //  public int getAge(int age){
  //      return age;
  //  }
//
  //  public int setAge(int age){
  //      this.age = age;
  //  }

    //getAge

    // setAge

    // LOCAL DATE, DATE OF BIRTH;

}

//Student controller:
//  @RestController
// get students()
// add students()



//StudentService:
// getstudents()
// add student()


// Student 



// interface not class
// @Repository
// @StudentRepository
/// Student Repositoryextends JPA repository <Student long>
// @Query("Select...")
//  @Query("SELECT u FROM app_user u WHERE u.email = ?1")
//  Optional(Student)    find_By_first_name(String name);
// Optional(Student)

//
