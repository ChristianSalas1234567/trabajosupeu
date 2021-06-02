int canidad1, cantidad2, cantidad3, n, f, valor1;
canidad=0;
System.out.println("cantidad de valores que inresaras : ");
n=teclado.nextInt();
for(f=1;f<=n;f++) {
  System.out.println("ingrese un valor : ");
  valor=teclado.nextInt();
  if(valor>0){
    cantidad1=cantidad1+1;
  }else if(valor=0){
    cantidad2=cantidad2+1;
  }else {
    cantidad3=cantidad3+1;
  }
}
System.out.println("la cantidad de numeros mayores a 0 son : "+canidad1);
System.out.println("la cantidad de numeros iguales a 0 son : "+canidad2);
System.out.println("la cantidad de numeros menores a 0 son : "+canidad3);