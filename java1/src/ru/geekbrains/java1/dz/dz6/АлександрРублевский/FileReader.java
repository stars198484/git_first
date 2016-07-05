package ru.geekbrains.java1.dz.dz6.АлександрРублевский;

import java.io.*;

public class FileReader {

	public static void main(String[] args) {
		
		char[] array = new char[150];
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (char) (i + 99);
			System.out.print(array[i]);
		}
		try (FileWriter writer = new FileWriter("C:\\Users\\Aleksandr\\Desktop\\1.txt", false)) {
			char[] text = array;
			try {
				writer.write(text);

				char[] array1 = new char[160];
				for (int i = 1; i < array1.length; i++) {
					
					array1[i] = (char) (i + 99);
					System.out.print(array1[i]);
					try (FileWriter writer1 = new FileWriter("C:\\Users\\Aleksandr\\Desktop\\2.txt", false)) {
						char[] text1 = array1;
						try {
							writer1.write(text1);

						}

						catch (IOException ex) {

							System.out.println(ex.getMessage());
						}

					}

				}

			} catch (IOException e2) {
				
				e2.printStackTrace();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
