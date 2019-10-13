package raise_second.week;

public class Main {
	public static void main(String[] args) {

		Communication communication = new WorkplaceCommunication("Hello", true);
		//上記最初のCommunicationは、戻り値型(return)としている為
		Communication coWorker = new WorkplaceCommunication("Hi", true);
		Communication boss = new WorkplaceCommunication("Hello, BOSS!", false);

		System.out.println(communication.greet());
		System.out.println(coWorker.greet());
		boss.greet();

		}

}
