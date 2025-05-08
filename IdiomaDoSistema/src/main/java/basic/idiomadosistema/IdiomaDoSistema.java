/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package basic.idiomadosistema;

import java.util.Locale;

/**
 *
 * @author ADMIN
 */
public class IdiomaDoSistema {

    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        System.out.println("Idioma do sistema: " + local.getLanguage());
        System.out.println("País: " + local.getCountry());
        System.out.println("Nome do idioma: " + local.getDisplayLanguage());
        System.out.println("Nome do país: " + local.getDisplayCountry());
    }
}
