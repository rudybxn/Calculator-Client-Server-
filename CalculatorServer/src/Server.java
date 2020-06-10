import java.io.*;
import java.util.*;
import java.net.*;

public class Server {

	public static void main(String[] args)throws Exception {
		
		ServerSocket serverSocket = new ServerSocket(1024);
		System.out.println("listening...");
		Vector<Vector<String>> receivedEquations = new Vector<Vector<String>>();
		while(true) {
			Socket so = serverSocket.accept();
			EquationRequestHandler handler = new EquationRequestHandler(so,receivedEquations);
			handler.run();
		}
		
	}
}
