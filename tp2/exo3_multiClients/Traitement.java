package exo3_multiClients;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Traitement extends Thread{

	Socket com ;
	
	
	public Traitement(Socket com) {
		super();
		this.com=com;
	}
	
	@Override
	public void run() {
		
		super.run();
		InputStream is = null;
		OutputStream os;
		
		try {
			is = com.getInputStream();
			os = com.getOutputStream();
			
			
			// communication on envoi et recoi ....
			System.out.println("un thread fils a lu d'un client : " + is.read() );

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

		
		
		
	}
}
