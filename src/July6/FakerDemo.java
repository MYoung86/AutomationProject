package July6;

import com.github.javafaker.Faker;

public class FakerDemo {

    public static void main(String[] args) {

        Faker fakeData = new Faker();

        System.out.println(fakeData.internet().emailAddress());

        System.out.println(fakeData.name());

        System.out.println(fakeData.business().creditCardNumber());
        System.out.println(fakeData.phoneNumber().cellPhone());

        System.out.println(fakeData.chuckNorris().fact());

    }
}
