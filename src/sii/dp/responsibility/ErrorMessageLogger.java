package sii.dp.responsibility;

public class ErrorMessageLogger extends AbstractMessageLogger implements LoggerChain {
	
	private final LoggerChain nextLogger;
	
	public ErrorMessageLogger(LoggerChain nextLogger) {
		this.nextLogger = nextLogger;
	}

	@Override
	public void setLog(LogScope logScope, String message) {
		if(LogScope.ERROR.equals(logScope)) {
			this.message = LogScope.ERROR.getType() + message;
			this.logScope = logScope;
		} else {
			nextLogger.setLog(logScope, message);
		}
	}

	@Override
	public String getLog() {
		if(LogScope.ERROR.equals(this.logScope)) {
			return message;
		} else {
			return nextLogger.getLog();
		}
	}
}
