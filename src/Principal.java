import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        ArrayList<Integer> posible = new ArrayList<Integer>();
        posible.add(1);
        posible.add(2);
        posible.add(3);
        posible.add(4);
        posible.add(5);
        posible.add(6);
        /*
        MXN - Peso mexicano
        BRL - Boliviano boliviano
        BRL - Real brasileño
        CLP - Peso chileno
        COP - Peso colombiano
        USD - Dólar estadounidense
         */
        String menu = """
                **********************************************
                Bienvenido/a a este conversor de moneda
                1) Dólar =>> Peso Mexicano
                2) Peso Mexicano =>> Dólar
                3) Dólar =>> Real brazileño
                4) Real brazileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                Elija una opción
                **********************************************
                """;

        int opcion = 0;
        float cantidadAConvertir = 1;
        String monedaOrigen=null, monedaSalida=null;


        do {
            System.out.println(menu);
            try {
                opcion = lectura.nextInt();
                monedaOrigen = switch (opcion) {
                    case 1, 3, 5 -> "USD";
                    case 2 -> "MXN";
                    case 4 -> "BRL";
                    case 6 -> "COP";
                    default -> null;
                };

                monedaSalida = switch (opcion) {
                    case 2, 4, 6 -> "USD";
                    case 1 -> "MXN";
                    case 3 -> "BRL";
                    case 5 -> "COP";
                    default -> null;
                };

                if (!posible.contains(opcion)){
                    System.out.println("Opción inválida");
                }else{
                    Moneda moneda = consulta.buscaMoneda(monedaOrigen);

                    float cantidadConvertida = switch (opcion) {
                        case 2, 4, 6 -> Float.parseFloat(moneda.conversion_rates().USD());
                        case 1 -> Float.parseFloat(moneda.conversion_rates().MXN());
                        case 3 -> Float.parseFloat(moneda.conversion_rates().BRL());
                        case 5 -> Float.parseFloat(moneda.conversion_rates().COP());
                        default -> 0;
                    };

                    System.out.println("Ingrese la cantidad a covertir: ");
                    cantidadAConvertir = lectura.nextFloat();
                    System.out.println("\n El valor " + cantidadAConvertir +
                            " ["+ monedaOrigen + "] " +
                            "corresponde al valor final de =>> " +
                            (cantidadAConvertir * cantidadConvertida) +
                            " ["+ monedaSalida + "] ");
                }
            } catch (NumberFormatException e){
                System.out.println("Opción no válida: " + e.getMessage());
                break;
            } catch (Exception e){
                System.out.println("A ocurrido un error inesperado, lo lamentamos");
                break;
            }
        } while (opcion != 7);

        System.out.println("Gacias por convertir con nostros, ¡hasta pronto!");
    }
}
