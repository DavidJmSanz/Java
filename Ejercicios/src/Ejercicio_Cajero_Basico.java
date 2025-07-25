public class Ejercicio_Cajero_Basico {
    public static void main(String[] args) {
        int saldo = 5000;
        int opcion = 1;
        int monto = 6000;
        boolean tarjetaValida = false;
        char tipoCuenta = 'A'; //A (ahorros) - C (Corriente)

        if (tarjetaValida){
            switch (opcion){
                case 1: //consultar saldo
                    System.out.println("Su saldo es: "+saldo);
                    break;
                case 2: //retirar dinero
                    if(saldo >= monto){
                        System.out.println("Retiro Exitoso");
                        saldo-=monto;
                        System.out.println("Su saldo actual es: "+saldo);
                    } else {
                        System.out.println("saldo insuficiente");
                    }
                    break;
                case 3: //consignar dinero
                    System.out.println("Consignacion exitosa");
                    saldo+=monto;
                    System.out.println("Su saldo actual es: "+saldo);
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
            if(tipoCuenta != 'A'){
                System.out.println("Operacion completada de su cuenta Corriente");
            }else {
                System.out.println("Operacion completada de su cuenta Ahorros");
            }
        }else {
            System.out.println("Tarjeta Invalida. Operacion cancelada!");
        }
    }
}
