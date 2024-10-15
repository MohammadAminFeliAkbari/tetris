import java.util.Scanner;

public class for_Main_Meno {
    public for_Main_Meno()
    {
        System.out.print("""
                1- new game
                2- exit
                """);

        Board board = new Board();
        Scanner input = new Scanner(System.in);

        boolean flag = true;
        int number = input.nextInt();
        switch (number) {
            case 1:
                boolean counter = true;
                while (counter) {
                    board.arried_line_14();
                    String n = input.next();
                    board.full_line();
                    if (n.charAt(0) == 'f')
                        board.right();
                    else if (n.charAt(0) == 's')
                        board.left();
                    else if (n.charAt(0) == 'r')
                        board.rotate_180();
                    else if (n.charAt(0) == 'd')
                        board.down();
                    else if (n.charAt(0) == 'e')
                        flag = false;
                    else if (n == "exit") {
                        counter = false;
//                        System.out.println(board.score());
                        System.out.println("bye!!");
                        counter = false;
                    } else board.print_game_0_1();

                    board.arried_line_14();
                    System.out.println("----------------------------------------");
                    board.print_game_0_1();
//            board.game_original();
                }
                break;
            case 2:
                break;
            case 3:
                number = input.nextInt();
        }
    }
}
