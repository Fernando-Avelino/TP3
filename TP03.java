/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp03;

/*Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no exercício anterior.

Fernando Avelino da Silva CB3008053
Vinícius Lopes Nunes      CB1640879
*/

import static java.lang.System.out;

public class TP03 {
    public static void main(String[] args) {
        Hora hora = new Hora();
        
        out.println(hora.getHora1());        
        out.println(hora.getHora2());
        out.println(hora.getSegundos() + " Segundos");
    }    
}