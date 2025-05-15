/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author ADMIN
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //while - laço de repetição com condição inicial
        //continue -> retorna pro eqnuanto(while) quando chega lá
        //break -> joga pra fora do laço
        int cc = 0;
        while (cc<10){
            cc++;
            if (cc==2 || cc==3 || cc==4){
                continue;
            }
            if (cc==7){
                break;
            }
            System.out.println("Cambalhota "+ cc);
        }
    }
    
}
