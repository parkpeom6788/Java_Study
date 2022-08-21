package 객체직렬화;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class ObjectTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		File file = new File("test.txt");
		Member m = new Member("박범",29);
		if(!file.exists()) {
			file.createNewFile();
		}
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(m);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));		
		Member member = (Member)ois.readObject();
		System.out.println(member);
	}
}
