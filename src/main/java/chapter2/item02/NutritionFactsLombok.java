package chapter2.item02;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

@Builder
public class NutritionFactsLombok {
	@Builder.Default private int servingSize = 10;
	private int sodium;
	private int carbohydrate;
	private int servings;
	@Singular private List<String> names;

	public static void main(String[] args) {
		NutritionFactsLombok nutritionFactsLombok = NutritionFactsLombok.builder()
				.servings(10)
				.carbohydrate(100)
				.name("ara")
				.name("minwoo")
				.clearNames()
				.build();

//		NutritionFactsLombok facts = new NutritionFactsLombok();//기본 생성자가 안만들어짐. @NoArgsConstructor 사용해야함
	}
	
}
