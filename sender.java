package JambaAPI.Command;

import JambaAPI.Server;

public abstract interface Sender {
	
	public abstract void sendMessage(String parmString);
	
	public abstract void sendMessage(String[] paramArrayOfString);
	
	public abstract Server getServer();
	
	public abstract String getName();
	
}
