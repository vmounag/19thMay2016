import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Add {
	public static void main(String[] args) throws IOException  {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			
		
		System.out.println("enter a,b=");
		
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int sum=a+b;
		
		
		System.out.println(sum);
		}//catch(IO exception){
			//System.out.println("IO exception caught");

		finally{
			br.close();
		}
	}

}
