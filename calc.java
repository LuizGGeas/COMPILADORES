import java.util.*;

class calc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> inteiro = new ArrayList<>();
        ArrayList<String> floater = new ArrayList<>();
        ArrayList<String> sinal = new ArrayList<>();
        ArrayList<String> erro = new ArrayList<>();
        String exp = sc.nextLine();
        sc.close();
        for(String g: exp.split(" ")){
            if(g.matches("^\\d*.\\d+$"))
                floater.add(g);
            else if (g.matches("^\\d+"))
                inteiro.add(g);
            else if(g.matches("^[+|-|*|/|(|)]$"))
                sinal.add(g);
            else
                erro.add(g);
        }
        System.out.println(inteiro);
        System.out.println(floater);
        System.out.println(sinal);
        System.out.println(erro);
    }
}