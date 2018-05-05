package exception;

import java.util.logging.*;
import java.io.*;

public class Log {
	Logger logger;
	public Log() {
		logger = Logger.getLogger("MyLog");
		// logger.setUseParentHandlers(false);
		FileHandler fh;
		try {
			// configure the logger with handler and formatter
			fh = new FileHandler("log.txt");
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void info(String str){
		logger.info(str);
	}
}
