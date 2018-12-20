public class TokenRunner
{
    public static void main(String [] args)
    {
        TokenPass game1 = new TokenPass(6);

        //Repeats until one player has 0 token.
        // gameOver returns the number of the winning player.
        while(game1.gameOver() < 0)
        {
            game1.printBoard();
            game1.distributeCurrentPlayerTokens();
            game1.nextPlayer();

        }
        game1.printBoard();
        System.out.println("Game Winner: Player" + game1.gameOver);
    }
}
