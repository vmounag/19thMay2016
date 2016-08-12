import java.util.ArrayList;
public class Accountrepo 
{
	int j=0;
	//private Accounts[] accountlist=new Accounts[5];
	private ArrayList<Accounts> accountlist=new Arraylist<Accounts>();
	public boolean save(Accounts a)
 	{
      if(j<5) 
        {
	      //accountlist[j]=a;
    	  accountlist.add(a);
          j++;
         return true;
         }
       else	
      {
	    return false;
       }
		
	}
	public Accounts findOne( int accountNumber)
	{
		for(int i=0;i<5;i++)
		{
			if((accountlist.get(i).getAccountNumber())==accountNumber)
			{
				return accountlist.get(i);
			}
		}
		return null;
	}
	
	

}
