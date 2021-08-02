import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {
		
		public void CreateFile(String location) {
			try {
			      File myObj = new File(location);
			      if (myObj.createNewFile()) {
			        System.out.println("File created: " + myObj.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			 }
		}
		
		public void WriteToFile(String location, String content) {
			try {
			      FileWriter myWriter = new FileWriter(location);
			      myWriter.write(content);
			      myWriter.close();
			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			      System.out.println(e);
			    }
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadAndWrite obj = new ReadAndWrite();
//		obj.CreateFile("C:\\Users\\anura\\Desktop\\file.txt");
//		obj.wri
		obj.WriteToFile("C:\\Users\\anura\\Deskdastop\\file1.txt", "Hi");
	}

}
