package kataStatsTest;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import kataStats.Statistiques;

public class StatistiquesTest {

	@Test
	public void minimum_withEmptyList_returnZero() {
		Statistiques instance = new Statistiques();
		int result = instance.minimum();
		assertThat(result,is(0));
	}
	
	@Test
	public void minimum_withOneItem_returnTheItem() {
		Statistiques instance = new Statistiques();
		int result = instance.minimum(1);
		assertThat(result,is(1));	
	}
	
	@Test
	public void minmum_withMoreThanOneItem_returnTheMinimumValue() {
		Statistiques instance = new Statistiques();
		int result = instance.minimum(3,-1);
		assertThat(result,is(-1));
	}
	
	@Test
	public void maximum_withEmptyList_returnZero() {
		Statistiques instance = new Statistiques();
		int result = instance.maximum();
		assertThat(result,is(0));
	}
	
	@Test
	public void maximum_withOneItem_returnTheItem() {
		Statistiques instance = new Statistiques();
		int result = instance.maximum(1);
		assertThat(result,is(1));	
	}
	
	@Test
	public void maximum_withMoreThanOneItem_returnTheMaximumValue() {
		Statistiques instance = new Statistiques();
		int result = instance.maximum(-1,3);
		assertThat(result,is(3));
	}
	
	@Test
	public void sequenceLength_withNoItem_returnZero() {
		Statistiques instance = new Statistiques();
		int result = instance.sequenceLength();
		assertThat(result,is(0));
		}
	
	@Test
	public void sequenceLength_withAtLeastOneItem_returnTheNumbersOfItems() {
		Statistiques instance = new Statistiques();
		int result = instance.sequenceLength(1,1);
		assertThat(result,is(2));
		}
	
	@Test
	public void mean_withEmptyList_returnZero() {
		Statistiques instance = new Statistiques();
		double result = instance.mean();
		assertThat(result,is(0.0));
		}
	
	@Test
	public void mean_withOneItem_returnTheItemValueAsDouble() {
		Statistiques instance = new Statistiques();
		double result = instance.mean(14);
		assertThat(result,is(14.0));
		}
	
	@Test
	public void mean_withMoreThanOneItem_returnTheMeanOfTheSequence() {
		Statistiques instance = new Statistiques();
		double result = instance.mean(15,5);
		assertThat(result,is(10.0));
		}
}
