package filedemo;

public class FileFactory {
	
	public static FileSync genarate(String fileType) {
		if(fileType.equalsIgnoreCase("pdf")) {
			return new GenaratePDFFile();
		}else {
			return new GenarateTextFile();
		}
	}

}
