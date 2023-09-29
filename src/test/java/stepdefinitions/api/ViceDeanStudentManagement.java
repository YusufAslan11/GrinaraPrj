package stepdefinitions.api;


import baseUrl.ManagementonSchoolsBaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.ViceDeanStudent;
import pojos.ViceDeanStudentObjectPojo;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationManagementonSchool.generateToken;
//import static utilities.Authorization.generateTokenViceDean;

public class ViceDeanStudentManagement extends ManagementonSchoolsBaseUrl {
//    US15_Pojo expectedData;
    ViceDeanStudent expectedDataa;
    Response responsebrc;
    Response response;
    JsonPath jsonPath;
//    US15_p payload;
    public static int userId;
    @Given("Admin olarak tum students icin get request yap")
    public void tum_guest_userlar_icin_get_request_yap() {
        //Set the url
        //https://managementonschools.com/app/students/getAll
        specViceDean.pathParams("first", "students", "second", "getAll");
        //Send the request and get the response
        response = given(specViceDean).get("{first}/{second}");
        response.prettyPrint();
    }
    @Then("gelen bodyi dogrula {string}, {string}, {string}, {string}, {string}, {string}, {string},{string},{string},{string},{string}")
    public void gelenBodyiDogrula(String name, String surname, String birthplace, String phone, String gender, String dateOfBirth, String ssn, String username, String fatherName, String motherName, String password) {
        JsonPath jsonPath=response.jsonPath();
        Object actName = jsonPath.getList("findAll{it.username=='" + username + "'}.name").get(0);
        Object actUsername = jsonPath.getList("findAll{it.username=='" + username + "'}.username").get(0);
        Object actSurname = jsonPath.getList("findAll{it.username=='" + username + "'}.surname").get(0);
        Object actBirthPlace = jsonPath.getList("findAll{it.username=='" + username + "'}.birthPlace").get(0);
        Object actPhone = jsonPath.getList("findAll{it.username=='" + username + "'}.phoneNumber").get(0);
        Object actGender = jsonPath.getList("findAll{it.username=='" + username + "'}.gender").get(0);
        Object actBirthDay = jsonPath.getList("findAll{it.username=='" + username + "'}.birthDay").get(0);
        Object actmotherName = jsonPath.getList("findAll{it.username=='" + username + "'}.motherName").get(0);
        Object actfatherName = jsonPath.getList("findAll{it.username=='" + username + "'}.fatherName").get(0);
        Object actPassword = jsonPath.getList("findAll{it.username=='" + username + "'}.password").get(0);
        assertEquals(name, actName);
        assertEquals(username, actUsername);
        assertEquals(surname, actSurname);
        assertEquals(birthplace, actBirthPlace);
        assertEquals(phone, actPhone);
        assertEquals(gender, actGender);
        assertEquals(dateOfBirth, actBirthDay);
        assertEquals(motherName, actmotherName);
        assertEquals(fatherName, actfatherName);

    }
    @Given("tum mesajlar icin get request yap")
    public void tumMesajlarIcinGetRequestYap() {
        //Set the url
        https://managementonschools.com/app/contactMessages/getAll

        specViceDean.pathParams("first", "contactMessages", "second", "getAll");
        responsebrc = given(specViceDean).header("Authorization", generateToken((String) ConfigReader.getProperty("usernamev"), (String) ConfigReader.getProperty("passwordv")))
                .get("{first}/{second}");



        responsebrc.prettyPrint();
    }
    @Then("gelen bodyi dogrula {string}, {string}, {string}, {string}, {string}")
    public void gelenBodyiDogrula(String name, String email, String subject, String message, String date) {


//        JsonPath jsonPath=response.jsonPath();
//        Object actName = jsonPath.getList("content.findAll{it.email=='" + email + "'}.name").get(0);
//        Object actEmail = jsonPath.getList("content.findAll{it.email=='" + email + "'}.email").get(0);
//        Object actSubject = jsonPath.getList("content.findAll{it.email=='" + email + "'}.subject").get(0);
//        Object actMessage = jsonPath.getList("content.findAll{it.email=='" + email + "'}.message").get(0);
//        Object actDate = jsonPath.getList("content.findAll{it.email=='" + email + "'}.date").get(0);
//        assertEquals(name, actName);
//        assertEquals(email, actEmail);
//        assertEquals(subject, actSubject);
//        assertEquals(message, actMessage);
//        assertEquals(date, actDate);
    }

    @Given("Vice Dean olarak tum students icin get request yap")
    public void tumStudentsIcinGetRequestYap() {
        //Set the url
        //https://managementonschools.com/app/students/getAll
        specViceDean.pathParams("first", "students", "second", "getAll");
        //Send the request and get the response
        response = given(specViceDean).get("{first}/{second}");
        response.prettyPrint();
    }
    @Given("student icin post request yap")
    public void studentIcinPostRequestYap() {



    }


    @Given("student icin post request yap {string}, {string}, {string}, {string}, {string}, {string}, {string},{string},{string},{string},{string},{string},{string}")
    public void studentIcinPostRequestYap(String advisorTeacherId, String birthDay, String birthPlace, String email, String fatherName, String gender, String motherName, String name, String surname, String phoneNumber, String ssn, String username, String password) {
        Faker fake = new Faker();
        //set the url
        //https://managementonschools.com/app/students/save
        specViceDean.pathParams("first","students","second","save");

        //set the expected data
        if (advisorTeacherId==null) {
            advisorTeacherId = null;
        } else {
            advisorTeacherId = "1";
        }
        if (birthDay.equals("")) {
            birthDay = "";
        } else {
            birthDay = "1979-12-12";
        }
        if (birthPlace.equals("")) {
            birthPlace = "";
        } else {
            birthPlace = "Alaska";
        }
        if (gender.equals("")) {
            gender = "";
        } else {
            gender = "FEMALE";
        }
        if (name.equals("")) {
            name = "";
        } else {
            name = fake.name().firstName();
        }
        if (password.equals("")) {
            password = "";
        } else {
            password = (String) ConfigReader.getProperty("passw");
        }
        if (phoneNumber.equals("")) {
            phoneNumber = "";
        } else {
            phoneNumber = fake.numerify("###-###-####");
        }
        if (ssn.equals("")) {
            ssn = "";
        } else {
            ssn = fake.idNumber().ssnValid();
        }
        if (surname.equals("")) {
            surname = "";
        } else {
            surname = fake.name().lastName();
        }
        if (username.equals("")) {
            username = "";
        } else {
            username = fake.name().lastName();
        }
        if (motherName.equals("")) {
            motherName = "";
        } else {

            motherName =(String) ConfigReader.getProperty("motherName");
        }
        if (fatherName.equals("")) {
            fatherName = "";
        } else {

            fatherName =(String) ConfigReader.getProperty("fatherName");
        }
        if (email.equals("")) {
            email = "";
        } else {

            email =fake.internet().emailAddress();
        }
        if (birthDay.equals("")) {
            birthDay = "";
        } else {
            birthDay = "1979-12-12";
        }


        //  expectedData=new US15_Pojo(1,"1999-04-23","ankara","DDASLM@gmail.com","demir","FEMALE","bade","cemil",
        //             "cem","379-109-4431","815-69-0011","DADKSdLD","118914697",0,0,null);
        expectedDataa=new ViceDeanStudent(advisorTeacherId,birthDay,birthPlace,email,fatherName,gender,motherName,name,surname,phoneNumber,ssn,username,password);
        //Send the request and get the response
        responsebrc = given(specViceDean).body(expectedDataa).header("Authorization", generateToken((String) ConfigReader.getProperty("Erelusername"), (String) ConfigReader.getProperty("Erelpassword"))).post("{first}/{second}");
        responsebrc.prettyPrint();
//
    }

    @Then("body i dogrula")
    public void bodyIDogrula() throws JsonProcessingException {
        ViceDeanStudentObjectPojo actualData =new ObjectMapper().readValue(responsebrc.asString(), ViceDeanStudentObjectPojo.class);
        //  System.out.println("actualData = " + actualData);
        //   System.out.println("actualData.getObject().getUsername() = " + actualData.getObject().getUsername());
        // System.out.println("expectedDataa.getUsername() = " + expectedDataa.getUsername());
        assertEquals(expectedDataa.getUsername(),actualData.getObject().getUsername());
        assertEquals(expectedDataa.getName(),actualData.getObject().getName());
        assertEquals(expectedDataa.getSurname(),actualData.getObject().getSurname());
        assertEquals(expectedDataa.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(expectedDataa.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(expectedDataa.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(expectedDataa.getUsername(),actualData.getObject().getUsername());
        assertEquals(expectedDataa.getGender(),actualData.getObject().getGender());
        assertEquals(expectedDataa.getMotherName(),actualData.getObject().getMotherName());
        assertEquals(expectedDataa.getFatherName(),actualData.getObject().getFatherName());
        assertEquals(expectedDataa.getEmail(),actualData.getObject().getEmail());
        jsonPath = responsebrc.jsonPath();
        userId = jsonPath.getInt("object.userId");
        System.out.println("userId = " + userId);
    }

    @Given("VİCE DEAN student icin post request yap {string}, {string}, {string}, {string}, {string}, {string}, {string},{string},{string},{string},{string},{string},{string}")
    public void viceDEANStudentIcinPostRequestYap(String advisorTeacherId, String birthDay, String birthPlace, String email, String fatherName, String gender, String motherName, String name, String surname, String phoneNumber, String ssn, String username, String password) {
        Faker fake = new Faker();
        //set the url
        //https://managementonschools.com/app/students/save
        specViceDean.pathParams("first","students","second","save");

        //set the expected data
        if (advisorTeacherId==null) {
            advisorTeacherId = null;
        } else {
            advisorTeacherId = "1";
        }
        if (birthDay.equals("")) {
            birthDay = "";
        } else {
            birthDay = "1979-12-12";
        }
        if (birthPlace.equals("")) {
            birthPlace = "";
        } else {
            birthPlace = "Alaska";
        }
        if (gender.equals("")) {
            gender = "";
        } else {
            gender = "FEMALE";
        }
        if (name.equals("")) {
            name = "";
        } else {
            name = fake.name().firstName();
        }
        if (password.equals("")) {
            password = "";
        } else {
            password =fake.internet().password();
        }
        if (phoneNumber.equals("")) {
            phoneNumber = "";
        } else {
            phoneNumber = fake.numerify("###-###-####");
        }
        if (ssn.equals("")) {
            ssn = "";
        } else {
            ssn = fake.idNumber().ssnValid();
        }
        if (surname.equals("")) {
            surname = "";
        } else {
            surname = fake.name().lastName();
        }
        if (username.equals("")) {
            username = "";
        } else {
            username = fake.name().username();
        }
        if (motherName.equals("")) {
            motherName = "";
        } else {

            motherName ="leyla";
        }
        if (fatherName.equals("")) {
            fatherName = "";
        } else {

            fatherName ="mecnun";
        }
        if (email.equals("")) {
            email = "";
        } else {

            email =fake.internet().emailAddress();
        }
        if (birthDay.equals("")) {
            birthDay = "";
        } else {
            birthDay = "1979-12-12";
        }


        //  expectedData=new US15_Pojo(1,"1999-04-23","ankara","DDASLM@gmail.com","demir","FEMALE","bade","cemil",
        //             "cem","379-109-4431","815-69-0011","DADKSdLD","118914697",0,0,null);
        expectedDataa=new ViceDeanStudent(advisorTeacherId,birthDay,birthPlace,email,fatherName,gender,motherName,name,surname,phoneNumber,ssn,username,password);
        //Send the request and get the response
        responsebrc = given(specViceDean).body(expectedDataa).post("{first}/{second}");
        responsebrc.prettyPrint();
    }

    @Then("VİCE DEAN body i dogrula")
    public void viceDEANBodyIDogrula() throws JsonProcessingException {

        ViceDeanStudentObjectPojo actualData =new ObjectMapper().readValue(responsebrc.asString(), ViceDeanStudentObjectPojo.class);
        //  System.out.println("actualData = " + actualData);
        //   System.out.println("actualData.getObject().getUsername() = " + actualData.getObject().getUsername());
        // System.out.println("expectedDataa.getUsername() = " + expectedDataa.getUsername());
        assertEquals(expectedDataa.getUsername(),actualData.getObject().getUsername());
        assertEquals(expectedDataa.getName(),actualData.getObject().getName());
        assertEquals(expectedDataa.getSurname(),actualData.getObject().getSurname());
        assertEquals(expectedDataa.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(expectedDataa.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(expectedDataa.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(expectedDataa.getUsername(),actualData.getObject().getUsername());
        assertEquals(expectedDataa.getGender(),actualData.getObject().getGender());
        assertEquals(expectedDataa.getMotherName(),actualData.getObject().getMotherName());
        assertEquals(expectedDataa.getFatherName(),actualData.getObject().getFatherName());
        assertEquals(expectedDataa.getEmail(),actualData.getObject().getEmail());
        jsonPath = responsebrc.jsonPath();
        userId = jsonPath.getInt("object.userId");
        System.out.println("userId = " + userId);
    }

    @Given("VİCE DEAN send get request to url by id_")
    public void viceDEANSendGetRequestToUrlById_() {

        https://managementonschools.com/app/students/getStudentById?id=632
        System.out.println("userId = " + userId);

        specViceDean.pathParams("first", "students", "second", "getStudentById").queryParam("id",userId);

        responsebrc = given(specViceDean).header("Authorization", generateToken((String) ConfigReader.getProperty("Erelusername"), (String) ConfigReader.getProperty("Erelpassword")))
                .get("{first}/{second}");
        responsebrc.prettyPrint();
    }

    @Then("VİCE DEAN Validate response body_")
    public void viceDEANValidateResponseBody_() {
        Assert.assertEquals(200,responsebrc.statusCode());

    }

    @Given("VİCE DEAN send DEL request to url by id_")
    public void viceDEANSendDELRequestToUrlById_() {
        //https://managementonschools.com/app/students/delete/504
        specViceDean.pathParams("first", "students", "second", "delete","third",userId);
        responsebrc = given(specViceDean).header("Authorization", generateToken((String) ConfigReader.getProperty("Erelusername"), (String) ConfigReader.getProperty("Erelpassword")))
                .delete("{first}/{second}/{third}");

        responsebrc.prettyPrint();
    }

    @Then("VİCE DEAN Validate DEL response body_")
    public void viceDEANValidateDELResponseBody_() {
        Assert.assertEquals(200,responsebrc.statusCode());
        Assert.assertTrue(responsebrc.asString().contains("Student Deleted"));
        Assert.assertTrue(responsebrc.asString().contains("OK"));
    }

    @Given("ADMİN student icin post request yap {string}, {string}, {string}, {string}, {string}, {string}, {string},{string},{string},{string},{string},{string},{string}")
    public void adminStudentIcinPostRequestYap(String advisorTeacherId, String birthDay, String birthPlace, String email, String fatherName, String gender, String motherName, String name, String surname, String phoneNumber, String ssn, String username, String password) {
        Faker fake = new Faker();
        //set the url
        //https://managementonschools.com/app/students/save
        specViceDean.pathParams("first","students","second","save");

        //set the expected data
        if (advisorTeacherId==null) {
            advisorTeacherId = null;
        } else {
            advisorTeacherId = "1";
        }
        if (birthDay.equals("")) {
            birthDay = "";
        } else {
            birthDay = "1979-12-12";
        }
        if (birthPlace.equals("")) {
            birthPlace = "";
        } else {
            birthPlace = "Alaska";
        }
        if (gender.equals("")) {
            gender = "";
        } else {
            gender = "FEMALE";
        }
        if (name.equals("")) {
            name = "";
        } else {
            name = fake.name().firstName();
        }
        if (password.equals("")) {
            password = "";
        } else {
            password = (String) ConfigReader.getProperty("passw");
        }
        if (phoneNumber.equals("")) {
            phoneNumber = "";
        } else {
            phoneNumber = fake.numerify("###-###-####");
        }
        if (ssn.equals("")) {
            ssn = "";
        } else {
            ssn = fake.idNumber().ssnValid();
        }
        if (surname.equals("")) {
            surname = "";
        } else {
            surname = fake.name().lastName();
        }
        if (username.equals("")) {
            username = "";
        } else {
            username = fake.name().lastName();
        }
        if (motherName.equals("")) {
            motherName = "";
        } else {

            motherName =(String) ConfigReader.getProperty("motherName");
        }
        if (fatherName.equals("")) {
            fatherName = "";
        } else {

            fatherName =(String) ConfigReader.getProperty("fatherName");
        }
        if (email.equals("")) {
            email = "";
        } else {

            email =fake.internet().emailAddress();
        }
        if (birthDay.equals("")) {
            birthDay = "";
        } else {
            birthDay = "1979-12-12";
        }


        //  expectedData=new US15_Pojo(1,"1999-04-23","ankara","DDASLM@gmail.com","demir","FEMALE","bade","cemil",
        //             "cem","379-109-4431","815-69-0011","DADKSdLD","118914697",0,0,null);
        expectedDataa=new ViceDeanStudent(advisorTeacherId,birthDay,birthPlace,email,fatherName,gender,motherName,name,surname,phoneNumber,ssn,username,password);
        //Send the request and get the response
        responsebrc = given(specViceDean).body(expectedDataa).header("Authorization", generateToken((String) ConfigReader.getProperty("usernameAdmin"), (String) ConfigReader.getProperty("passwordAdmin"))).post("{first}/{second}");
        responsebrc.prettyPrint();
    }

    @Then("ADMİN body i dogrula")
    public void adminBodyIDogrula() throws JsonProcessingException {
        ViceDeanStudentObjectPojo actualData =new ObjectMapper().readValue(responsebrc.asString(), ViceDeanStudentObjectPojo.class);
        //  System.out.println("actualData = " + actualData);
        //   System.out.println("actualData.getObject().getUsername() = " + actualData.getObject().getUsername());
        // System.out.println("expectedDataa.getUsername() = " + expectedDataa.getUsername());
        assertEquals(expectedDataa.getUsername(),actualData.getObject().getUsername());
        assertEquals(expectedDataa.getName(),actualData.getObject().getName());
        assertEquals(expectedDataa.getSurname(),actualData.getObject().getSurname());
        assertEquals(expectedDataa.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(expectedDataa.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(expectedDataa.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(expectedDataa.getUsername(),actualData.getObject().getUsername());
        assertEquals(expectedDataa.getGender(),actualData.getObject().getGender());
        assertEquals(expectedDataa.getMotherName(),actualData.getObject().getMotherName());
        assertEquals(expectedDataa.getFatherName(),actualData.getObject().getFatherName());
        assertEquals(expectedDataa.getEmail(),actualData.getObject().getEmail());
        jsonPath = responsebrc.jsonPath();
        userId = jsonPath.getInt("object.userId");
        System.out.println("userId = " + userId);
    }

    @Given("ADMİN send get request to url by id_")
    public void adminSendGetRequestToUrlById_() {
        https://managementonschools.com/app/students/getStudentById?id=632
        System.out.println("userId = " + userId);

        specViceDean.pathParams("first", "students", "second", "getStudentById").queryParam("id",userId);
        responsebrc = given(specViceDean).body(expectedDataa)// bu kismi boyle dene OLMAZSA GUNCELLE
                .get("{first}/{second}");// bu kismi boyle dene OLMAZSA GUNCELLE

        responsebrc.prettyPrint();
    }

    @Then("ADMİN Validate response body_")
    public void adminValidateResponseBody_() {
        Assert.assertEquals(200,responsebrc.statusCode());
    }

    @Given("ADMİN send DEL request to url by id_")
    public void adminSendDELRequestToUrlById_() {
        //https://managementonschools.com/app/students/delete/504
        specViceDean.pathParams("first", "students", "second", "delete","third",userId);
        responsebrc = given(specViceDean).header("Authorization", generateToken((String) ConfigReader.getProperty("ErelusernameAdmin"), (String) ConfigReader.getProperty("ErelpasswordAdmin")))
                .delete("{first}/{second}/{third}");

        responsebrc.prettyPrint();
    }

    @Then("ADMİN Validate DEL response body_")
    public void adminValidateDELResponseBody_() {
        Assert.assertEquals(200,responsebrc.statusCode());
        Assert.assertTrue(responsebrc.asString().contains("Student Deleted"));
        Assert.assertTrue(responsebrc.asString().contains("OK"));
    }

    @Then("GetAllContact gelen bodyi dogrula")
    public void getallcontactGelenBodyiDogrula(String email) {
        JsonPath jsonPath=response.jsonPath();


        Object extName = jsonPath.getList("content.findAll{it.email=='" + email + "'}.name").get(0);
        Object extEmail = jsonPath.getList("content.findAll{it.email=='" + email + "'}.email").get(0);
        Object extSubject = jsonPath.getList("content.findAll{it.email=='" + email + "'}.subject").get(0);
        Object extMessage = jsonPath.getList("content.findAll{it.email=='" + email + "'}.message").get(0);
        Object extDate = jsonPath.getList("content.findAll{it.email=='" + email + "'}.date").get(0);

        Object actName = jsonPath.getList("content.findAll{it.email=='" + email + "'}.name").get(0);
        Object actEmail = jsonPath.getList("content.findAll{it.email=='" + email + "'}.email").get(0);
        Object actSubject = jsonPath.getList("content.findAll{it.email=='" + email + "'}.subject").get(0);
        Object actMessage = jsonPath.getList("content.findAll{it.email=='" + email + "'}.message").get(0);
        Object actDate = jsonPath.getList("content.findAll{it.email=='" + email + "'}.date").get(0);


        assertEquals(extName, actName);
        assertEquals(extEmail, actEmail);
        assertEquals(extSubject, actSubject);
        assertEquals(extMessage, actMessage);
        assertEquals(extDate, actDate);
    }
}

