public class DiasMesSwitch {
    public static void main(String[] args) {
        String mes = "febrero";

        switch (mes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                System.out.println(mes + " tiene 31 días.");
                break;
            case "febrero":
                System.out.println(mes + " tiene 28 días.");
                break;
            default:
                System.out.println(mes + " tiene 30 días.");
                break;
        }
    }
}
