package cn.scut.yz_01;

public class InnerClass2 {
	private String name = "fish";
	public int age = 3;

	class Inner {
		public void show() {
			System.out.println("哈哈");
			System.out.println(name);// 在内部类中对外围类的引用时，用外围类名.this
			System.out.println(age);//内部类可以访问外围类的任何元素（方法与变量），即使是私有的。因为在建立内部类时，会自动有个引用指向外围类
		}

	}
	
	public static void main(String[] args) {
		InnerClass2 innerClass2=new InnerClass2();
		InnerClass2.Inner inner=innerClass2.new Inner();
		inner.show();
	}
}
