package ae5.clases;

public class Reloj {

   // Atributos privados para encapsular el estado del reloj
   private int hora;
   private int minuto;
   private int segundo;
   private boolean alarmaActiva;
   private int horaAlarma;
   private int minutoAlarma;

   public int getHora() {
	return hora;
}

   public void setHora(int hora) {
	   if(hora > 0 && hora < 24) {
		   this.hora = hora;
	   }else {
		   System.out.println("No se puede asignar la hora ingresada");
	   }
   }

   public int getMinuto() {
	return minuto;
   }

   public void setMinuto(int minuto) {
	this.minuto = minuto;
   }

   public int getSegundo() {
	return segundo;
   }

   public void setSegundo(int segundo) {
	this.segundo = segundo;
   }

   public boolean isAlarmaActiva() {
	return alarmaActiva;
   }

   public void setAlarmaActiva(boolean alarmaActiva) {
	this.alarmaActiva = alarmaActiva;
   }

   public int getHoraAlarma() {
	return horaAlarma;
   }

   public void setHoraAlarma(int horaAlarma) {
	this.horaAlarma = horaAlarma;
   }

   public int getMinutoAlarma() {
	return minutoAlarma;
   }

   public void setMinutoAlarma(int minutoAlarma) {
	this.minutoAlarma = minutoAlarma;
   }

   // Constructor para inicializar el reloj con la hora actual
   public Reloj(int hora, int minuto, int segundo) {
       this.hora = hora;
       this.minuto = minuto;
       this.segundo = segundo;
       this.alarmaActiva = false; // La alarma está desactivada por defecto
   }

   // Método de instancia para establecer la alarma
   public void establecerAlarma(int hora, int minuto) {
       this.horaAlarma = hora;
       this.minutoAlarma = minuto;
       this.alarmaActiva = true;
       System.out.println("Alarma establecida para las " + hora + ":" + minuto);
   }

   // Método de instancia para desactivar la alarma
   public void desactivarAlarma() {
       this.alarmaActiva = false;
       System.out.println("Alarma desactivada");
   }

   // Método de instancia para mostrar la hora actual
   public void mostrarHora() {
       System.out.println("Hora actual: " + this.hora + ":" + this.minuto + ":" + this.segundo);
   }

   // Método de instancia para avanzar un segundo
   public void tickSegundo() {
       this.segundo++;
       if (this.segundo >= 60) {
           this.segundo = 0;
           this.minuto++;
           if (this.minuto >= 60) {
               this.minuto = 0;
               this.hora++;
               if (this.hora >= 24) {
                   this.hora = 0;
               }
           }
       }
       // Comprobar si la alarma debe sonar
       comprobarAlarma();
   }

   // Método privado para comprobar la alarma
   private void comprobarAlarma() {
       if (this.alarmaActiva && this.hora == this.horaAlarma && this.minuto == this.minutoAlarma && this.segundo == 0) {
           System.out.println("¡Ring! ¡Ring! La alarma suena a las " + this.hora + ":" + this.minuto);
           this.alarmaActiva = false;
       }
   }
}