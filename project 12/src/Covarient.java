
class Parent {
	Object show()
	{
		Parent p=new Parent();
		return p;
	}
	}
	class Child extends Parent
	{
      String show()
		{ Child c1=new Child();
        	
			return "null";
		}
			
	}
    public class Covarient extends Child{ 
      public static void main(String[] args) {
		Child c=new Child();
		c.show();
	}

    }
	

