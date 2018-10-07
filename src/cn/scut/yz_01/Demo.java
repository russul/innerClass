package cn.scut.yz_01;



/*
 * 内部类遇到向上转型
 * private内部类可以完全阻止任何依赖于类型的编码？？？？。完全隐藏实现的细节
 */

interface Contents {
	String readLine();
}

interface Destinations {
	int value();
}

class Outer_4{
//	private class myContents implements Contents { //一旦用private 修饰符，外部类将不能访问,通常只有public 和default能修饰类，但内部类，四个权限修饰符均可以，在这里，可以把内部类看成是和成员方法同等地位
	public class myContents implements Contents {	
		private String label = "1";

		@Override
		public String readLine() {

			return label;
		}

	}

	protected class myDestinations implements Destinations {

		@Override
		public int value() {

			return 0;
		}

	}

}
public class Demo {
	public static void main(String[] args) {
		Outer_4 outer_4 = new Outer_4();
		Destinations d1 = outer_4.new myDestinations();
		Contents c1 = outer_4.new myContents(); //这里将会报错，内部类定义为private，因此此时向上转型就会失败
		System.out.println(c1.readLine() + "!=" + d1.value());
	}
}
