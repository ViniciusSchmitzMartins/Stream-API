import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);




        int somaDigitos = numeros.stream().mapToInt(s1 -> {
           int soma = 0;
            for (int i = 0; i < numeros.size();i++){
                soma += s1 % 10;
                s1 /= 10;
            }
            return soma;
        }).sum();

        System.out.println(somaDigitos);

    }
}
