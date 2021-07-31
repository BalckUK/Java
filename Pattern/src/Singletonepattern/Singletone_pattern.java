package Singletonepattern;

public class Singletone_pattern {

	// 클래스 맴버필드
	private static Singletone_pattern sp;

	public static Singletone_pattern getInstant() {
		if (sp == null) {
			sp = new Singletone_pattern();
		}
		return sp;
	}

	// private 생성자
	private Singletone_pattern() {

	}
}
