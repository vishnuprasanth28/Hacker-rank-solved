package com.chainsys.practice;

public class Winners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int score1 = 1500;
			int score2 =900;
			int score3 = 400;
			int score4 = 50;
			if(score1>0 && score2>0 && score3>0 &&score4>0)  {
			displayHighScore("vishnu",calculateHighScore(score1));
			displayHighScore("kumar",calculateHighScore(score2));
			displayHighScore("siva",calculateHighScore(score3));
			displayHighScore("sundar",calculateHighScore(score4));
			}else 
			{ System.out.println("please enter valid score");
			}
	}
	public static void displayHighScore(String playerName, int position) {
		System.out.println(playerName + " managed to get "+position+" position");
	}
	public static int calculateHighScore(int score) {
		
		if (score >= 1000) {
			return 1;
		}
		else if (score>=500 && score<1000) {
			return 2;
		}
		else if (score>=100 && score<500) {
			return 3;
			
		}else {
			return 4;
		}
		
	}
	}

