class TestCode
{
	void m1()
	{
		System.out.println("TestCode....m1()");
	}
	void m2()
	{
		System.out.println("TestCode....m2()");
	}
}
class A
{
public static void main(String[] args)
	{
		TestCode tc = new TestCode();
		tc.m1();
		System.out.println("Hello World");
	}
}