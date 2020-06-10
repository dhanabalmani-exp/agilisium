# Agilisium Product
Provide REST API with basic authendication

This is porject developed with Java, Spring boot web, securiy modules.

### Prerequisites:
 - Java 8 or later
 - Maven
 - Postman

### Run Application:
- Download this project and unzip the file and locate some folder(i.e. C:\dev\agilisium)
- Open command promt and naviagate to the project root folder

- #### Clean & Install:
    - Execute below command to download the dependencies
    ```sh
    > mvn clean install -DskipTests
    ```
- #### Test:
    - Execute below command to verify the application passed all kind of scenarios
    ```sh
    > mvn test
    ```
- #### Run:
    - Execute below command to run the application
    ```sh
    > mvn spring-boot:run
    ```

### REST API:
  This application provide information for configuration and product details based on the user permission.
  
  #### Credentials
  | Username | Password | Role | Api |
  | -------- | -------- | ---- | --- |
  | user1 | password1 | ROLE_USER1 | Product |
  | user2 | password2 | ROLE_USER2 | Config |
  
  #### API
  | Name | API | Request Method | Comments |
  | ---- | --- | -------------- | -------- |
  |Product Details | /api/getproductdetails | GET | List out all the available products |
  |Config Details | /api/getconfigdetails | GET | List out all the configuration for the products |
 
