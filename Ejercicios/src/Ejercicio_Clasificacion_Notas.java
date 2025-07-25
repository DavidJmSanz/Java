public class Ejercicio_Clasificacion_Notas {
    public static void main(String[] args) {
        int nota = 4  ;
        String calificacion ;

      if (nota >= 0 && nota <= 10){
          if (nota == 9 || nota == 10){
              System.out.println("Excelente");
          } else if (nota == 7 || nota == 8 ) {
              System.out.println("Notable");
          } else if (nota == 5 || nota == 6) {
              System.out.println("Aprobado");
          } else {
              System.out.println("Reprobado");
          }
      }
        else {
          System.out.println("Nota invalida, por favor verificar!");}
    }
}
