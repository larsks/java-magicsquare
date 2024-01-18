package magicsquare;

import exceptions.*;

public class App {
	private static int msSize;

	public void processArgs(String[] args) throws InvalidArgumentException {
		if (args.length != 1) {
			throw new InvalidArgumentException("You must specify the size of the magic square.");
		}

		msSize = Integer.parseInt(args[0]);
	}

	public static void main(String[] args) {
		MagicSquare ms;
		App app = new App();

		try {
			app.processArgs(args);
			ms = new MagicSquare(msSize);
		}
		catch (BaseException err) {
			System.out.println("ERROR: " + err);
			System.exit(1);
			return;
		}

		System.out.println("Created magic square of size " + ms.getSize());
		ms.print();
	}
}
