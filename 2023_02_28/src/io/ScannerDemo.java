package io;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

public class ScannerDemo {

	public static void main(String[] args) {
		try {
			File file = new File("out.txt");
			Scanner sc= new Scanner(file);
			while(sc.hasNext()) {
				System.out.print(sc.next());
			}
			sc.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
