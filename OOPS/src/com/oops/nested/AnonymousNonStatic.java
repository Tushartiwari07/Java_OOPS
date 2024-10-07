package com.oops.nested;
class Test
{
	public void test()
	{
		System.out.println("Hi");
	}
}

public class AnonymousNonStatic
{
   public static void main(String[] args)
   {
	Test t1=new Test(){
		public void test()
		{
			System.out.println("How are you");
		}
	};
	t1.test();
	 Test t2=new Test() {
		 public void test()
			{
				System.out.println("are you fine");
			}
	 };
	 t2.test();
	

}
}
