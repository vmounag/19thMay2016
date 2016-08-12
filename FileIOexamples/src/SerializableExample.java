
import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;

import java.io.Serializable;




class Employee implements Serializable

{

private String name;




private transient String projectInfo;

 




public Employee(String name, String projectInfo) {

super();

this.name = name;

this.projectInfo = projectInfo;

}







@Override

public String toString() {

return "Employee [name=" + name + ", projectInfo=" + projectInfo + "]";

}







 

 

}

public class SerializableExample {




public static void main(String[] args) throws IOException, ClassNotFoundException {

FileOutputStream fos=new FileOutputStream(new File("D:\\employee.ser"));

ObjectOutputStream oos=new ObjectOutputStream(fos);

oos.writeObject(new Employee("Sachin","Banking"));

 

FileInputStream fis=new FileInputStream(new File("D:\\employee.ser"));

ObjectInputStream ois=new ObjectInputStream(fis);

 

Employee emp = (Employee)ois.readObject();

 

System.out.println(emp);

 

 




}






}
