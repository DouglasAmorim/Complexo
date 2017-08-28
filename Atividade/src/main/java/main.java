public class main {

    public static void main(String[] args) {
        Complexo e1 = new Complexo(1,2);
        Complexo e2 = new Complexo(4,7);
        Complexo e3 = new Complexo();

        e1.soma(e2);
        System.out.println("Valor de e1 é: " + e1.toString());

        e2.subtracao(e3);
        System.out.println("Valor de e2 é: " + e2.toString());

        System.out.println("Valor de e3 é: " + e3.toString());
    }
}
