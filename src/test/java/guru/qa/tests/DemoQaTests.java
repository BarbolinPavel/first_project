package guru.qa.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.javafaker.Faker;
import io.qameta.allure.selenide.AllureSelenide;
import page.RegistrationFormPage;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class DemoQaTests extends TestBase{
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    Faker faker = new Faker(new Locale("en"));
    String firstName = faker.name().firstName();

    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String numberPhone = faker.phoneNumber().subscriberNumber(10);
    String address = faker.address().streetAddress();

    @Test
    void successTest(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        registrationFormPage.openPage()
                .inputFirstName(firstName)
                .inputLastName(lastName)
                .inputUserEmail(email)
                .inputGender()
                .inputUserNamber(numberPhone)
                .inputDateBirthday()
                .inputSubjects()
                .inputHobbies()
                .inputAddress(address)
                .inputState()
                .inputCity()
                .clickSubmit();
        registrationFormPage.validationResponse(firstName, lastName);
    }
}

