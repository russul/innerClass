package cn.scut.yz_01;

/*
 * 内部类遇到向上转型
 * 
 */

interface Content {
	String readLine();
}

interface Destination {
	int value();
}

public class InnerClass3 {
	private class myContent implements Content {
		private String label = "1";

		@Override
		public String readLine() {

			return label;
		}

	}

	protected class myDestination implements Destination {

		@Override
		public int value() {

			return 0;
		}

	}

	public static void main(String[] args) {
		InnerClass3 innerClass3 = new InnerClass3();
		Destination d1 = innerClass3.new myDestination();
		Content c1 = innerClass3.new myContent();
		System.out.println(c1.readLine() + "!=" + d1.value());
	}
}
