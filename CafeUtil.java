import java.util.ArrayList;
public class CafeUtil {

    public int getStreakGoal() {
        int counter = 0;
        for (int i = 1; i <= 10 ; i++) {
            counter++;
        }
        return counter;
    }

    public double getOrderTotal(double[] prices) {
        double totalPrice = 0;
        for (double i : prices) {
            totalPrice += i;
        }
        return totalPrice;
    }

    public void displayMenu(ArrayList<String> menu) {
        for (String i: menu) {
            System.out.println(i);
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName);
        System.out.printf("There are %d people in front of you", customers.size());
        customers.add(userName);
    }
}