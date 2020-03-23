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
    boolean row1_4 = false;
    boolean row2_4 = false;
    boolean row3_4 = false;
    boolean row1_5 = false;
    boolean row2_5 = false;
    boolean row3_5 = false;

    public double checkForWin(int[][] reels, double bet) {
        row1_4 = false;
        row2_4 = false;
        row3_4 = false;
        row1_5 = false;
        row2_5 = false;
        row3_5 = false;
        winnings = 0.00;
        //Check all row 1
        if (reels[0][0] == reels[1][0] && reels[1][0] == reels[2][0] && reels[2][0] == reels[3][0] && reels[3][0] == reels[4][0]) {
            winnings += getWin(reels[0][0], 5, bet, 1);
            row1_5 = true;
        }
        if (reels[0][0] == reels[1][0] && reels[1][0] == reels[2][0] && reels[2][0] == reels[3][0] && !row1_5) {
            winnings += getWin(reels[0][0], 4, bet, 1);
            row1_4 = true;
        }
        if (reels[0][0] == reels[1][0] && reels[1][0] == reels[2][0] && !row1_5 && !row1_4) {
            winnings += getWin(reels[0][0], 3, bet, 1);
        }
        //Check all row 2
        if (reels[0][1] == reels[1][1] && reels[1][1] == reels[2][1] && reels[2][1] == reels[3][1] && reels[3][1] == reels[4][1]) {
            winnings += getWin(reels[0][1], 5, bet, 2);
            row2_5 = true;
        }
        if (reels[0][1] == reels[1][1] && reels[1][1] == reels[2][1] && reels[2][1] == reels[3][1] && !row1_5) {
            winnings += getWin(reels[0][1], 4, bet, 2);
            row2_4 = true;
        }
        if (reels[0][1] == reels[1][1] && reels[1][1] == reels[2][1] && !row1_5 && !row1_4) {
            winnings += getWin(reels[0][1], 3, bet, 2);
        }
        //Check all row 3
        if (reels[0][2] == reels[1][2] && reels[1][2] == reels[2][2] && reels[2][2] == reels[3][2] && reels[3][2] == reels[4][2]) {
            winnings += getWin(reels[0][2], 5, bet, 3);
            row1_5 = true;
        }
        if (reels[0][2] == reels[1][2] && reels[1][2] == reels[2][2] && reels[2][2] == reels[3][2] && !row1_5) {
            winnings += getWin(reels[0][2], 4, bet, 3);
            row1_4 = true;
        }
        if (reels[0][2] == reels[1][2] && reels[1][2] == reels[2][2] && !row1_5 && !row1_4) {
            winnings += getWin(reels[0][2], 3, bet, 3);
        }
        System.out.println("User won? " + (winnings > 0.0));
        return winnings;
    }

    //Return wins based on what was won and how many rows matched and what the bet was.
    private double getWin(int target, int match, double bet, int line) {
        double award = 0.00;
        switch (target) {
            case 1:
                switch (match) {
                    case 3: //Bonus win
                        break;
                    case 4: //Super bonus win
                        break;
                    case 5: //Mega bonus win
                        break;
                }
                break;
            case 2:
                switch (match) {
                    case 3:
                        award += bet * 250;
                        break;
                    case 4:
                        award += bet * 2500;
                        break;
                    case 5:
                        award += bet * 25000;
                        break;
                }
                break;
            case 3:
                switch (match) {
                    case 3:
                        award += bet * 15;
                        break;
                    case 4:
                        award += bet * 25;
                        break;
                    case 5:
                        award += bet * 250;
                        break;
                }
                break;
            case 4:
                switch (match) {
                    case 3:
                        award += bet * 0.4;
                        break;
                    case 4:
                        award += bet;
                        break;
                    case 5:
                        award += bet * 5;
                        break;
                }
                break;
            case 5:
                switch (match) {
                    case 3:
                        award += bet * 0.5;
                        break;
                    case 4:
                        award += bet * 1.2;
                    case 5:
                        award += bet * 8;
                        break;
                }
                break;
            case 6:
                switch (match) {
                    case 3:
                        award += bet;
                        break;
                    case 4:
                        award += bet * 5;
                        break;
                    case 5:
                        award *= 20;
                        break;
                }
                break;
            case 7:
                switch (match) {
                    case 3:
                        award += bet * 0.7;
                        break;
                    case 4:
                        award += bet * 10;
                        break;
                    case 5:
                        award += bet * 28;
                        break;
                }
                break;
        }
        System.out.println("User won: " + award + " on line " + line);
        return award;
    }
}
