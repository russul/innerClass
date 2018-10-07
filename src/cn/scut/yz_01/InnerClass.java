package cn.scut.yz_01;


public class InnerClass {
	private String name;
	public int age;

	class Inner {
		
		public void show() {
			System.out.println("哈哈");
			System.out.println(InnerClass.this.name);//在内部类中对外围类的引用时，用外围类名.this
		}
	}

	public static void main(String[] args) {
		InnerClass o = new InnerClass();
		InnerClass.Inner i = o.new Inner();//对内部类对象的声明必须是外围类名.内部类名Outer_1.Inner，在创建内部类对象时必须通过外围类对象.new 内部类构造方法
		i.show();
		
	}
}
