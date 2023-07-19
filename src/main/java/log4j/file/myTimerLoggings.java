package log4j.file;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class myTimerLoggings {

	private static final Logger logger = LogManager.getLogger(myTimerLoggings.class);

	public static void main(String[] args) throws InterruptedException {
	    
		for (int i = 0; i < 3; i++) {
	        debugLog(i);
	        Thread.sleep(1);
	    }

	    for (int i = 0; i < 3; i++) {
	        infoLog(28 + i);
	        Thread.sleep(1);
	    }

	    for (int i = 0; i < 3; i++) {
	        errorLog(21 + i);
	        Thread.sleep(1);
	    }
	}

	private static void debugLog(int seconds) {
	    String logMessage = getDebugTime(seconds);
	    logger.debug(logMessage);
	}

	private static void infoLog(int minutes) {
	    String logMessage = getInfoTime(minutes);
	    logger.info(logMessage);
	}

	private static void errorLog(int hours) {
	    String logMessage = getErrorTime(hours);
	    logger.error(logMessage);
	}

	private static String getDebugTime(int seconds) {
	    return String.format("20:27:%02d", seconds);
	}

	private static String getInfoTime(int minutes) {
	    return String.format("20:%02d:00", minutes);
	}

	private static String getErrorTime(int hours) {
	    return String.format("%02d:00:00", hours);
	}
}
