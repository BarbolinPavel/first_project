package page;

import com.codeborne.selenide.Selectors;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {
    public RegistrationFormPage openPage(){
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#close-fixedban').remove()");
        return this;
    }
    public RegistrationFormPage inputFirstName(String firstName){
        $("#firstName").setValue(firstName);
        return this;
    }
    public RegistrationFormPage inputLastName(String lastName){
        $("#lastName").setValue(lastName);
        return this;
    }
    public RegistrationFormPage inputUserEmail(String email){
        $("#userEmail").setValue(email);
        return this;
    }
    public RegistrationFormPage inputGender(){
        $("#genterWrapper").$("label").click();
        return this;
    }
    public RegistrationFormPage inputUserNamber(String numberPhone){
        $("#userNumber").setValue(numberPhone);
        return this;
    }
    public RegistrationFormPage inputDateBirthday(){
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("June");
        $(".react-datepicker__year-select").selectOption("1988");
        $(".react-datepicker__day--023").click();
        return this;
    }
    public RegistrationFormPage inputSubjects(){
        $("#subjectsInput").setValue("History").pressEnter();
        return this;
    }
    public RegistrationFormPage inputHobbies(){
        $("#hobbiesWrapper").$(byText("Reading")).click();
        return this;
    }
    public RegistrationFormPage inputAddress(String address){
        $("#currentAddress-wrapper").$("[placeholder=\"Current Address\"]").click();
        $("#currentAddress-wrapper").$("[placeholder=\"Current Address\"]").sendKeys(address);
        return this;
    }
    public RegistrationFormPage inputState(){
        $("#state").click();
        $("#stateCity-wrapper").$(Selectors.byText("Haryana")).click();
        return this;
    }
    public RegistrationFormPage inputCity(){
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Panipat")).click();
        return this;
    }

    public RegistrationFormPage clickSubmit(){
        $("#submit").click();
        return this;
    }
    public RegistrationFormPage validationResponse(String firstName, String lastName){
        $(".modal-content").shouldBe(visible);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));

        $(".modal-body").shouldHave(text(firstName + " " + lastName));
        return this;
    }
}
