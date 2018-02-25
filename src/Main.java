import java.io.File;
import java.util.ArrayList;

import easyaccept.EasyAccept;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ArrayList<String> testes = new ArrayList<>();
		
		testes.add("us" + File.separator + "us1_test.txt");
		EasyAccept.executeEasyAcceptTests("Facade", testes);
	}

}
