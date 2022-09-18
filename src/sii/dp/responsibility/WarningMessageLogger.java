package sii.dp.responsibility;

public class WarningMessageLogger extends AbstractMessageLogger implements LoggerChain {
	
	private final LoggerChain nextLogger;
	
	public WarningMessageLogger(LoggerChain nextLogger) {
		this.nextLogger = nextLogger;
	}

	@Override
	public void setLog(LogScope logScope, String message) {
		if(LogScope.WARNING.equals(logScope)) {
			this.message = LogScope.WARNING.getType() + message;
			this.logScope = logScope;
		} else {
			nextLogger.setLog(logScope, message);
		}
	}

	@Override
	public String getLog() {
		if(LogScope.WARNING.equals(this.logScope)) {
			return message;
		} else {
			return nextLogger.getLog();
		}
	}
}
