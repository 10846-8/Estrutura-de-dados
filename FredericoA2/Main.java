package FredericoA2;

import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(final String[] args) {
        final Node rootNode = RpgTree.buildRPGTree();
        playGame(rootNode);
    }
    
    public static void playGame(final Node currentNode) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println(currentNode.getValue());
        if (currentNode.getChildren().isEmpty()) {
            System.out.println("Fim de jogo :)");
            return;
        }
        System.out.println("Escolha sua ação:");
        final List<Node> children = (List<Node>)currentNode.getChildren();
        final int choice = scanner.nextInt();
        if (choice >= 1 && choice <= children.size()) {
            final Node nextNode = children.get(choice - 1);
            playGame(nextNode);
        }
        else {
            System.out.println("Opção invalida.");
            playGame(currentNode);
        }
    }
}