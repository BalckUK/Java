import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

//압축 해제 코드
public class MadPlay1 {
	private final int MAX_SIZE = 1024;

	public void unzipExample() {

		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		ZipInputStream zipInputStream = null;
		try {
			fileInputStream = new FileInputStream("result.zip");
			zipInputStream = new ZipInputStream(fileInputStream);
			ZipEntry zipEntry = null;

			while ((zipEntry = zipInputStream.getNextEntry()) != null) {
				fileOutputStream = new FileOutputStream(zipEntry.getName());

				int length = 0;
				while ((length = zipInputStream.read()) != -1) {
					fileOutputStream.write(length);
				}

				zipInputStream.closeEntry();
				fileOutputStream.flush();
				fileOutputStream.close();
			}
			zipInputStream.close();
		} catch (IOException e) {
			// Exception Handling
		} finally {
			try {
				zipInputStream.closeEntry();
				fileOutputStream.flush();
				fileOutputStream.close();
				zipInputStream.close();
			} catch (IOException e) {
				// Exception Handling
			}
		}
	}

	public static void main(String[] args) {
		new MadPlay1().unzipExample();
	}
}
