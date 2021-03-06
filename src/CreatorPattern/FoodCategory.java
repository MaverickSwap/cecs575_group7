package CreatorPattern;
import java.util.List;

import StructuralPattern.CompositePattern.Meal;

public abstract class FoodCategory implements Meal {

	private Integer id;
	private String name;
	private String description;
	private List<FoodItem> foodItems;
	
    public String getMealConfiguration(){
        return "Inside Food Category";
    }
        
	public FoodCategory() {
		
	}
	
	
	public String getDescription() {
		System.out.println("Printing Food Category Description");
		return description;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<FoodItem> getFoodItems() {
		return foodItems;
	}


	public void setFoodItems(List<FoodItem> foodItems) {
		this.foodItems = foodItems;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
}