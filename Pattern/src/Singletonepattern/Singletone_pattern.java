package Singletonepattern;

public class Singletone_pattern {

	// Ŭ���� �ɹ��ʵ�
	private static Singletone_pattern sp;

	public static Singletone_pattern getInstant() {
		if (sp == null) {
			sp = new Singletone_pattern();
		}
		return sp;
	}

	// private ������
	private Singletone_pattern() {

	}
}
