import java.util.Scanner;

public class Main_meno {
    Board board = new Board();
    Scanner input = new Scanner(System.in);

    public void play_game() {
        System.out.println("""
                hello!!
                welcome to tetris game

                guide game :
                ( [r] or [R] = rotate 180)
                ( [e] or [E] = rotate 90 )
                ( [f] or [F] = right     )
                ( [d] or [D] = down      )
                ( [s] or [s] = left      )

                do you want to play?? ( Y or N )

                """);

        String game_option = input.next();
        if (game_option.charAt(0) == 'n' || game_option.charAt(0) == 'N')
            System.exit(0);

        board.for_game_main_meno();

        boolean game_over = true;
        while (game_over) {
            int number = 2;
            if (board.getScore_game() < 0) {

                System.out.println("""
                        you lost
                                                
                        are you play again??
                        1-new game
                        2-exit
                        """);
                try {
                    number = input.nextInt();
                } catch (Exception err) {
                    number = 1;
                }
            }

            switch (number) {
                case 1:
                    Board board1 = new Board();
                    board1.for_game_main_meno();
                    break;
                case 2:
                    game_over = false;
            }
        }
    }
}