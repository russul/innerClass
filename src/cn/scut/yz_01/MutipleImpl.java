package cn.scut.yz_01;

public class MutipleImpl {
	public static void main(String[] args) {
		A a = new A();
		C c = new C();
		D d = new D();
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
	}
}

class A {
}

abstract class B {
}

class C extends B {
	public A makeA() {
		return new A();
	}
}

class D extends A {
	B makeB() {
		return new B() {
		};
	}
}