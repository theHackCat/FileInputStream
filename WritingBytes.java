import java.io.*;

public class WritingBytes {

	
	public static void main(String[] args) throws Exception{
		
		FileInputStream myFileIn;
		FileOutputStream myFileOut;
		final int SIZE = 100;
		int k, val;
		byte[] myBytes;
		
		myBytes = new byte[SIZE];
		for(k = 0; k < SIZE; k++)
			myBytes[k] = (byte)k;
		
		myFileOut = new FileOutputStream("TestStream.dat");
		myFileOut.write(myBytes);
		myFileOut.close();
		
		myFileIn = new FileInputStream("TestStream.dat");
		for(k = 0; (val = myFileIn.read()) != -1; k++)
			myBytes[k] = (byte)val;
		myFileIn.close();
		
		for(k = 0; k < SIZE; k++) {
			if(k < 10)
				System.out.print(" " + myBytes[k] + " ");
			else
				System.out.print(myBytes[k] + " ");
			if(k % 10 == 0)
				System.out.println();
		}
	}
}
