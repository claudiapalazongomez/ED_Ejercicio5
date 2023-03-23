package es.studium.ejercicio5;

/**
 * Claudia Palaz�n G�mez
 * @author 98cla
 *
 */

public class Perro
{
	//Atributos
	
	private String raza;
	private double tamanio;
	private int edad;
	private String color;
	
	//Constructores
	
		//Constructor vac�o
	
	public Perro() 
	{
		raza = "";
		tamanio = 0.0;
		edad = 0;
		color = "";
	}
	
		//Constructor por par�metros
	
	public Perro(String raza, double tamanio, int edad, String color)
	{
		this.raza = raza;
		this.tamanio = tamanio;
		this.edad = edad;
		this.color = color;
	}
	
	//M�todos

	public String getRaza()
	{
		return raza;
	}

	public void setRaza(String raza)
	{
		this.raza = raza;
	}

	public double getTamanio()
	{
		return tamanio;
	}

	public void setTamanio(double tamanio)
	{
		this.tamanio = tamanio;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}	
	
	
}
