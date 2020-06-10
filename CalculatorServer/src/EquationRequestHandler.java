import java.io.*;
import java.util.*;
import java.net.*;

public class EquationRequestHandler {
	
	Socket socket;
	Vector<Vector<String>> allEquations = new Vector<Vector<String>>();
	
	public EquationRequestHandler(Socket sock, Vector<Vector<String>> aList ) {
		this.socket=sock;
		this.allEquations=aList;
	}
	
	
	public void run() {
		try {
			InputStream input = socket.getInputStream();
			ObjectInputStream objinput = new ObjectInputStream(input);
			@SuppressWarnings("unchecked")
			Vector<String> arr = (Vector<String>) objinput.readObject();
			this.allEquations.add(arr);
			
			for(int i=0;i<allEquations.size();i++) {
				for(int j=0;j<allEquations.get(i).size();j++) {
					System.out.print(allEquations.get(i).get(j));
				}
				System.out.println();
			}
			System.out.println("Number of equations = " +this.allEquations.size());
		}catch(Exception e) {
			System.out.println("Error during handling request.");
		}		
	}
	

}
