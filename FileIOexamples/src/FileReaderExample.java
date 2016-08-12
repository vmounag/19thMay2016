import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileReaderExample {

	
	public static void main(String[] args) throws FileNotFoundException,IOException {
File file=new File("D:\\mouna\\IDE_program\\FileIOexamples\\src\\source\\mouna.txt");
BufferedReader br=new BufferedReader(new FileReader(file));
try{

String data=br.readLine();
while(data!=null)
{
	System.out.println(data);
	data=br.readLine();
	 
}

}catch(FileNotFoundException e){
	
	
}catch(IOException ie)
{

}
	
	finally{
		br.close();
	}

}}
