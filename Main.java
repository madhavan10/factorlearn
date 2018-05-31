public class Main {
	public static void main(String[] args) {
		Problem nextProblem = new ReduceToLowestTerms(72, 60);
                while(!(nextProblem instanceof CorrectState)) {
                    nextProblem = nextProblem.execute();
                }

                System.out.println("You have correctly solved the problem.");
	}
}
