package cypher.thread;

import cypher.file.FileManager;

public class TrKsetInvalidateFile extends Thread{
	
	@Override
	public void run() {
		FileManager.getInstance().invalidateKeys();
	}
}
