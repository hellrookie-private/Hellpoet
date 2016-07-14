package com.hellpoet.logger;

public interface LogOutPut {
	boolean write(String logMsg);
	void close();
}
