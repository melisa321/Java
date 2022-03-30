package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PlayListTest {
    /*private final Barman barman = new Barman();

    @Test
    public void barmanMaStworzycDrinkaZPodanych3SkladnikowTest() {
        Ingredient likierAnanasowy = new Ingredient("Likier Ananasowy", BigDecimal.valueOf(60));
        Ingredient mleko = new Ingredient("Mleko", BigDecimal.valueOf(10));
        Ingredient sokJablkowy = new Ingredient("Sok Jablkowy", BigDecimal.valueOf(30));

        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(likierAnanasowy);
        ingredients.add(mleko);
        ingredients.add(sokJablkowy);

        Drink result = barman.createDrink(ingredients);
        Assertions.assertAll(
                () -> Assertions.assertEquals(3, result.getAllIgredients().size()),
                () -> Assertions.assertTrue(result.getAllIgredients().contains(likierAnanasowy)),
                () -> Assertions.assertTrue(result.getAllIgredients().contains(mleko)),
                () -> Assertions.assertTrue(result.getAllIgredients().contains(sokJablkowy))
        );
    }*/
}