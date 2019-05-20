package mastermind.views;

import mastermind.controllers.PlayController;
import mastermind.utils.WithConsoleView;

class AttemptsView extends WithConsoleView{
	
	private PlayController playController;
	
	AttemptsView(PlayController proposalController){
		this.playController = proposalController;
	}
	
	void writeln() {
		MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts", "" + this.playController.getAttempts());
	}

}