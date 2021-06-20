package myJavaProject;

import java.util.Scanner;
public class CheckSequence {

	public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
		        int N=s.nextInt();
		        int x=s.nextInt();
		        int y=s.nextInt();
		        int i=2;
		        if(x>y){
		            while(i<N){
		                x=y;
		                y=s.nextInt();
		                i++;
		                if(x>y){
		                    
		                }else{
		                    break;
		                }
		                
		            }
		            while(i<N){
		                x=y;
		                y=s.nextInt();
		                if(x<y){
		                    i++;
		                }else{
		                    break;
		                }
		                
		            }
		        
		            System.out.println(i==N);
		            
		            
		        }else if(x<y){
		        	
		            while(i<N){
		                x=y;
		                y=s.nextInt();
		                if(x<y){
		                    i++;
		                }else{
		                    break;
		                }
		                
		            }
		            System.out.println(i==N);
		        }

		
		

	}

}
