package Game;

import java.util.Scanner;

public class Main {
	public static boolean p1turn=true;
	public static boolean p2turn=false;
	public static boolean p1won=false;
	public static boolean p2won=false;
	
	public static String again;
	
	public static tictactoe board=new tictactoe();

	public static Scanner in=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(board.isVisible()==false)
			board.setVisible(true);
		

	}
	public static void isWon() {
		if(board.button1.getText().equals("1")) {
			if(board.button2.getText().equals("1")){
				if(board.button3.getText().equals("1")) {
					p1won=true;
					p2won=false;
					System.out.println("P1 Won!");
				}
			}
		}
		if(board.button4.getText().equals("1")) {
			if(board.button5.getText().equals("1")){
				if(board.button6.getText().equals("1")) {
					p1won=true;
					p2won=false;
					System.out.println("P1 Won!");
				}
			}
		}
		if(board.button7.getText().equals("1")) {
			if(board.button8.getText().equals("1")){
				if(board.button9.getText().equals("1")) {
					p1won=true;
					p2won=false;
					System.out.println("P1 Won!");
				}
			}
		}
		if(board.button1.getText().equals("1")) {
			if(board.button4.getText().equals("1")){
				if(board.button7.getText().equals("1")) {
					p1won=true;
					p2won=false;
					System.out.println("P1 Won!");
				}
			}
		}
		if(board.button2.getText().equals("1")) {
			if(board.button5.getText().equals("1")){
				if(board.button8.getText().equals("1")) {
					p1won=true;
					p2won=false;
					System.out.println("P1 Won!");
				}
			}
		}
		if(board.button3.getText().equals("1")) {
			if(board.button6.getText().equals("1")){
				if(board.button9.getText().equals("1")) {
					p1won=true;
					p2won=false;
					System.out.println("P1 Won!");
				}
			}
		}
		if(board.button1.getText().equals("1")) {
			if(board.button5.getText().equals("1")){
				if(board.button9.getText().equals("1")) {
					p1won=true;
					p2won=false;
					System.out.println("P1 Won!");
				}
			}
		}
		if(board.button3.getText().equals("1")) {
			if(board.button5.getText().equals("1")){
				if(board.button7.getText().equals("1")) {
					p1won=true;
					p2won=false;
					System.out.println("P1 Won!");
				}
			}
		}
		
		
		if(board.button1.getText().equals("0")) {
			if(board.button2.getText().equals("0")){
				if(board.button3.getText().equals("0")) {
					p1won=false;
					p2won=true;
					System.out.println("P2 Won!");
				}
			}
		}
		if(board.button4.getText().equals("0")) {
			if(board.button5.getText().equals("0")){
				if(board.button6.getText().equals("0")) {
					p1won=false;
					p2won=true;
					System.out.println("P2 Won!");
				}
			}
		}
		if(board.button7.getText().equals("0")) {
			if(board.button8.getText().equals("0")){
				if(board.button9.getText().equals("0")) {
					p1won=false;
					p2won=true;
					System.out.println("P2 Won!");
				}
			}
		}
		if(board.button1.getText().equals("0")) {
			if(board.button4.getText().equals("0")){
				if(board.button7.getText().equals("0")) {
					p1won=false;
					p2won=true;
					System.out.println("P2 Won!");
				}
			}
		}
		if(board.button2.getText().equals("0")) {
			if(board.button5.getText().equals("0")){
				if(board.button8.getText().equals("0")) {
					p1won=false;
					p2won=true;
					System.out.println("P2 Won!");
				}
			}
		}
		if(board.button3.getText().equals("0")) {
			if(board.button6.getText().equals("0")){
				if(board.button9.getText().equals("0")) {
					p1won=false;
					p2won=true;
					System.out.println("P2 Won!");
				}
			}
		}
		if(board.button1.getText().equals("0")) {
			if(board.button5.getText().equals("0")){
				if(board.button9.getText().equals("0")) {
					p1won=false;
					p2won=true;
					System.out.println("P2 Won!");
				}
			}
		}
		if(board.button3.getText().equals("0")) {
			if(board.button5.getText().equals("0")){
				if(board.button7.getText().equals("0")) {
					p1won=false;
					p2won=true;
					System.out.println("P2 Won!");
				}
			}
		}
		if(p1won==true||p2won==true)
			board.setVisible(false);
		if()
	}

}
