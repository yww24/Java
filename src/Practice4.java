import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Scanner;

public class Practice4 {
	public static void main(String args[]) throws IOException {
		String tmp, inst;
		FileInputStream in = null;
		FileOutputStream out = null;
		double sum=0;
		
		int c;
		long start = 0, end = 0;
		ByteBuffer buf = ByteBuffer.allocate(1024*10);

		Scanner s = new Scanner(System.in);
		tmp = s.nextLine();

		inst = tmp.split(" ")[0].toUpperCase();
		for(int i=0; i<5; i++) {
			if (inst.equals("COPY")) {
				try {
					in = new FileInputStream(tmp.split(" ")[1]);
					out = new FileOutputStream(tmp.split(" ")[2]);
					
					start = System.currentTimeMillis();
					while ((c=(in.read(buf.array()))) != -1) {
						out.write(buf.array(), 0, c);
					}
					end = System.currentTimeMillis();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (in != null)
						in.close();
					if (out != null)
						out.close();
				}
			}
			System.out.println("���� �ð�: " + (end - start) / 1000 + "."
					+ (end - start) % 1000 + "(s)");
			sum=sum+end-start;
		}
		System.out.println("��� �ð�:"+sum/5);
	}
	
}