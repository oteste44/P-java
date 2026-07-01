import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("args = " + Arrays.toString(args));
        int [] numero = {1,2,3,4};
        double [] notas = new double[4];
        notas[0] = 8.8;
        notas[1] = 7.8;
        notas[2] = 8.7;
        notas[3] = 9.8;

    String[] nome = new String[10];
    Integer[] contas = new Integer[6];
    double[] nts = new double[5];
    boolean[] maiores = new boolean[4];

//    Integer.perseInt("1");
//    Double.parseDouble("23");
//    Boolean.toString();

        List<String> listaAlunos = new ArrayList<>();
        listaAlunos.add("Arthur");
        listaAlunos.add("pablito");
        listaAlunos.add("beto");
        listaAlunos.add("luan");

        listaAlunos.forEach(System.out::println);

        List<Double> listaNotas = new ArrayList<>();
        listaNotas.add(9.5);
        listaNotas.add(7.4);
        listaNotas.add(8.5);
        double soma = 0;
        System.out.println(listaNotas.contains(9.5));

    }

}