package cn.scut.yz_01;

public class InnerClass5 {
	void method(final int a){
		class PartInner{
			void show(){
				System.out.println(a);
			}
		}
		
		PartInner p = new PartInner();
		p.show();
	}
	public static void main(String[] args) {
		InnerClass5 innerClass5 = new InnerClass5();
		innerClass5.method(0);
	}
}
