package chapter2.item02;

public class NutritionFacts {
	private int servingSize;
	private int sodium;
	private int carbohydrate;
	private int servings;
	
	public NutritionFacts(int servingSize, int sodium) {
		this.servingSize = servingSize;
		this.sodium = sodium;
	}

	public NutritionFacts(int servingSize, int sodium, int carbohydrate) {
		this.servingSize = servingSize;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
	}

	public NutritionFacts(int servingSize, int sodium, int carbohydrate, int servings) {
		this.servingSize = servingSize;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
		this.servings = servings;
	}

	public static void main(String[] args) {
	}
	
}
