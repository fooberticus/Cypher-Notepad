package cypher.thread;

import cypher.ui.MainUI;
import cypher.ui.NotepadUI;

public class TrPrepareNotepadUI extends Thread{

	@Override
	public void run() {
		MainUI.notepadUI = new NotepadUI();
		MainUI.notepadUI.initializeUI();
	}
}
