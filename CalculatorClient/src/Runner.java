
import java.io.*;

public class Runner {
	  private static ObjectInputStream in;
	   private static ObjectOutputStream out;

	public static void main(String[] args) throws Exception {
		System.out.println("Begin client program...");
		Context ctx = new Context();
		View newView = new View();
		
		ctx.setCalculator(newView);	
		newView.attach(ctx);		
	}
	
	 public static void sendMsg(Object msg) {
	        try {
	            out.writeObject(msg);
	            out.flush();
	            out.reset();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 public Object receiveMsg(){
	        Object msg = null;
	        try {
	            msg = in.readObject();
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        return msg;
	    }
}