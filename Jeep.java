package br.com.generation.projetobloco01;

public class Jeep {

	

import java.util.Scanner;

public class Jeep {

	 static Scanner sc = new Scanner (System.in);
	 
	 static String [] Jeep = {"Renegade","Compass","Commander"};
	 static double[] litrokmJeep= {6.7,10.3,9.5};
	 
	 static int opção,opção11;
	 static double Co2 = 0.157;
	 static double resultado;
	 
	 public static void listademodelos() {
		 
		 System.out.println("===Lista de modelos Jeep===");
		System.out.println("1-Renegade");
		System.out.println("2-Compass");
		System.out.println("3- commander");
		
		System.out.println("Informe o modelo do seu carro");

	}
	 
	 public static void opção1() {
		 
		 resultado=litrokmJeep [0]* Co2;
		 
		 System.out.println();
		 System.out.println("A cada 6.7 km rodados o Jeep Renegade ");
		 System.out.println("Jogando" + resultado+"kg de Gas carbônico na atmosfera");
	 }
	 
     public static void opção2() {
		 
		 resultado = litrokmJeep [1]* Co2;
		 
		 System.out.println();
		 System.out.println("A cada 10.3 km rodados o Jeep Compass");
		 System.out.println("Jogando" + resultado+"kg de Gas carbônico na atmosfera");

}
       
        public static void opção3() {
		 
		 resultado = litrokmJeep [2]* Co2;
		 
		 System.out.println();
		 System.out.println("A cada 9.5 km rodados o Jeep Commander ");
		 System.out.println("Jogando" + resultado+"kg de Gas carbônico na atmosfera");

        }
        
}

	}

}
