package Proyecto;

import javax.swing.*;

public class Quiznov
{
    static int a;
    public  static void main(String[] args)
    {
        while (a!=5)
        {
            menu();
            if (a==1)
            {
                Numeromayor();
            }else if (a==2)
            {
                Numeromenor();
            }
            else if (a==3)
            {
                Raizcuadrada();
            }
            else if (a==4)
            {
                Potencia();
            }
        }
    }


    public static void menu()
    {
        a=Integer.parseInt(JOptionPane.showInputDialog("Digite opcion \n 1.Numero mayor  \n 2.Numero menor \n 3.Raiz cuadrada \n 4.Potencia\n 5.Salir"));
    }
    public static void Numeromayor()
    {
        int b,c;
        b=Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
        if (b>c)
        {
            System.out.println("El numero "+b+" es mayor que "+c);
        }else
        {
            System.out.println("El numero "+c+" es mayor que "+b);
        }
    }
    public static void Numeromenor()
    {
        int b,c;
        b=Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
        if (b<c)
        {
            System.out.println("El numero "+b+" es menor que "+c);
        }else
        {
            System.out.println("El numero "+c+" es menor que "+b);
        }
    }
    public static void Raizcuadrada()
    {
        int b;
        double c;
        b=Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
        c=Math.sqrt(b);
        System.out.println("La raiz cuadrada de "+b+" es "+c);

    }
    public static void Potencia()
    {
        int b;
        int c;
        double d;
        b=Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Digite exponente"));
        d=Math.pow(b,c);
        System.out.println("El resultado de "+b+" a la "+c+" potencia es" +d);
    }
}
