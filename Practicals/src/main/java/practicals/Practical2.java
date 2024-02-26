package practicals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Practical2 {
	
	

	public static void doesFileExist(String path) {

		File file = new File(path);
		
			try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
				String line;
				while ((line = reader.readLine()) != null) {
					String[] parts = line.split("[-,]");
					for (int i = 0; i < parts.length; i++) {
						System.out.println(parts[i]);
					}

				}
			} catch (IOException e) {
				System.out.println("Error: File not found at location: " + path);
				e.printStackTrace();


	}

}
}
