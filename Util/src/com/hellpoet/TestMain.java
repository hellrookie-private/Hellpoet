package com.hellpoet;
import java.io.IOException;

public class TestMain {

	public static void main(String[] args) throws IOException {
		com.hellpoet.logger.Logger logger = new com.hellpoet.logger.Logger(new com.hellpoet.logger.TextFileOutPut("/users/hellpoet/desktop/b.log"));
		logger.write("aa", com.hellpoet.logger.LogLevel.INFO);
		logger.write("aa", com.hellpoet.logger.LogLevel.INFO);
		logger.write("aa", com.hellpoet.logger.LogLevel.INFO);
		logger.write("aa", com.hellpoet.logger.LogLevel.INFO);
		logger.close();
	}

}
