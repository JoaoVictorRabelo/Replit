//Contagem

import com.sin.xml.internal.ws.api.model.wsdl.WSDLOOutput;

import java.utill.Scanner;

public class Contagem{
  Scanner prompt = new Scanner (System.out.in);
  int n, nota , cont = 0, i = 0;
  public void Contagem () {
    System.out.println("Quantidade de alunos");
    int n = prompt.nextInt();

    while (i< n){
      i = i + 1;
      System.out.println ("nota do Aluno:" + i);
      nota= prompt.NextInt();
      if (nota < 50){
        cont = cont + 0;
        }else{
        cont = cont + 1;
        }
      
      }
    System.out.println("São" + "n" + "Aluno");
    System.out.println("São" + "cont" + "Aprovados");
    }
  }
}
