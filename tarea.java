import java.util.Scanner;
public class tarea {
    static Scanner teclado=new Scanner(System.in);
    public static void ejer1() {
         
    
     //declarar variables
     double num1=1500;
     double num2=0.10;
     double resultado1=0;
     double resultado2=0;
     double resultado3=0;
     double resultado4=0;
     double resultado5=0;
     double resultadofinal=0;
     //proceso
     resultado1=num1*num2+num1;
     resultado2=resultado1*num2+resultado1;
     resultado3=resultado2*num2+resultado2;
     resultado4=resultado3*num2+resultado3;
     resultado5=resultado4*num2+resultado4;
     resultadofinal=resultado5*num2+resultado5;
     //datos de salida
     System.out.println("*****************************************************************");
     System.out.println("luego de 6 años el profesor tiene un salario de $:" + resultadofinal);
     System.out.println("*****************************************************************");
     System.out.println("");
     System.out.println("el primer año su salario era de $:" + resultado1);
     System.out.println("");
     System.out.println("el seundo año su salario era de $:" + resultado2);
     System.out.println("");
     System.out.println("el tercer año su salario era de $:" + resultado3);
     System.out.println("");
     System.out.println("el cuarto año su salario era de $:" + resultado4);
     System.out.println("");
     System.out.println("el quinto año su salario era de $:" + resultado5);
     System.out.println("");
    }

    public static void ejer2(){
        //declarar variables
        int tipo1=0, tipo2=0, tipo3=0, tarjeta=0;
        System.out.println("");
        System.out.println("**********************************************");
        System.out.println("*bienvenido a **EL NAUFRAGO SATISFECHO***");
        System.out.println("**********************************************");
        System.out.println("");
        //datos de entrada
        System.out.println("");
        System.out.println("ingrese la cantidad de hamburguesas sencillas que desea comprar: ");
        tipo1=teclado.nextInt();
        System.out.println("");
        System.out.println("ingrese la cantidad de hamburguesas dobles que desea comprar: ");
        tipo2=teclado.nextInt();
        System.out.println("");
        System.out.println("ingrese la cantidad de hamburguesas triples que desea comprar: ");
        tipo3=teclado.nextInt();
        System.out.println("");
        System.out.println("¿pagara con tarjeta?   1 : si      2 : no  ");
        tarjeta=teclado.nextInt();
        System.out.println("");
        //proceso
        int tipoA=tipo1*20;
        int tipoB=tipo2*25;
        int tipoC=tipo3*28;
        int total=(tipoA+tipoB+tipoC);
        //datos de salida
        if(tarjeta==1){
            System.out.println("tiene que pagar: $"+(total+((tipoA+tipoB+tipoC)*0.05)));
        }else if(tarjeta==2){
            System.out.println("tiene que pagar: $"+(tipoA+tipoB+tipoC));
        }else{
            System.out.println("ERROR este dato no existe");
        }
    }


    public static void ejer3() {
      int cantidad1, cantidad2, cantidad3, n, f, valor;
      cantidad1=0;
      cantidad2=0;
      cantidad3=0;
      System.out.println("cantidad de valores que inresaras : ");
      n=teclado.nextInt();
      for(f=1;f<=n;f++) {
        System.out.println("ingrese un valor : ");
        valor=teclado.nextInt();
        if(valor>0){
          cantidad1=cantidad1+1;
        }else if(valor==0){
          cantidad2=cantidad2+1;
        }else {
          cantidad3=cantidad3+1;
        }
      }
      System.out.println("la cantidad de numeros mayores a 0 son : "+cantidad1);
      System.out.println("la cantidad de numeros iguales a 0 son : "+cantidad2);
      System.out.println("la cantidad de numeros menores a 0 son : "+cantidad3);
    }

    public static void ejer5() {
        //declara variables
        String nombre = "";
        int numD=0;
        double cantidad=3;
        double resultado=0;
        System.out.println("");
        System.out.println("***************************************************************************************");
        System.out.println("***Hola en este programa realizaremos la cantidad de dinero que ahorraras***");
        System.out.println("***************************************************************************************");
        System.out.println("");
        //Datos de entrada
        System.out.println("¿cual es tu nombre?");
        nombre=teclado.nextLine();
        System.out.println("");
        System.out.println("ingrese el numero de dia que desea ver su ahorro: ");
        numD=teclado.nextInt();
        resultado=Math.pow(cantidad,numD);
        //datos de salida
        System.out.println("");
        System.out.println("hola "+nombre+" tu ahorro en el dia "+numD+" es de: " + resultado+" pesos");
        System.out.println("");
        System.out.println("al año tienes un ahorro de : "+(Math.pow(cantidad,365))+" pesos");
    }

    public static void ejer8() {
        Scanner in=new Scanner(System.in);
        //declarar variables
        String nombre = "";
        int numArticulo=0;
        int precio=20;
        int total=0;
        double descuento1=0;
        double descuento2=0;
        double descuento3=0;
        double des1=0.15;
        double des2=0.12;
        double des3=0.10;
        
        System.out.println("");
        System.out.println("**********************************************");
        System.out.println("***Hola bienvenido a la tienda de articulos***");
        System.out.println("**********************************************");
        System.out.println("");
        //Datos de entrada
        System.out.println("");
        System.out.println("¿cual es tu nombre?");
        nombre=in.nextLine();
        System.out.println("");
        System.out.println("ingrese la cantidad de articulos que desea comprar: ");
        numArticulo=in.nextInt();
        total=(numArticulo*precio);
        descuento1=((total) * des1);
        descuento2=((total) * des2);
        descuento3=((total) * des3);
        //Proceso y datos de salida
        if(total>=200){
            System.out.println("");
            System.out.println("hola "+nombre+ " tienes un descuento de 15%  :$"+descuento1+" llegando a pagar un total de :$"+(total-descuento1));
        }else if(total>100 && total<200){
            System.out.println("");
            System.out.println("hola "+nombre+ " tienes un descuento de 12%  :$"+descuento2+" llegando a pagar un total de :$"+(total-descuento2));
        }else{
            System.out.println("");
            System.out.println("hola "+nombre+ " tienes un descuento de 10%  :$"+descuento3+" llegando a pagar un total de :$"+(total-descuento3));
        }
    }

    public static void ejer9() {
        //Declarar variables
        String nombre = "";
        int cantidad=0;
        int año=0;
        System.out.println("");
        System.out.println("**********************************************");
        System.out.println("*bienvenido al banco **LOS CHETOS**");
        System.out.println("**********************************************");
        System.out.println("");
        //Datos de entrada
        System.out.println("¿cual es tu nombre?");
        nombre=teclado.nextLine();
        System.out.println("");
        System.out.println("ingrese la cantidad de dinero que depositara al mes: ");
        cantidad=teclado.nextInt();
        System.out.println("");
        System.out.println("ingrese el numero de año que desea ver su dinero considerando que tendra un interes del 10%: ");
        año=teclado.nextInt();
        System.out.println("");
        //proceso
        int cantidadA=(cantidad*12);
        double interesF=(cantidadA*0.10);
        double total=(cantidadA+interesF);
        //datos de salida
        System.out.println("hola "+nombre+" en "+año+" años tienes un tota de :$"+total);
        System.out.println("tu interes es de :$"+interesF+" en "+año+" años");
    }
    
    public static void ejer12() {
        //Declara variables
        int billetes=0;
        int monedas=0;
        System.out.println("");
        System.out.println("***************************************************************************************");
        System.out.println("***Hola en este programa veremos la cantidad total de dinero en una caja registradora***");
        System.out.println("***************************************************************************************");
        System.out.println("");
        //Datos de entrada
        System.out.println("ingrese la cantidad de billetes teniendo en cuenta que cada billete tienen un valor de $10");
        billetes=teclado.nextInt();
        System.out.println("");
        System.out.println("ingrese la cantidad de monedas teniendo en cuenta que cada moneda vale $5");
        monedas=teclado.nextInt();
        System.out.println("");
        //proceso
        int billete2=billetes*10;
        int moneda2=monedas*5;
        //datos de salida
        System.out.println("la caja registradora tiene un total de : $"+(billete2+moneda2)+" soles");

    }

    public static void ejer14() {
      //declarar variables
      int aprobados, reprobados, f, cantidad, nota;
      aprobados=0;
      reprobados=0;
      cantidad=0;
      System.out.println("ingrese la cantidad de estudiantes : ");
      cantidad=teclado.nextInt();
      for(f=1;f<=cantidad;f++){
        System.out.println("ingrese la nota : ");
        nota=teclado.nextInt();
        if (nota>=13){
          aprobados = aprobados+1;
        }else {
          reprobados=reprobados+1;
        }
      }
      System.out.println("cantidad de aprobados : "+aprobados);
      System.out.println("cantidad de reprobados : "+reprobados);

    }

    public static void ejer16() {
        //Declarar variables
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        int num5=0;
        int nume1=0;
        int nume2=0;
        int nume3=0;
        int nume4=0;
        int nume5=0;
        System.out.println("");
        System.out.println("***************************************************************************************");
        System.out.println("**hola este programa elevaremos al cuvo 5 numeros que usted digite***");
        System.out.println("***************************************************************************************");
        System.out.println("");
        //Datos de entrada
        System.out.println("ingrese 5 numeros a convertir : ");
        System.out.println("");
        num1=teclado.nextInt();
        System.out.println("");
        num2=teclado.nextInt();
        System.out.println("");
        num3=teclado.nextInt();
        System.out.println("");
        num4=teclado.nextInt();
        System.out.println("");
        num5=teclado.nextInt();
        System.out.println("");
        //proceso
        nume1=(num1*num1*num1);
        nume2=(num2*num2*num2);
        nume3=(num3*num3*num3);
        nume4=(num4*num4*num4);
        nume5=(num5*num5*num5);
        //Datos de salida
        System.out.println("el numero "+num1+" elevado al cuvo es "+nume1);
        System.out.println("");
        System.out.println("el numero "+num2+" elevado al cuvo es "+nume2);
        System.out.println("");
        System.out.println("el numero "+num3+" elevado al cuvo es "+nume3);
        System.out.println("");
        System.out.println("el numero "+num4+" elevado al cuvo es "+nume4);
        System.out.println("");
        System.out.println("el numero "+num5+" elevado al cuvo es "+nume5);
    }

    public static void ejer17() {
        //Declarar variables
        int numero=0;
        System.out.println("");
        System.out.println("*****************************");
        System.out.println("***LA TABLA DE MULTIPLICAR***");
        System.out.println("*****************************");
        System.out.println("");
        //Datos de entrada
        System.out.println("Escribe el numero que deseas ver en la tabla de multiplicar :");
        System.out.println("");
        numero=teclado.nextInt();
        System.out.println("");
        //proceso
        int num1=numero*1;
        int num2=numero*2;
        int num3=numero*3;
        int num4=numero*4;
        int num5=numero*5;
        int num6=numero*6;
        int num7=numero*7;
        int num8=numero*8;
        int num9=numero*9;
        int num10=numero*10;
        int num11=numero*11;
        int num12=numero*12;
        //datos de salida
        System.out.println("hola aqui te mostrare la tabla de multiplicar del numero "+numero);
        System.out.println(numero+" x 1 = "+num1);
        System.out.println(numero+" x 2 = "+num2);
        System.out.println(numero+" x 3 = "+num3);
        System.out.println(numero+" x 4 = "+num4);
        System.out.println(numero+" x 5 = "+num5);
        System.out.println(numero+" x 6 = "+num6);
        System.out.println(numero+" x 7 = "+num7);
        System.out.println(numero+" x 8 = "+num8);
        System.out.println(numero+" x 9 = "+num9);
        System.out.println(numero+" x 10 = "+num10);
        System.out.println(numero+" x 11 = "+num11);
        System.out.println(numero+" x 12 = "+num12);
    }

    
    public static void main(String args[]) {
        //ejer1();
        //ejer2();
        ejer3();
        //ejer5();
        //ejer8();
        //ejer9();
        //ejer12();
        //ejer14();
        //ejer16();
        //ejer17();
           
    }
}