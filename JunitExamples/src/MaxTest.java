
public class MaxTest {
	public static int maxElement(int a[])
	{int max=0;
		for (int i=0;i<a.length;i++)
		if (max<a[i])
			max=a[i];
		return max;
		
	}

}
