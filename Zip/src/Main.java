import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {

	public static void main(String[] args) {
		String zipFileName = "c:/file.zip";
		String[] files = new String[3];
		files[0] = "C:/Users/haga5/Desktop/zip/Fileupload";

		byte[] buf = new byte[4096];
		try {
			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
			for (int i = 0; i < files.length; i++) {
				FileInputStream in = new FileInputStream(files[i]);
				Path p = Paths.get(files[i]);
				String fileName = p.getFileName().toString();

				ZipEntry ze = new ZipEntry(fileName);
				out.putNextEntry(ze);

				int len;
				while ((len = in.read(buf)) > 0) {
					out.write(buf, 0, len);
				}

				out.closeEntry();
				in.close();
			}

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
