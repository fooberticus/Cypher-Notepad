package cypher.thread;

import cypher.file.FileManager;

public class TrKeyLoad extends Thread{
	
	@Override
	public void run() {
		FileManager.getInstance().loadKeys();
	}
}
