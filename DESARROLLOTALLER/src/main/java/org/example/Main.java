package org.example;

import java.awt.geom.Area;
import java.time.LocalDate;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Asegurado asegurado1 = new Asegurado();
        Asegurado asegurado2 = new Asegurado(1L, "1012543210", "Jhon Jairo", "Vallejo Ruiz", "Casado", "Maestria", "Abogado", LocalDate.of(1994,2,17),  "Avenida Libertad 456", "555-5678",  "Jhonjairo12@gmail.com", "POL-002",  LocalDate.of(2018, 2, 1), LocalDate.of(2024, 2, 1), 3200000.0);

        Agencia agencia1 = new Agencia();
        Agencia agencia2 = new Agencia("900123456-7","Agencia de Seguros La Esperanza", "Calle 10 #45-67", "555-1234",
                "contacto@seguroslaesperanza.com",
                "LIC-123456",
                "Seguros Generales",
                25,
                "Lunes a Viernes, 8 AM - 5 PM",
                "Bogotá, Colombia"
        );

        Asesor asesor1 = new Asesor ();
        Asesor asesor2 = new Asesor(
                2L,
                "Lucía",
                "Martínez",
                "LIC-987654",
                5,
                "Ingeniería en Sistemas",
                "Universidad Nacional",
                "lucia.martinez@email.com",
                "555-4321",
                "12345678-9"
        );

        Beneficiario beneficiario1 = new Beneficiario ();
        Beneficiario beneficiario2 = new Beneficiario(
                3L,
                "Carlos",
                "Pérez",
                "1012345678",
                "Hijo",
                LocalDate.of(2010, 5, 15),
                "Calle 20 #30-40",
                "555-9876",
                "carlos.perez@email.com",
                "Salud"
        );


        Inmueble inmueble1 = new Inmueble ();
        Inmueble inmueble2 = new Inmueble(
                "Avenida Principal 123",
                "Apartamento",
                75.5,
                3,
                2,
                "Excelente",
                250000.0,
                2015,
                "Agua, Luz, Internet",
                "Madrid, España"
        );

    Scanner lea = new Scanner (System.in);
    Inmueble inmueble = new Inmueble();

        System.out.println("Dirección: ");
        inmueble.setDireccion(lea.nextLine());
        System.out.println("Tipo de Inmueble: ");
        inmueble.setTipoInmueble(lea.nextLine());
        System.out.println("Superficie: ");
        inmueble.setSuperficie(lea.nextDouble());
        System.out.println("Número de Habitaciones: ");
        inmueble.setNumHabitaciones(lea.nextInt());
        System.out.println("Número de Baños: ");
        inmueble.setNumBanos(lea.nextInt());
        System.out.println("Estado de Conservación: ");
        inmueble.setEstadoConservacion(lea.nextLine());
        System.out.println("Valor del Inmueble: ");
        inmueble.setValorInmueble(lea.nextDouble());
        System.out.println("Año de Construcción: ");
        inmueble.setAnioConstruccion(lea.nextInt());
        System.out.println("Servicios Incluidos: " );
        inmueble.setServiciosIncluidos(lea.nextLine());
        System.out.println("Ubicación Geográfica: ");
        inmueble.setUbicacionGeografica(lea.nextLine());

    }
}