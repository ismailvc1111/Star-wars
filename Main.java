import java.awt.RadialGradientPaint;
import java.util.Scanner;


class Main {
 public static void main(String[] args) {
 Scanner sc = new  Scanner(System.in);
 int resultado=0;
//
System.out.println(" ##################################################################################################");
System.out.println(" ##################################################################################################");
System.out.println(" ###                                       __,__                                                ###");
System.out.println(" ###                              .--.  .-\"     \"-.  .--.                                       ###");
System.out.println(" ###                             / .. \\/  .-. .-.  \\/ .. \\                                      ###");
System.out.println(" ###                            | |  \'|  /   Y   \\  |\'  | |                                     ###");
System.out.println(" ###                            | \\   \\  \\ 0 | 0 /  /   / |                                     ###");
System.out.println(" ###                             \\ \'- ,\\.-\"`` ``\"-./, -\' /                                      ###");
System.out.println(" ###                              `\'-\' /_   ^ ^   _\\ \'-\'`                                       ###");
System.out.println(" ###                              .--\'|  \\._ _ _./  |\'--.                                       ###");
System.out.println(" ###                            /`    \\   \\.-.  /   /    `\\                                     ###");
System.out.println(" ###                           /       \'._/  |-\' _.\'       \\                                    ###");
System.out.println(" ###                          /          ;  /--~\'   |       \\                                   ###");
System.out.println(" ###                         /        .\'\\|.-\\--.     \\       \\                                  ###");
System.out.println(" ###                        /   .\'-. /.-.;\\  |\\|\'~\'-.|\\       \\                                 ###");
System.out.println(" ###                        \\       `-./`|_\\_/ `     `\\\'.      \\                                ###");
System.out.println(" ###                         \'.      ;     ___)        \'.`;    /  /\'\'\'\'\'\'\\                      ###");
System.out.println(" ###                           \'-.,_ ;     ___)          \\/   /  /  ___   \\                     ###");
System.out.println(" ###                            \\   ``\'------\'\\       \\   `  /  /  /   \\   \\                    ###");
System.out.println(" ###                             \'.    \\       \'.      |   ;/__/  /     \\   \\                   ###");
System.out.println(" ###                           ___>     \'.       \\_ _ _/   ,     /       \\__/                   ###");
System.out.println(" ###                         .\'   \'.   .''''''''/    |--\'`~~~~\'\'                                ###");
System.out.println(" ###                   _____// / .---\'        _/ / / /__  _____  _____  _____                   ###");
System.out.println(" ###                  | ___((_(_/  (_)       |(_(_(_|___|/  __ \\|_   _||_   _|                  ###");
System.out.println(" ###                  | |_/ / _ __  _  _ __  | |_ \\ `--. | /  \\/  | |    | |                    ###");
System.out.println(" ###                  |  __/ |  __|| ||  _ \\ | __| `--. \\| |      | |    | |                    ###");
System.out.println(" ###                  | |    | |   | || | | || |_ /\\__/ /| \\__/\\ _| |_  _| |_                   ###");
System.out.println(" ###                  \\_|    |_|   |_||_| |_| \\__|\\____/  \\____/ \\___/  \\___/                   ###");
System.out.println(" ###                                                                                            ###");
System.out.println(" ###                                 CREATED BY WWW.ISMAIL.ML                                   ###");
System.out.println(" ###                                                                                            ###");
System.out.println(" ###          -------------------------------------------------------------------------         ###");
System.out.println(" ###          |                             STAR WARS                                 |         ###");
System.out.println(" ###          |-----------------------------------------------------------------------|         ###");
System.out.println(" ###          |           TRABAJO DE CLASSE    BY ISMAIL                              |         ###");
System.out.println(" ###          -------------------------------------------------------------------------         ###");
System.out.println(" ###                                                                                            ###");
System.out.println(" ##################################################################################################");
System.out.println(" ##################################################################################################");
 









//colores en ANSI PARA EL TERMINAL
String b = "\u001B[0m"; //borrar      
String negro = "\033[30m";
String rojo = "\033[31m";
String verde = "\033[32m";
String amarillo = "\033[33m";
String azul = "\033[34m";
String magenta = "\033[35m";
String celeste = "\033[36m";
String blanco = "\033[37m";
        
String fRojo = "\033[41m";
String fVerde = "\033[42m";
String fAmarillo = "\033[43m";
String fAzul = "\033[44m";
String fMagenta = "\033[45m";
String fCeleste = "\033[46m";
String fGris = "\033[47m";


System.out.println( azul +" === STAR WARS CÓDIGOS SECRETOS === \n" +
 " Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke \n" +
 "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n"+
 "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n"+
 "está construyendo para destruirla.\n"+ " (Presiona Intro para continuar)");
 String seguir;
    try
    {
        seguir = sc.nextLine();
    }
    catch(Exception e)
    {}

  int numeroaleatorioS1 = (int) (Math.random()*10+1);
    //System.out.println(numeroaleatorioS1 + "ss");


  int numeroaleatorioS2 = (int) (Math.random()*(30-20+1)+20);
  //System.out.println(numeroaleatorioS2 + "ss");
  //nivel1
  while(numeroaleatorioS1 <= numeroaleatorioS2){

    resultado = numeroaleatorioS1 + resultado ;
    numeroaleatorioS1++;

  }
  //preguntas

  System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al\n"+
  "sistema S1 en el sector S2, pero el sistema de navegación está estropeado y el\n"+
  "computador tiene problemas para calcular parte de las coordenadas de salto.\n"+
  "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n"+
  "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n"+
  "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n"+
  "¿Qué debe introducir?  ");
  System.out.println(resultado);
  int numero = sc.nextInt();
//resultadonivel1
if(resultado==numero){
  System.out.println("Correcto");

}else {
  System.out.println( rojo +"Ese no era el código correcto… La misión ha sido un fracaso… :( :( :("+
  "Todavía no eres un Maestro Jedi de las Matemáticas ¡Vuelve a intentarlo!");
  System.out.println("Gracias por jugar :D");

return;

}

//nivel 2


int numeron = (int) (Math.random()*7+1);
int  numeron2 =   (int)(Math.random()*(12-8+1)+8); 
int r=1;
//System.out.println(numeron);
//System.out.println(numeron2);
//aqui hago el calculo de la multiplicacion de forma de bucle
while(numeron<=numeron2){
   r=r*numeron2;
  --numeron2;
  
}
//pregunta

System.out.println(" Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella" +
"de la muerte. Como van en una nave imperial robada se "+
"la intención de pasar desapercibidos. De repente suena el comunicador. Aquí"+
"agente de espaciopuerto P1 contactando con nave imperial P2. No están destinados"+
"en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa."+
"Eh… tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso"+
"para atracar y reparar la nave”. El agente, que no se anda con tonterías, responde"+
"“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el"+
"manual del piloto que estaba en la guantera y da con la página correcta. El código"+
"es el productorio entre el nº del agente y el nº de la nave (ambos inclusive)."+
"¿Cuál es el código? ");
System.out.println(r);

int numeronivel2 = sc.nextInt();
//resultadonivel2
if(r==numeronivel2){
  System.out.println("Correcto");

}else {
  System.out.println( rojo +"Ese no era el código correcto… La misión ha sido un fracaso… :( :( :("+
  "Todavía no eres un Maestro Jedi de las Matemáticas ¡Vuelve a intentarlo!");
  System.out.println("Gracias por jugar :D");

return;

}





//nivel_3

int N=  (int)(Math.random()*(100-50+1)+50)/10; 
int R=1;
//System.out.println(N);
//aqui hago el calculo para sacar el factorial
while(0!=N){
   R=R*N;
  --N;
}
//pregunta
System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se"+
"equipan con trajes de soldados imperiales que encuentran en la nave para pasar"+
"desapercibidos y bajan. Ahora deben averiguar en qué nivel de los N existentes se"+
"encuentra el reactor principal. Se dirigen al primer panel computerizado que"+
"encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita"+
"introducir una clave de acceso. Entonces recuerda la información que le proporcionó"+
"Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10"+
"(redondeando N hacia abajo), donde N es el nº de niveles"+
"¿Cual es el nivel correcto?");
  System.out.println(R);

int numeroresultado3 = sc.nextInt();

//resultadonive3
if(R==numeroresultado3){
  System.out.println("Correcto");

}else {
  System.out.println(rojo +"Ese no era el código correcto… La misión ha sido un fracaso… :( :( :("+
  "Todavía no eres un Maestro Jedi de las Matemáticas ¡Vuelve a intentarlo!");
  System.out.println("Gracias por jugar :D");

return;

}





//nivel_4
int P=  (int)(Math.random()*(100-10+1)+10); 
int K=0;
int totalnivel4=0;
System.out.println(P);
//aqui hago un bucle de division para poder hacer una codicion y sacar si el numero es primo o no
for(int i=1;i<=P;i++){
  if(P%i==0){
   ++K;
  }

}
if(K==2){
  System.out.println("esprimo");
   totalnivel4++;
}else {
    System.out.println("no es primo");

}
//pregunta

System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta"+
"acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para"+
"intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita"+
"verificar si el número P es primo o no. Si es primo introduce un 1, si no lo es"+
"introduce un 0.");


int numeronivel4 = sc.nextInt();


if(numeronivel4==totalnivel4){
    System.out.println("Correcto");


}else {
  System.out.println( rojo +"Ese no era el código correcto… La misión ha sido un fracaso… :( :( :("+
  "Todavía no eres un Maestro Jedi de las Matemáticas ¡Vuelve a intentarlo!");
  System.out.println("Gracias por jugar :D");
}









//nivel_5
int M = (int)(Math.random()*(10-5+1)+5); 
int S = (int)(Math.random()*(10-5+1)+5); 
int MR= 1;
int SR= 1;
int suma = 0;
while(0!=M){
   MR=MR*M;
  --M;
  //System.out.println(MR+"EEEEEEEeeeeeeee");
}
//el bucle del factorial
while(0!=S){
   SR=SR*S;
  --S;
  //System.out.println(SR+"eeeeeeee");
}
suma = MR+SR;
//resultadonivel5
  System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,"+
"programe el temporizador y salir de allí corriendo. Necesita programarlo para que"+
"explote en exactamente M minutos y S segundos, el tiempo suficiente para escapar"+
"antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y"+
"desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto"+
"peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar"+

"el factorial de M y el factorial de S. ¿Qué valor debe introducir?"); 
System.out.println(suma);
 int numeronivel5 = sc.nextInt();
if(numeronivel5==suma){
System.out.println("Correcto \n"+ verde +
"Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a"+
"sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se"+
"convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea"+
"consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan"+
"observan por la ventana la imagen de la colosal estrella de la muerte explotando en"+
"el silencio del espacio, desapareciendo para siempre junto a los restos del malvado imperio."+
"¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");
System.out.println("Gracias por jugar :D");


}else {
  System.out.println(  rojo +"Ese no era el código correcto… La misión ha sido un fracaso… :( :( :("+
  "Todavía no eres un Maestro Jedi de las Matemáticas ¡Vuelve a intentarlo!");
  System.out.println("Gracias por jugar :D");
}

  }
}