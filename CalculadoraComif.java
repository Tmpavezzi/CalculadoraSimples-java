import java.util.*;



class Main {
  public static void main(String[] args) {
  double a, b;
    String operacaoStr;
    char operacao;
    Scanner entrada = new Scanner (System.in);

    System.out.println( "<AdiÃ§ao>");
     System.out.println("<S>ubtraÃ§Ã£o");
     System.out.println("<MultiplixaÃ§Ã£o>");
     System.out.println("<DivisÃ£o");
     System.out.println("Escolha a operaÃ§Ã£o");

    operacaoStr = entrada .next();
    operacao = operacaoStr.charAt(0);
     System.out.println("1o operando: ");
    a = entrada.nextDouble();
     System.out.println ("2o operando : ");
    b = entrada .nextDouble();

    if (operacao =='a' || operacao == 'A') {
      System.out.println("Soma " + (a + b));
    } else if (operacao == 's'|| operacao == 'S'){
      System.out.println ("DifrenÃ§a " + (a- b));
    } else if ( operacao == 'm' || operacao == 'M'){
       System.out.println ("Produto " +(a*b));
    } else if (operacao == 'd'|| operacao =='D'){
      System.out.println("Quociente :"+(a/b));
    } else {
      System.out.println ("A operaÃ§Ã£o "+ operacao +" nÃ£o Ã© valido");
      }
      
     
    
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /** Scanner scanner = new Scanner(System.in);
    int n1,n2;
    System.out.println ("Primeiro numero  ");
    n1 = scanner.nextInt();
    System.out.println ("Segundo numero");
    n2 = scanner.nextInt();
    int Soma = (n1 * n2) +(n2 * n1);
    System.out.println ("Resultado da conta " + Soma); */
    
    
  }
}
