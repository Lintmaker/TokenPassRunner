public class TokenPass
{
    private int [] Board;
    private int currentPlayer;
public TokenPass(int playercount)
{
    double y = (Math.random()* 10 +1);
    this.Board = new int [playercount];
    for (int x = 0; x<this.Board.length; x++)
    {
        this.Board[x] = (int) y;
    }
    this.currentPlayer = (int) y;
}
public void nextPlayer()
{
    this.currentPlayer  = (this.currentPlayer + 1) % Board.length;
}

public void distributeCurrentPlayerTokens()
{
   int nextPlayer = currentPlayer;
   int numToDistribute = Board[currentPlayer];
   Board[currentPlayer] = 0;

   while(numToDistribute > 0)
   {
       nextPlayer = (nextPlayer +1) % Board.length;
       Board[nextPlayer] ++;
       numToDistribute --;
   }
}

public void printBoard()
{
    for(int x = 0; )
}
}
