package sii.dp.responsibility;

public class GlobalLogger {
	
	private LoggerChain logger;

	public GlobalLogger() {
		LoggerChain info = new InfoMessageLogger(null);
		LoggerChain warning = new WarningMessageLogger(info);
		LoggerChain error = new ErrorMessageLogger(warning);
				
		logger = error;
	}
	
	public void setLog(LoggerChain.LogScope logScope, String message) {
		logger.setLog(logScope,  message);
	}
	
	public void getLog() {
		System.out.println(logger.getLog());
	}
	
}
