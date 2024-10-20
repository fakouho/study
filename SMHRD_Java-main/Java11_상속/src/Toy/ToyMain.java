package Toy;

public class ToyMain {

	public static void main(String[] args) {

		RandomToyMachine rtm = new RandomToyMachine();

		Ball Ball = new Ball();
		rtm.addToy(Ball);
		rtm.addToy(new Train());
		rtm.addToy(new Gun());

		rtm.getToy().play();

	}

}
