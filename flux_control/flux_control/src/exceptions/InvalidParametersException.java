package exceptions;

public class InvalidParametersException extends Exception{
	private static final long serialVersionUID = 1L;
	
	@Override
	  public String getMessage(){
	    return "The second number must be higher than the first one.";
	  }
}
