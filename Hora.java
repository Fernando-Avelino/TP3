/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp03;

/*Construir a classe Hora, conforme especificação abaixo, este exercício comporá a avaliação final, portanto será obrigatória sua elaboração para a prova final.

Hora
- hora: int
- min: int
- seg: int
+ Hora()
+ Hora(int h, int m, int s)
+ setHor(int h)
+ setMin(int m)
+ setSeg(int s)
+ setHor()
+ setMin()
+ setSeg()
+ getHor(): int
+ getMin(): int
+ getSeg(): int
+ getHora1(): String
+ getHora2(): String
+ getSegundos(): int

Fernando Avelino da Silva CB3008053
Vinícius Lopes Nunes      CB1640879
*/

import static java.lang.System.out;
import java.util.Scanner;

public final class Hora {
    private static int hora, min, seg;
    private Scanner scan = new Scanner(System.in);
    
    public Hora(){
        int h, m, s;
        
        try{
            do {
                out.print("Informe a hora: ");
                h = scan.nextInt();
            } while (h < 0 || h > 23);
            
            do {
                out.print("Informe os minutos: ");
                m = scan.nextInt();
            } while (h < 0 || h > 59);
            
            do {
                out.print("Informe os segundos: ");
                s = scan.nextInt();
            } while (h < 0 || h > 59);
            
            new Hora(h, m, s);
        }
        catch(Exception e){
            out.println("Erro\n" + e.getMessage());
        }
    }
    
    public Hora(int h, int m, int s){
        setHora(h);
        setMin(m);
        setSeg(s);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int h) {
        hora = h;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int m) {
        min = m;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int s) {
        seg = s;
    }
    
    public String getHora1(){
        String ret = getHora() + ":" + getMin() + ":" + getSeg();
        
        return ret;
    }
    
    public String getHora2(){
        String ret;
        
        if (getHora() < 12 && getHora() > 0)
            ret = getHora1() + " AM";
        else{
            if(getHora() == 0)
                ret = ("12:" + getMin() + ":" + getSeg() + " AM");
            else{
                 if(getHora() == 12)
                     ret = ("12:" + getMin() + ":" + getSeg() + " PM");
                 else
                     ret = ((getHora() - 12)  + ":" + getMin() + ":" + getSeg() + " PM");
            }                
        }
        
        return ret;
    }
    
    public int getSegundos(){
        int ret;
        
        ret = getHora() * 60 * 60 + getMin() * 60 + getSeg();
        
        return ret;
    }    
}
