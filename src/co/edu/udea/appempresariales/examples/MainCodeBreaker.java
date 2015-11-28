package co.edu.udea.appempresariales.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MainCodeBreaker {

	public static void main(String[] args) {
		CodeBreaker c;
		int digitos = 0;
		StringBuffer secretAux=new StringBuffer("");
		StringBuffer test = new StringBuffer("");
		String resultado = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese la cantidad de digitos del numero que desea adivinar");
		try {
			digitos = Integer.parseInt(br.readLine());
			System.out.println(secretAux);
		} catch (NumberFormatException | IOException e) {
			System.out.println("No se ingreso un numero, Adios");
		}
		for(int i = 0; i<digitos; i++){
			Random rn = new Random();
			secretAux.append(rn.nextInt(10) + 1);
		}
		c = new CodeBreaker();
		c.setSecret(secretAux.toString());
		
		System.out.println("Numero a adivinar creado!!!");
		System.out.println("!!!Juguemos CodeBreakers!!!");
		System.out.println("Ingresa el numero que creas que es");
		
		while(!resultado.equals("xxxx")){
			try {
				test= new StringBuffer(br.readLine());
				resultado=c.test(test).toString();
				System.out.println("Tu resultado fue: "+resultado);
				System.out.println("Ingresa el numero que creas que es");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Felicitaciones el numero es "+secretAux);
		System.out.println("Adios");
	}

}
