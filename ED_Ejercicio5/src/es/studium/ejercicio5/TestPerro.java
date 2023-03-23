package es.studium.ejercicio5;

public class TestPerro
{

	public static void main(String[] args)
	{
		//Constructor vacío
		Perro perro1 = new Perro();
		perro1.setRaza("Labrador Retriever");
		perro1.setTamanio(60.0);
		perro1.setEdad(6);
		perro1.setColor("Negro");
		
		//Constructor por parámetros
		Perro perro2 = new Perro("Siberian Husky", 56.2, 5, "Blanco y negro");
		Perro perro3 = new Perro("Pomeranian", 10.9, 2, "Marrón");
		
		System.out.println("La raza del perro es: "+perro3.getRaza());
	}

}
