package cypher.thread;

import cypher.config.Property;

public class TrKsetInitialize extends Thread{

	@Override
	public void run() {
		Property.setDefaultProperties();
	}
}
