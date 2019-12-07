
public class Test2 {

	public static void main(String[] args) {
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		Test3 t3=new Test3();
		Test4 t4=new Test4();
		Test5 t5=new Test5();
		t1.add(4, 5);
		t1.sub(3,4);
		t1.mul(2, 5);
		t2.greater(5, 6);
		t2.even(5);
		t3.lshift(4, 2);
		t3.rshift(4, 2);
		t3.remainder(5, 8);
		t4.andop(true,false);
		t4.orop(false,true);
		t4.notop(false, true);
		t5.bitand(5, 8);
		t5.bitor(5, 8);
		t5.small(4,6);
}
	public void greater(int a,int b)
	{
		if(a>b)
			System.out.println("a is greater");
		else if(a<b)
			System.out.println("b is greater");
		else
			System.out.println("Both are equal");
	}
	public void even(int a) {
		if(a%2 == 0)
			System.out.println("a is even");
		else
			System.out.println("a is odd");
	}
}
