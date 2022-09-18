package sii.dp.responsibility;

public class Main {

	public static void main(String[] args) {
		
			GlobalLogger globalLogger = new GlobalLogger();
			
			globalLogger.setLog(LoggerChain.LogScope.INFO, "InfoMsg");
			
			globalLogger.getLog();
			
			globalLogger.setLog(LoggerChain.LogScope.WARNING, "WarningMsg");
			
			globalLogger.getLog();
			
			globalLogger.setLog(LoggerChain.LogScope.ERROR, "ErrorMsg");
			
			globalLogger.getLog();
	}

}
