import java.util.*;

class Logger{
		private static Logger instance;
		
		private Logger(){
				System.out.println("Logger created!!");
		}
		
		public static Logger getLogger(){
				if(instance==null){
					instance=new Logger();
				}
				return instance;
		}
		
		public void log(String message){
				System.out.println("LOG: "+message);
		}
}

class SingletonPatternExample{
		public static void main(String[]args){
			Logger logger1=Logger.getLogger();
			logger1.log("First log message.");
				
			Logger logger2=Logger.getLogger();
			logger2.log("Second log message.");
				
			if(logger1==logger2){
				System.out.println("Only one Logger instance exists.");
			} 
			else{
				System.out.println("Multiple Logger instances exist.");
			}
				
			System.out.println("Logger1 HashCode: "+logger1.hashCode());
			System.out.println("Logger2 HashCode: "+logger2.hashCode());
		}
}