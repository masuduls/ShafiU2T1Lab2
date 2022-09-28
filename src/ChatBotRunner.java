public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 10);

        debbie.greeting("Masudul");
        debbie.favoriteNumber(15);
        debbie.weather();

        double meters = debbie.convertFeetToMeters(20);
        System.out.println("There are " + meters + " in 20 feet");

        int sum = debbie.addNumbers(13, 16, 24);
        System.out.println("The sum is " + sum);

        String message = debbie.goodbye();
        System.out.println(message);
    }
}
