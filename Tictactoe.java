/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoe;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Tictactoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,a,b;
        String win;
        
        win=null;
        int counter=0;
        String []A=new String[9];
        for(i=0;i<8;i++){
            A[i]=null;
        }
        System.out.println("first player you have 'X'");
            System.out.println("second player you have 'O'");
        do{
         counter=counter+1;
            System.out.println("first player its your turn");
             Scanner in=new Scanner(System.in);
             a=in.nextInt(); 
            
             A[a]="X";
          
        for (a = 0; a < 8; a++) {
	 String line = null;
	 switch (a) {
	 case 0:
		line = A[0] +A[1] + A[2];
		break;
		case 1:
		line = A[3] +A [4] + A[5];
		break;
		case 2:
		line = A[6]+A[7]+A[8];
		break;
		case 3:
		line = A[0]+A[3]+A[6];
		break;
		case 4:
		line = A[1] + A[4] + A[7];
		break;
		case 5:
		line = A[2] + A[5] + A[8];
		break;
		case 6:
		line = A[0] + A[4] + A[8];
		break;
		case 7:
		line = A[2] + A[4] + A[6];
		break;}
                if (line.equals("XXX")) {
				System.out.println("the winners is first player");
                                win="first player";
			} else if (line.equals("OOO")) {
				System.out.println("the winners is second player");
                                win="second player";
			}
                        else if(counter==9){
                            System.out.println("its draw");
                            win="draw";}
                             break;}
        
        
        if(win==null){
           System.out.println("second player its your turn");
             b=in.nextInt(); 
           A[b]="O";
           counter=counter+1;  
           
	  for (a = 0; a < 8; a++) {
	 String line = null;
	 switch (a) {
	 case 0:
		line = A[0] +A[1] + A[2];
		break;
		case 1:
		line = A[3] +A [4] + A[5];
		break;
		case 2:
		line = A[6]+A[7]+A[8];
		break;
		case 3:
		line = A[0]+A[3]+A[6];
		break;
		case 4:
		line = A[1] + A[4] + A[7];
		break;
		case 5:
		line = A[2] + A[5] + A[8];
		break;
		case 6:
		line = A[0] + A[4] + A[8]; 
		break;
		case 7:
		line = A[2] + A[4] + A[6];
		break;}
                if (line.equals("XXX")) {
				System.out.println("the winners is first player");
                                win="first player";
			} else if (line.equals("OOO")) {
				System.out.println("the winners is second player");
                                win="second player";
			}
                        
                            
                        
        }
        }else{}
            }while(win==null);
    }
        
        
    
    
   
		}
         
    
    

