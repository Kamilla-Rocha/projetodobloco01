package br.com.generation.projetobloco01;



		
		import java.util.Scanner;

		 
			
		
		
		public class Nissan {
			
			static Scanner sc = new Scanner(System.in);

					static  String [] Nissan = {"Frontier","Versa","Kicks"};
					static double [] litrokmNissan = {8.9,12.9,7.8};
					
					static int opção, opção6;
					static double Co2 = 7773;
					static double resultado;
					
					public static void listademodelos() {
						
						System.out.println("=== Lista de modelos Nissan===");
						System.out.println("01-Frontier ");
						System.out.println("02-Versa ");
					    System.out.println("03-Kics ");
						System.out.println("Informe o modelo do seu carro: ");
				
							
					}
					
					public static void opção1() {
						
						resultado = litrokmNissan [0]* Co2 ;
						
						System.out.println();
						System.out.println("A cada 8.9km rodados o Nissan Frontier gasta" + litrokmNissan [0] );
						System.out.println("JOGANDO"+resultado+"kg de Co2 na atmosfera");
						
					}
						
					
				        public static void opção2() {
				        	
				        	resultado =litrokmNissan [1]* Co2;
				        	
				        	System.out.println();
				        	System.out.println("A cada 12.9km rodados o Nissan versa gasta" + litrokmNissan [1]);
				        	System.out.println("Jogando" + resultado+"kg de co2 na  atmosfera");
				        	
				        }
				        
				        	public static void opção3() {
				        	
				        	resultado =litrokmNissan [2]* Co2;
				        	
				        	System.out.println();
				        	System.out.println("A cada 7.8km rodados o Nissan versa gasta" + litrokmNissan [2]);
				        	System.out.println("Jogando" + resultado+"kg de co2 na  atmosfera");
				        
				        	
				        	
				        
				        	
				        	
				        }
					
		}

	
