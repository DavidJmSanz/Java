public class Ejercicio_Sueldos {
    public static void main(String[] args) {
        int categoria=3;
        double salario;
        double bono =10;
        double descuento=11;
        switch (categoria){
            case 1://repositor
                salario=15890;
                System.out.println("Tiene un salario de: "+salario);
                System.out.println("el bono de respositor corresponde al "+bono+"% : "+(salario*(bono/100)));
                salario+=salario*(bono/100);
                System.out.println("El salario total de repositor es de: "+salario);
                break;
            case 2://cajero
                salario=25630.89;
                System.out.println("El salario de cajero es de: "+ salario);
                break;
            case 3://supervisor
                salario=35560.20;
                System.out.println("Tiene un salario de: "+salario);
                System.out.println("Tiene un descuento de "+ (salario*(descuento/100)));
                salario-=salario*(descuento/100);
                System.out.println("El salario total de supervisor es de: "+salario);
                break;
        }
    }
}
