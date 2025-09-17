package com.mycompany.switchcase;
//Import
import java.util.Scanner;
/**
 *
 * @author d3
 */
public class SwitchCase {

    public static void main(String[] args) {
   //Criação do scanner
         Scanner scanner=new Scanner(System.in);
        //Variáveis
         System.out.println("Digite um valor de 1 a 4 para escoher sua passagem:\n 1-ônibus\n 2-Metrô\n 3-Intermunicipal\n 4-Rodoviário");
         int passagem=scanner.nextInt();
         System.out.println("Certo, quantos bilhetes você quer comprar?");
         int compra=scanner.nextInt();
         
        //Código a executar (Passagem)
         switch(passagem){
                case 1://Se for 1
             double compra1=compra*4.40;
             System.out.print("Total da compra:\n"+compra1+"\n");
         break;
             case 2://Se for 2
             int compra2=compra*5;
             System.out.print("Total da compra:\n"+compra2+"\n");
         break;
              case 3://Se for 3
              double compra3=compra*6.5;
              System.out.print("Total da compra:\n"+compra3+"\n");
         break;//Se for qualquer outro
              case 4://Se for 4
              int compra4=compra*12;
              System.out.print("Total da compra:\n"+compra4+"\n");
         break;//Se for qualquer outro
              default: System.out.print("Fruta inválida\n");
         break;
         }
           //Variáveis
         int saldo=1000;
         System.out.println("Digite o que deseja fazer:\n 1-Consultar saldo\n 2-Sacar dinheiro\n 3-Depositar dinheiro\n 4-Encerrar atendimento");
         int escolha=scanner.nextInt();
       
         
        //Código a executar (Saldo)
         switch(escolha){
                case 1://Se for 1
             System.out.print("Seu saldo é:\n"+saldo);
         break;
             case 2:
           //Se for 2
                 System.out.println("Certo, quantos reais você quer sacar?");
                 int saque=scanner.nextInt();
                 if (saque>1000) {
                     System.out.println("Erro\nValor acima do saldo disponível");
                 }else {
                 double novosaldosaque=saldo-saque;
                 System.out.println("Seu novo saldo é\n"+novosaldosaque+" reais");
                 }
         break;
              case 3:
          //Se for 3
              System.out.println("Certo, quantos reais você quer depositar?");
              int deposito=scanner.nextInt();
              double novosaldodeposito=deposito+saldo;
              System.out.println("Seu novo saldo é de\n"+novosaldodeposito+ " reais");
         break;
              case 4:
          //Se for 4
              System.out.print("Seu saldo agora é de:\n"+saldo+" reais");
         break;
          //Se for qualquer outro
              default: System.out.print("Escolha inválida\n");
         break;
         }
         
          //Variáveis
         System.out.println("\nDigite a sua idade: ");
         int idade=scanner.nextInt();
         
        //Código a executar
         switch (idade){
             case 1:
                 if (idade<0){
        System.out.print("Idade inválida");
        }
         break;
             case 2:
             if(idade>=0 && idade<=12){
         System.out.print("Você tem "+idade+", logo é considerada uma criança");
         }
         break;
              case 3:
              if(idade>=13 && idade <=17){
         System.out.print("Você tem "+idade+", logo é considerada um adolescente");
         }
         break;
              case 4:
              if(idade>=18 && idade <=59){
         System.out.print("Você tem "+idade+", logo é considerada um adulto");
         }  
         break;
              case 5:
         if(idade>60){
         System.out.print("Você tem "+idade+", logo é considerada um idoso");
         }  
              break;
              default: System.out.print("Erro");
       }
    }
}