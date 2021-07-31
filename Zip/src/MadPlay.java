import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//파일 압축 코드
public class MadPlay {
	private final int MAX_SIZE = 1024;

	public void zipExample() {
		String[] files = { "test1.txt", "test2.txt", "test3.txt" };
		byte[] buf = new byte[MAX_SIZE];

		ZipOutputStream outputStream = null;
		FileInputStream fileInputStream = null;
		try {
			outputStream = new ZipOutputStream(new FileOutputStream("result.zip"));

			for (String file : files) {
				fileInputStream = new FileInputStream(file);
				outputStream.putNextEntry(new ZipEntry(file));

				int length = 0;
				while (((length = fileInputStream.read()) > 0)) {
					outputStream.write(buf, 0, length);
				}
				outputStream.closeEntry();
				fileInputStream.close();
			}
			outputStream.close();
		} catch (IOException e) {
			// Exception Handling
		} finally {
			try {
				outputStream.closeEntry();
				outputStream.close();
				fileInputStream.close();
			} catch (IOException e) {
				// Exception Handling
			}
		}
	}

	public static void main(String[] args) {
		new MadPlay().zipExample();
	}
}
