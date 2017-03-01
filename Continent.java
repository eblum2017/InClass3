import java.util.ArrayList;
/**
 * This the Continent class which has a has-a relationship with Country.
 * It has a name and an array list of countries.
 */
public class Continent{
	private String name;
	private ArrayList<Country> countries;
	
	/**
	 * This is a default constructor.
	 */
	public Continent(){
		name = "Asia";
		countries = new ArrayList<Country>();
	}
	
	/**
	 * This constructor takes in the name of a Continent and initializes
	 * with an empty array list.
	 * @param n name
	 */
	public Continent(String n){
		name = n;
		countries = new ArrayList<Country>();
	}
	
	/**
	 * This constructor instantiates an object with a given name and array list
	 * @param n name
	 * @param c countries
	 */
	public Continent(String n, ArrayList<Country> c){
		name = n;
		countries = c;
	}
	
	//getters
	/**
	 * This is the accessor for the name field.
	 * @return name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * This is the accessor for the countries field.
	 * @return countries
	 */
	public ArrayList<Country> getCountries(){
		return countries;
	}
	
	
	//setters
	/**
	 * This is the modifier for the name field.
	 * @param name
	 */
	public void setName(String n){
		name = n;
	}
	
	/**
	 * This is the modifier for the countries field.
	 * @param countries
	 */
	public void setCountries(ArrayList<Country> c){
		countries = c;
	}
	
	/**
	 * This modifier adds a country to the arraylist countries.
	 * @param country to be added
	 */
	public void addCountry(Country c){
		countries.add(c);
	}
	
	/**
	 * This method returns whether the Continent n contains the 
	 * Country c in its countries field.
	 * @param n continent
	 * @param c country
	 * @return if n's countries contains c
	 */
	public static boolean contains(Continent n, Country c){
		ArrayList<Country> list = n.getCountries();
		for(Country i : list){
			if(i.equals(c)){
				return true;
			}
		}
		return false;
	}
	
	public Country greatestPopulation(){
		long biggest = 0;
		Country a = countries.get(0);
		for (Country c : this.getCountries()){
			if (c.getPopulation() > biggest){
				biggest = c.getPopulation();
				a = c;
			}	
		}
		return a;
	}
		
			
	
	
	
	
}