import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Mascota> listaMascotas = new ArrayList<>();
        int opcion,opcion1;
        String respuesta;

        do {
            System.out.println("\n===== MENÚ DE MASCOTAS =====");
            System.out.println("1. Crear mascota");
            System.out.println("2. Buscar mascota por nombre");
            System.out.println("3. Mostrar informacion");
            System.out.println("4. salir");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    teclado.nextLine();
                    System.out.println("Nombre:");
                    String nombre = teclado.nextLine();

                    System.out.println("Especie:");
                    String especie = teclado.nextLine();

                    System.out.println("Edad:");
                    int edad = teclado.nextInt();

                    System.out.println("Peso:");
                    double peso = teclado.nextDouble();

                    System.out.println("¿Está saludable? (true/false):");
                    boolean saludable = teclado.nextBoolean();

                    listaMascotas.add(new Mascota(nombre, especie, edad, peso, saludable));
                    System.out.println("Mascota creada correctamente.");
                    break;

                case 2:
                    boolean encontrar=false;
                    System.out.println("=====BIENVENIDO BUSCA LA MASCOTA ===");
                    teclado.nextLine();
                    System.out.println("Ingrese el nombre de la mascota: ");
                    respuesta= teclado.nextLine();
                    for (Mascota ma : listaMascotas) {
                        if(ma.getNombre().equalsIgnoreCase(respuesta)){
                            System.out.println("Mascota encontrada");
                            System.out.println(ma.mostrarFicha());
                            encontrar=true;
                            do{
                                System.out.println("\n===== MENÚ DE MASCOTAS =====");
                                System.out.println("1. Modificar Edad");
                                System.out.println("3. Modificar estado de salud");
                                System.out.println("4. Modificar peso");
                                System.out.println("5. Mostrar información");
                                System.out.println("6. Salir");
                                opcion1 = teclado.nextInt();
                                switch (opcion1){
                                    case 1:
                                        System.out.println("=====BIENEVENIDO A MODIFICAR LA EDAD DE TU MASCOTA");
                                        if (listaMascotas.size() > 0) {
                                            System.out.println("Nueva edad:");
                                            int nuevaEdad = teclado.nextInt();
                                            listaMascotas.get(0).setEdad(nuevaEdad);
                                            System.out.println("Edad actualizada.");
                                        } else {
                                            System.out.println("No hay mascotas registradas.");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("=====BIENVENIDO A MODIFICAR SALUD DE LA MASCOTA====");
                                        if (listaMascotas.size() > 0) {
                                            System.out.println("¿Está saludable? (true/false):");
                                            boolean estado = teclado.nextBoolean();
                                            listaMascotas.get(0).setSaludable(estado);
                                            System.out.println("Estado actualizado.");
                                        } else {
                                            System.out.println("No hay mascotas registradas.");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("======BIENVENIDO A MODIFICAR PESO DE LA MASCOTA====");
                                        if (listaMascotas.size() > 0) {
                                            System.out.println("Nuevo peso:");
                                            double nuevoPeso = teclado.nextDouble();
                                            listaMascotas.get(0).setPeso(nuevoPeso);
                                            System.out.println("Peso actualizado.");
                                        } else {
                                            System.out.println("No hay mascotas registradas.");
                                        }
                                        break;
                                    case 4:
                                        System.out.println("======BIENVENIDO A MOSTRAR FICHA PARA MASCOTA=====");
                                        for(Mascota m1:listaMascotas){
                                            System.out.println(m1.mostrarFicha());
                                        }
                                        break;
                                    default:
                                        System.out.println("opcion no invalida");

                                }
                            }while (opcion != 6);
                        }else{
                            System.out.println("No se ha encontrado mascota");
                        }
                    }
                    break;

                case 3:
                    for(Mascota ma:listaMascotas){
                        System.out.println(ma.mostrarFicha());
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        teclado.close();
    }
}