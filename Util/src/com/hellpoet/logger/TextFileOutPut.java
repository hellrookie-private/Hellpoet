package com.hellpoet.logger;

import java.io.*;

public class TextFileOutPut implements LogOutPut {
	private BufferedWriter outPutStream;
	private int flushCount;
	private int MAX_FLUSH_COUNT = 50;
	
	public TextFileOutPut(String path) throws IOException{
		File logFile = new File(path);
		if(!logFile.exists()){
			logFile.createNewFile();
		}
		flushCount = 0;
		outPutStream = new BufferedWriter(new FileWriter(logFile, true));
	}
	
	@Override
	public boolean write(String logMsg) {
		try {
			outPutStream.write(logMsg);
			if(++flushCount >= MAX_FLUSH_COUNT){
				outPutStream.flush();
				flushCount = 0;
			}
		} catch (IOException e) {
			
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public void close() {
		try{
			if(outPutStream != null){
				outPutStream.flush();
				outPutStream.close();
				outPutStream = null;
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
