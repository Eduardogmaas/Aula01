import java.util.Scanner;

public class Ex2{
    public static void main(String[] args) {
        double primeiraNota;
        double segundaNota;
        double mediaAritmetica;
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Informe a primeira nota");
        primeiraNota = sc.nextDouble();
        System.out.println("Informe a segunda nota");
        segundaNota = sc.nextDouble();
        sc.close();

        //Processamento
        mediaAritmetica = (primeiraNota + segundaNota) /2;

        if (mediaAritmetica >= 7.0){
            System.out.println("Aprovado com média de: " + mediaAritmetica );   //Saída
        }   if ((mediaAritmetica < 7.0) && (mediaAritmetica >= 4.0)){
                System.out.println("Exame com média de: " + mediaAritmetica); //Saída
            }   if (mediaAritmetica < 4.0){
                    System.out.println("Reprovado com média de: " + mediaAritmetica);
                }


                // if (mediaAritmetica >= 7.0){
                //     System.out.println("Aprovado com média de: " + mediaAritmetica );   //Saída
                // } else if (mediaAritmetica > 4.0){
                //            System.out.println("Reprovado com média de: " + mediaAritmetica);
                //        } else {
                //             System.out.println("Exame com média de: " + mediaAritmetica);
                //          } 
        

    }
}