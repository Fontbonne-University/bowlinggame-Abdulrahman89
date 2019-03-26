package BowlingGame;

public class Game {
	
	private int score = 0;
	private int curentRoll = 0;
	private int rolls[] = new int[21];
	public void roll(int pins) {
		// TODO Auto-generated method stub
		rolls[curentRoll++] = pins;
		
		
	}
	
	public int score() {
		// TODO Auto-generated method stub
		int fistInframe=0;
		for(int frame =0; frame< 10; frame++)
		{
			if(rolls[fistInframe] + rolls[fistInframe+1] ==10) //spare
			{
				score += 10 + rolls[fistInframe+2];
				fistInframe += 2;
			}
		
			else {
				//if(rolls[i] + rolls[i+1] == 10)
				score += rolls[fistInframe] + rolls[fistInframe+1];
				fistInframe += 2;
			}
		}
		//return score;
		
	}

}
	
