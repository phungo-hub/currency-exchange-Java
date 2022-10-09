import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập usd");
        int usd = input.nextInt();
        System.out.println(usd + " usd tương đương với:");
        int vnd = usd * rate;
        System.out.println(vnd + " vnd");
    }
}