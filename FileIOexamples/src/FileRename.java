import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileRename {
	public static void main(String[] args) {
		try{
		File file1=new File("D:\\mouna\\IDE_program\\FileIOexamples\\src\\source\\geethika.txt");
		//File file2=new File("D:\\mouna\\IDE_program\\FileIOexamples\\src\\destination\\geethika.txt");
		boolean b=file1.renameTo(new File("D:\\mouna\\IDE_program\\FileIOexamples\\src\\destination\\geethika.txt"));	
		if(b){
			System.out.println("file changed successfully");
			
		}else
			System.out.println("unsucessfull");
	}catch(Exception e){
		e.printStackTrace();
	}

}
}