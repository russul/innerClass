package cn.scut.yz_01;

public class InnerClass2 {
	private String name = "fish";
	public int age = 3;

	class Inner {
		public void show() {
			System.out.println("����");
			System.out.println(name);// ���ڲ����ж���Χ�������ʱ������Χ����.this
			System.out.println(age);//�ڲ�����Է�����Χ����κ�Ԫ�أ����������������ʹ��˽�еġ���Ϊ�ڽ����ڲ���ʱ�����Զ��и�����ָ����Χ��
		}

	}
	
	public static void main(String[] args) {
		InnerClass2 innerClass2=new InnerClass2();
		InnerClass2.Inner inner=innerClass2.new Inner();
		inner.show();
	}
}
