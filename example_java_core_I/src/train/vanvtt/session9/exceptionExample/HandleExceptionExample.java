package train.vanvtt.session9.exceptionExample;

public class HandleExceptionExample {
	public static void main(String[] args) {
		HandleExceptionExample ex = new HandleExceptionExample();
		ex.performBusinessOperation();
	}
	public void performBusinessOperation() {
		try {
			doSomething("A message");
			doSomethingElse();
			doEvenMore();
		/*} catch (MyCustomException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		
		} catch (MyCustomException | NumberFormatException e) {
			e.printStackTrace();
		}

	}

	public void doSomething(String input) throws MyCustomException {
		// do something useful ...
		throw new MyCustomException("A message that describes the error.");
	}

	public void doSomethingElse() {
		// do something else ...
	}

	public void doEvenMore() throws NumberFormatException {
		// do even more ...
	}
}
