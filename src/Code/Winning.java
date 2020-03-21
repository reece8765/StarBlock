/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author reece
 */
public class Winning {

    private double winnings = 0.00;

    public double checkForWin(int[] reels, double bet) {
        winnings = 0.00;
        switch (reels[0]) {
            case 1:
                switch (reels[1]) {
                    case 1:
                        switch (reels[2]) {
                            case 1:
                                switch (reels[3]) {
                                    case 1:
                                        switch (reels[4]) {
                                            case 1:
                                                winnings += bet * 25000;
                                                break;
                                        }
                                        winnings += bet * 2000;
                                        break;
                                }
                                winnings += bet * 25;
                                break;
                            case 2:
                                winnings += bet * 2;
                                break;
                            case 7:
                                winnings += bet * 2;
                                break;
                        }
                        break;
                }
            case 2:
                switch (reels[1]) {
                    case 2:
                        //2 in a row
                        switch (reels[2]) {
                            case 1:
                            //Award is the same as case 3, no need to write code here or break.
                            case 3:
                                //Close match, award something...
                                winnings += bet * 0.25;
                                break;
                            case 2:
                                //See if there's a bigger win before awarding the win so far
                                switch (reels[3]) {
                                    case 2:
                                        //Check to see if a full row is won before awarding the win
                                        switch (reels[4]) {
                                            case 2:
                                                //Full row (win)
                                                winnings = bet * 10;
                                                break;
                                        }
                                        //4 in a row (win)
                                        winnings += bet * 2;
                                        break;
                                }
                                //3 in a row (win)
                                winnings += bet * 0.5;
                                break;
                        }
                        break;
                }
                break;
            case 3:
                switch (reels[1]) {
                    case 3:
                        //2 in a row
                        switch (reels[2]) {
                            case 2:
                            //Award is the same as case 3, no need to write code here or break.
                            case 4:
                                //Close match, award something...
                                winnings += bet * 0.1;
                                break;
                            case 3:
                                //See if there's a bigger win before awarding the win so far
                                switch (reels[3]) {
                                    case 3:
                                        //Check to see if a full row is won before awarding the win
                                        switch (reels[4]) {
                                            case 3:
                                                //Full row (win)
                                                winnings = bet * 5;
                                                break;
                                        }
                                        //4 in a row (win)
                                        winnings += bet * 3;
                                        break;
                                }
                                //3 in a row (win)
                                winnings += bet * 0.5;
                                break;
                        }
                        break;
                }
                break;
            case 5:
                switch (reels[1]) {
                    case 5:
                        //2 in a row
                        switch (reels[2]) {
                            case 4:
                            //Award is the same as case 3, no need to write code here or break.
                            case 6:
                                //Close match, award something...
                                winnings += bet * 0.1;
                                break;
                            case 5:
                                //See if there's a bigger win before awarding the win so far
                                switch (reels[3]) {
                                    case 5:
                                        //Check to see if a full row is won before awarding the win
                                        switch (reels[4]) {
                                            case 5:
                                                //Full row (win)
                                                winnings = bet * 4;
                                                break;
                                        }
                                        //4 in a row (win)
                                        winnings += bet;
                                        break;
                                }
                                //3 in a row (win)
                                winnings += bet * 0.2;
                                break;
                        }
                        break;
                }
                break;
            case 6:
                switch (reels[1]) {
                    case 6:
                        //2 in a row
                        switch (reels[2]) {
                            case 5:
                            //Award is the same as case 3, no need to write code here or break.
                            case 7:
                                //Close match, award something...
                                winnings += bet * 2;
                                break;
                            case 6:
                                //See if there's a bigger win before awarding the win so far
                                switch (reels[3]) {
                                    case 6:
                                        //Check to see if a full row is won before awarding the win
                                        switch (reels[4]) {
                                            case 6:
                                                //Full row (win)
                                                winnings = bet * 12;
                                                break;
                                        }
                                        //4 in a row (win)
                                        winnings += bet * 6;
                                        break;
                                }
                                //3 in a row (win)
                                winnings += bet * 4;
                                break;
                        }
                        break;
                }
                break;
            case 7:
                switch (reels[1]) {
                    case 7:
                        //2 in a row
                        switch (reels[2]) {
                            case 6:
                            //Award is the same as case 3, no need to write code here or break.
                            case 1:
                                //Close match, award something...
                                winnings += bet * 0.50;
                                break;
                            case 7:
                                //See if there's a bigger win before awarding the win so far
                                switch (reels[3]) {
                                    case 7:
                                        //Check to see if a full row is won before awarding the win
                                        switch (reels[4]) {
                                            case 7:
                                                //Full row (win)
                                                winnings = bet * 5;
                                                break;
                                        }
                                        //4 in a row (win)
                                        winnings += bet * 2;
                                        break;
                                }
                                //3 in a row (win)
                                winnings += bet;
                                break;
                        }
                        break;
                }
                break;
        }
        return winnings;
    }
}
