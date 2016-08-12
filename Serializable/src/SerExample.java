import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
class A implements Serializable{
	private String name;

	public A(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
	
}
class B extends A
{
	private String city;

	@Override
	public String toString() {
		
		return "B [city=" + city + "]";
	}

	public B(String name, String city) {
		super("mouna");
		this.city = city;
	}
	
}
public class SerExample {
public static void main(String[] args) throws Exception {

    FileOutputStream fos=new FileOutputStream("D:\\B.ser");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(new A("geethika"));
    

    FileInputStream fis = new FileInputStream("D:\\B.ser");
    ObjectInputStream ois = new ObjectInputStream(fis);
    B a= (B)ois.readObject();
   
System.out.println(a);
} }