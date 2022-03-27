import java.util.*;  
Botão

class Main {
  public static void main(String[] args) {
  double a, b;
    String operacaoStr;
    char operacao;
    Scanner entrada = new Scanner (System.in);

    System.out.println( "<Adição>");
     System.out.println("<Subtração>");
     System.out.println("<MultiplixaÃ§Ã£o>");
     System.out.println("<Divisão>");
     System.out.println("Escolha a operaÃ§Ã£o");

    operacaoStr = entrada .next();
    operacao = operacaoStr.charAt(0);
     System.out.println("1o operando: ");
    a = entrada.nextDouble();
     System.out.println ("2o operando : ");
    b = entrada .nextDouble();

    switch(operacao){
    case '+': 
        System.out.println("Soma =" + (a+b));
        break;
    case '-': 
        System.out.println("Subtração =" + (a-b));
        break;
      case '*' : 
        System.out.println("Multiplicação = " + (a*b));
        break;
      case '/': 
        System.out.println("Divisão =" + (a/b) );
        break;
        default: 
        System.out.println ("Operação inválida");
      }

  }
   
  }
