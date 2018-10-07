package cn.scut.yz_01;

public class InnerClass4 {
	private  static int a1 = 5;
	private static int a2 = 6;

	static class StaticInner {
		void show() {
			System.out.println(a1);
		}

		static void show2() {
			System.out.println(a2);
		}
	}
	
	public static void main(String[] args) {
		InnerClass4.StaticInner is=new InnerClass4.StaticInner();
		is.show();
//		is.show2();
		InnerClass4.StaticInner.show2();
	}
}
