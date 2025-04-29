import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiceGameArena arena = new DiceGameArena(5); // 5 rounds

        System.out.println("🎮 Welcome to the Virtual Dice Game Arena!");
        System.out.print("Enter number of players (2-4): ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name for Player " + i + ": ");
            String name = sc.nextLine();
            arena.addPlayer(name);
        }

        arena.startGame();
    }
}
