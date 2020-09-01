package org.example;

import com.wf.captcha.ChineseCaptcha;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {

        List<String> words = Arrays.asList("Hello","World");
        words.stream()
                .map(t -> t.split(""))
                .map(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        words.stream()
                .map(t->t.split(""))
                .flatMap(t -> Arrays.stream(t))
                .distinct()
                .collect(Collectors.toList());

        List<Flower> flowers = Arrays.asList(
                new Flower("red", 6),
                new Flower("yellow", 7),
                new Flower("pink", 8)
        );

        Map<String , Integer> map = flowers.stream().collect(Collectors.toMap(Flower::getColor, Flower::getPrice));
        System.out.println(map);
        System.out.println(Arrays.toString(flowers.stream().map(Flower::getColor).toArray()));
        flowers.stream().filter(i -> i.getPrice() > 6 )
                .map(Flower::getColor)
                .collect(Collectors.toList());

        FilterPrecidate filterPrecidate = (Flower f) -> false;

        List<Flower> fs = Flower.filterFlower(flowers,  i -> i.getPrice()==7);
        System.out.println();

        Function<Integer,Integer> funcTest = i->i+1;
        System.out.println(funcTest.apply(5));
    }

    @Test
    public void captcha() throws FileNotFoundException {
        File file = new File("/Users/niqikai/cap","aa.png");
        ChineseCaptcha captcha = new ChineseCaptcha();
        System.out.println(captcha.text());
        captcha.out(new FileOutputStream(file));
    }


}
