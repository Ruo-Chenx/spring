package com.part01;

public class Foo {
	private Bar bar;
	private Baz baz;
	
	public Foo(Bar bar, Baz baz) {
		System.out.println("FooµÄ¹¹Ôì");
		this.bar = bar;
		this.baz = baz;
	}
	
	public void check() {
		bar.checkBar();
		baz.checkBaz();
	}
}
