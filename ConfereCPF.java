import java.util.*;

/**
* Classe com método para validação de CPF
*
* Pode ser utilizada livremente e modificada para se integrar à sistemas mais complexos.
*
* @version 1.0
* @since   05/06/2003
*/
public class ConfereCPF {

   /** Realiza a validação do CPF.
    *
    * @param   strCPF número de CPF a ser validado
    * @return  true se o CPF é válido e false se não é válido
    */
   static public boolean CPF (String strCpf )
   {
      int     d1, d2;
      int     digito1, digito2, resto;
      int     digitoCPF;
      String  nDigResult;

      d1 = d2 = 0;
      digito1 = digito2 = resto = 0;

      for (int nCount = 1; nCount < strCpf.length() -1; nCount++)
      {
         digitoCPF = Integer.valueOf (strCpf.substring(nCount -1, nCount)).intValue();

         d1 = d1 + ( 11 - nCount ) * digitoCPF;

         d2 = d2 + ( 12 - nCount ) * digitoCPF;
      };

      resto = (d1 % 11);

      if (resto < 2)
         digito1 = 0;
      else
         digito1 = 11 - resto;

      d2 += 2 * digito1;

      resto = (d2 % 11);

      if (resto < 2)
         digito2 = 0;
      else
         digito2 = 11 - resto;

      String nDigVerific = strCpf.substring (strCpf.length()-2, strCpf.length());

      nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

      return nDigVerific.equals(nDigResult);
   }

   /* Use este trecho para testar a classe
   public static void main(String[] args) {
      System.out.println( CPF("04624193806") );
   }
   */
}
