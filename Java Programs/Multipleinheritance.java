
interface PI1 {
	 public void show()
	{
		System.out.println("Default PI1");
	}
}
interface PI2 {
 public void show()
	{
		System.out.println("Default PI2");
	}
}

class Main implements PI1, PI2 {
	public void show()
	{
		PI1.super.show();
		PI2.super.show();
	}
	public static void main(String args[])
	{
		Main d = new Main();
		d.show();
	}
}

/*
output:

Default PI1
Default PI2

*/
