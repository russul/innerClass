package cn.scut.yz_01;


public class InnerClass {
	private String name;
	public int age;

	class Inner {
		
		public void show() {
			System.out.println("����");
			System.out.println(InnerClass.this.name);//���ڲ����ж���Χ�������ʱ������Χ����.this
		}
	}

	public static void main(String[] args) {
		InnerClass o = new InnerClass();
		InnerClass.Inner i = o.new Inner();//���ڲ�������������������Χ����.�ڲ�����Outer_1.Inner���ڴ����ڲ������ʱ����ͨ����Χ�����.new �ڲ��๹�췽��
		i.show();
		
	}
}
