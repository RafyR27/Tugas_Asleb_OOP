package tugas3_no1_asleb_muhamad.rafy.ramadhan;

import interfaces.MatematikaInterface;

public class Matematika implements MatematikaInterface {
    
    @Override
    public void pertambahan(int a, int b){
        System.out.println("Pertambahan\t\t: " + a + "+" + b + " = " + (a+b));
    }
    
    @Override
    public void pengurangan(int a, int b){
        System.out.println("Pengurangan\t\t: " + a + "-" + b + " = " + (a-b));
    }
    
    @Override
    public void perkalian(int a, int b){
        System.out.println("Perkalian\t\t: " + a + "*" + b + " = " + a*b);
    }
    
    @Override
    public void pembagian(int a, int b){
        System.out.println("Pembagian\t\t: " + a + "/" + b + " = " + a/b);
    }
}
