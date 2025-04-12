/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;
 /* }if(f==0 && c==4){
                    System.out.println("la posicion de f es:"+f+"la pocicion de c es:"+c+"el valor es:"+matriz[f][c]);
                }if(f==1 && c==1){
                    System.out.println("la posicion de f es:"+f+"la pocicion de c es:"+c+"el valor es:"+matriz[f][c]);
                }if(f==1 && c==3){  
                    System.out.println("la posicion de f es:"+f+"la pocicion de c es:"+c+"el valor es:"+matriz[f][c]);
                }if(f==2 && c==2){  
                    System.out.println("la posicion de f es:"+f+"la pocicion de c es:"+c+"el valor es:"+matriz[f][c]);
                }if(f==3 && c==1){  
                    System.out.println("la posicion de f es:"+f+"la pocicion de c es:"+c+"el valor es:"+matriz[f][c]);
                }if(f==3 && c==3){  
                    System.out.println("la posicion de f es:"+f+"la pocicion de c es:"+c+"el valor es:"+matriz[f][c]);
                }if(f==4 && c==0){  
                    System.out.println("la posicion de f es:"+f+"la pocicion de c es:"+c+"el valor es:"+matriz[f][c]);
                }if(f==4 && c==4){  
                    System.out.println("la posicion de f es:"+f+"la pocicion de c es:"+c+"el valor es:"+matriz[f][c]); 
                }*/
/**
 *
 * @author LYKAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // matriz llena
    int [][] matriz ={
        {10,20,30,40,50},
        {60,70,80,90,100},
        {120,130,140,150,160},
        {170,180,190,200,210},
        {220,230,240,250,260},
    };
        for (int f = 0; f <matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                if((f==0 && c==0)||(f==0 && c==4)||(f==1 && c==1)||(f==1 && c==3)||(f==2 && c==2)||(f==3 && c==1)||(f==3 && c==3)||(f==4 && c==0)||(f==4 && c==4)){
                    System.out.println("la posicion de f es:"  +f+ "la pocicion de c es:" +c+ "el valor es:" + matriz[f][c]);   
              
                    
            }
            
        }
    }
    }
}
