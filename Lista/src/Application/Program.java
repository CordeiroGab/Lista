package Application;

import Dados.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Funcionario> funcionarios = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de funcionarios:");
        int quant = sc.nextInt();

        for (int i = 0; i < quant; i++) {

            System.out.println("Funcionario #" + (i + 1));
            System.out.print("ID:");
            Integer id = sc.nextInt();

            while(hasID(funcionarios, id)) {
                System.out.println("ID existente, digite outro ID;");
                System.out.print("ID:");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario:");
            Double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id, nome, salario);
            funcionarios.add(funcionario);
        }

        System.out.println("==================================================");

        System.out.println("Digite o id do funcionario:");
        int id = sc.nextInt();

        Funcionario func = funcionarios.stream().filter(x -> x.getId() == id).findFirst().get();

        //Integer pos = posicao(funcionarios, id);

        if(func == null){
            System.out.println("ID invalido");
        }
        else{
            System.out.println("Entre com a porcentagem");
            double porcent = sc.nextDouble();

            func.calcularSalario(porcent);
        }

        System.out.println("Funcionarios: ");
        for(Funcionario funcionario: funcionarios){
            System.out.println(funcionario);
        }



       /*
        System.out.println("==================================================");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionarios");
            funcionario.toString();
        }




        System.out.println("Digite o ID do funcionario:");
        int id = sc.nextInt();
        boolean encontrado = false;

        Funcionario func =  funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (func == null) {
            System.out.println("Funcionario não encontrado");
        }else {
            System.out.println("Digite a porcentagem:");
        }
        double porcentagem = sc.nextDouble();


        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                System.out.println("Digite q porcentagem:");
                double porcentagem = sc.nextDouble();
                funcionario.calcularSalario(porcentagem);
                encontrado =  true;
                break;
            }

        }
        if (!encontrado) {
            System.out.println("Funcionario não encontrado");
        }
        System.out.println("==================================================");
        System.out.println("Funcionarios");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }

         */

    }

    public static Integer posicao(List<Funcionario> list,int id) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
    public static boolean hasID(List<Funcionario> list, int id) {
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;
    }
}
