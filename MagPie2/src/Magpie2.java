
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no ") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if (statement.indexOf("Bob") >= 0) {
			response = "Bob makes me feel good. :)";
		} else if (statement.indexOf("asdfghjkl;") >= 0) {
			response = "Talk to me in real English you illiterate Missourian.";
		} else if (statement.indexOf("Hi ") >= 0
				|| statement.indexOf("hi ") >= 0
				|| statement.indexOf("hello") >= 0
				|| statement.indexOf("Hello") >= 0) {
			response = "How are you?";
		} else if (statement.indexOf("good, and you") >= 0) {
			response = "Fine, until you came.";
		} else if (statement.indexOf("Dreyer") >= 0) {
			response = "She seems like a nice teacher";
		} else if (statement.indexOf("Louie") >= 0) {
			response = "Haha.";
		} else if (statement.indexOf("9+10") >= 0) {
			response = "21";
		} else if (statement.indexOf("Cotter") >= 0) {
			response = "I'm triggered.";
		} else if (statement.indexOf("harambe") >= 0
				|| statement.indexOf("Harambe") >=0) {
			response = "rip";
		} else if (statement.indexOf("pikachu") >= 0
				|| statement.indexOf("Pikachu") >= 0) {
			response = "Pikachu welcomes you to the world of Pokemon!!!\n\t\t(\\__/)\n\t\t(o^.^)\n\t       z(____)";
		} else if (statement.indexOf("dank") >= 0 
				|| statement.indexOf("memes") >= 0) {
			response = randomDankMemeResponse();
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 5;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "By its very nature, ideology is silent.";
		} else if (whichResponse == 5) {
			response = "I challenge you to a water-drinking contest!";
		}

		return response;
	}
	
	/*
	 * The following private method is a variation of the above getRandomResponse() method.
	 * I decided to be funny and take on the subject of dank memes.
	 */
	private String randomDankMemeResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Harambe, may he rest in peace.";
		} else if (whichResponse == 1) {
			response = "I love dank may-mays.";
		} else if (whichResponse == 2) {
			response = "Robert?";
		} else if (whichResponse == 3) {
			response = "360 no scope.";
		} else if (whichResponse == 4) {
			response = "Hahahahahahaahahahahahahahahahahahahahahahahahaahhahha";
		} else if (whichResponse == 5) {
			response = "422";
		}

		return response;
	}
}
