package JambaAPI;

public abstract interface Server {
	public abstract String getName();
	public abstract String getVersion();
	public abstract String getJambaVersion();
	
	public abstract int getMaxPlayers();
	public abstract int getPort();
	public abstract int getViewDistance();
	public abstract String getIP();
	public abstract String getServerID();
	public abstract String getWorldType();
	
	public abstract boolean getGeneratedStructures();
	public abstract boolean hasWhiteList();
	
	public abstract boolean getAllowEnd();
	public abstract boolean getAllowNether();
	public abstract boolean allowMobSpawn();
	
	public abstract int Time();
	public abstract boolean isDay();
	public abstract boolean isNight();
	public abstract String getLogger();
}
