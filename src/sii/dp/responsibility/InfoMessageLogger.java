package sii.dp.responsibility;

public class InfoMessageLogger extends AbstractMessageLogger implements LoggerChain {
	
	private final LoggerChain nextLogger;
	
	public InfoMessageLogger(LoggerChain nextLogger) {
		this.nextLogger = nextLogger;
	}

	@Override
	public void setLog(LogScope logScope, String message) {
		if(LogScope.INFO.equals(logScope)) {
			this.message = LogScope.INFO.getType() + message;
		} else {
			this.message = "!!DEFAULT: " + message;
		}
	}

	@Override
	public String getLog() {
		return message;
	}
}
