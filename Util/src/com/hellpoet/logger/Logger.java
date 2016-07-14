package com.hellpoet.logger;

public class Logger {
	private LogOutPut logWriter;
	
	public Logger(LogOutPut logWriter){
		this.logWriter = logWriter;
	}
	
	public boolean write(String logMsg, LogLevel level){
		return logWriter.write(String.format("%s[%s]%s%n", level, getCurrentTime(),logMsg));
	}
	
	private String getCurrentTime(){
		java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(new java.util.Date());
	}
	
	public void close()
	{
		logWriter.close();
	}
}
