abstract class Abstract {
abstract	void show();
}
	class B extends Abstract{
		void show()
		{
			System.out.println("CAP");
		
		}
	}
		class Main{
			public static void main(String[] args) {
				B b=new B();
				b.show();
			}
			
		
	}


