package cn.scut.yz_01;



/*
 * �ڲ�����������ת��
 * private�ڲ��������ȫ��ֹ�κ����������͵ı��룿����������ȫ����ʵ�ֵ�ϸ��
 */

interface Contents {
	String readLine();
}

interface Destinations {
	int value();
}

class Outer_4{
//	private class myContents implements Contents { //һ����private ���η����ⲿ�ཫ���ܷ���,ͨ��ֻ��public ��default�������࣬���ڲ��࣬�ĸ�Ȩ�����η������ԣ���������԰��ڲ��࿴���Ǻͳ�Ա����ͬ�ȵ�λ
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
		Contents c1 = outer_4.new myContents(); //���ｫ�ᱨ���ڲ��ඨ��Ϊprivate����˴�ʱ����ת�;ͻ�ʧ��
		System.out.println(c1.readLine() + "!=" + d1.value());
	}
}
