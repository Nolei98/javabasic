/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package basic.resolucaodetela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author ADMIN
 */
public class ResolucaoDeTela {

    public static void main(String[] args) {
         Toolkit toolkit = Toolkit.getDefaultToolkit();
         Dimension screenSize = toolkit.getScreenSize();
         
         int largura = screenSize.width;
         int altura = screenSize.height;
         
         System.out.println("Resolução da tela: " + largura + "x" + altura);
    }
}
