/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

/**
 *
 * @author Eudy
 */
public class operaciones {
    private int valor1,valor2;
    private float pi = 3.14f;
    
    public void setValor1(int v){
        this.valor1 = v;
    }
    public int getValor1(){
        return this.valor1;
    }
    public operaciones(){
        this.valor1 =45;
        this.valor2 =67;
    }
    public operaciones(int v1,int v2){
        this.valor1 = v1;
        this.valor2 = v2;
    }
    
    public void resta(){
        System.out.println((this.valor1-this.valor2));
    }
    public void suma(){
        System.out.println((this.valor1+this.valor2));
    }
    public void suma(int v,int v1){
        System.out.println((this.valor1+this.valor2));
    }
    public void suma(double v,int v1){
        System.out.println((this.valor1+this.valor2));
    }
     public void suma(int v,double v1){
        System.out.println((this.valor1+this.valor2));
    }
    public void suma(double v,double v1){
        System.out.println((v+v1));
    }
    
    public void asignarValor(int v,int v1){
        this.valor1 = v;
        this.valor2 = v1;
    }
}