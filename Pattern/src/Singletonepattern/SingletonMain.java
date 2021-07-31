package Singletonepattern;

public class SingletonMain {

	public static void main(String[] args) {
		//Singletone_pattern sp = new Singleton_pattern();
		Singletone_pattern sp = Singletone_pattern.getInstant();
		System.out.println("sp : "+sp);
		Singletone_pattern sp1 = Singletone_pattern.getInstant();
		System.out.println("sp1 : "+sp1);
	}

}
