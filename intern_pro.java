package nitin;

import java.io.*;
import java.util.Scanner;

public class intern_pro {
	 private static Scanner object;

	public static void main(String[] args) throws IOException {
    	 File textFile = new File("textFile.txt");
    	 FileWriter fileWriter = new FileWriter(textFile,true);
    	 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    	 PrintWriter printWriter = new PrintWriter(bufferedWriter);
    	 
    	 if(textFile.exists() == false) {
    		 textFile.createNewFile();
    		 System.out.println("The file has been created!");
    	 }else {
    		 System.out.println("The file already exists!");
    	 }
    	 
    	 int n,i,a;
 		 
    	 System.out.println("How many numbers you want to store in the file?");
 		 object = new Scanner(System.in);
 		 n = object.nextInt();
 		 System.out.printf("Now enter %d number(s) ", n);
 		 try {
 			for(i = 0; i < n; i++) {
 				a = object.nextInt();
 				printWriter.print(" "+a+" ");
 			}
 		 }catch(Exception e) {
 			System.out.println();
 		 }
    	 printWriter.close();
     }
}
