public class CaracteristicasAutoSwitch {
    public static void main(String[] args) {
        char codigo = 'b';

        switch (codigo) {
            case 'a':
                System.out.println("Clase A: 4 ruedas, un motor");
                break;
            case 'b':
                System.out.println("Clase B: 4 ruedas, un motor, cierre centralizado, aire");
                break;
            case 'c':
                System.out.println("Clase C: 4 ruedas, un motor, cierre centralizado, aire, airbag");
                break;
            default:
                System.out.println("Código inválido");
                break;
        }
    }
}
