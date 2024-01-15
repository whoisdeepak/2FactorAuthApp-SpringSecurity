This Spring Boot application serves as a demonstration of user signup and login functionalities with the added layer of Two-Factor Authentication (2FA). 
The application utilizes Thymeleaf for rendering signup/login pages and integrates Spring Security to manage user authentication. 
Two-Factor Authentication is implemented by sending OTPs to users' email addresses using JavaMailSender.
The live app link can be accessed at: https://twofactorauth-kosd.onrender.com/login

The internal architecture of how incoming requests are intercepted by spring security filter chain and traversed through various security interfaces can be seen below:

![image](https://github.com/whoisdeepak/2FactorAuthApp-SpringSecurity/assets/101911034/24c90ff7-9e7c-43fb-9f76-1bdf32efe084)

UI Flow is as follows:

1. Users can register by providing required details through the Thymeleaf signup page. Passwords are securely stored using Spring Security's password encoding.

![image](https://github.com/whoisdeepak/2FactorAuthApp-SpringSecurity/assets/101911034/800a39ce-4777-4530-8850-264c74cceed8)


2. Once user finishes signing up, app redirects to login page. On login attempt, users are authenticated using Spring Security. If enabled, 2FA is triggered and OTP is sent to registered email address.

![image](https://github.com/whoisdeepak/2FactorAuthApp-SpringSecurity/assets/101911034/96af4753-1266-4b07-84ce-8bc1566a98ab)

![image](https://github.com/whoisdeepak/2FactorAuthApp-SpringSecurity/assets/101911034/d36cf9ed-d40b-425d-98c5-b26cf4cfd13f)

![image](https://github.com/whoisdeepak/2FactorAuthApp-SpringSecurity/assets/101911034/f59fd324-534e-48e9-a0c9-7e795328b06f)


3. Successful OTP verificaation allows access to the application:

![image](https://github.com/whoisdeepak/2FactorAuthApp-SpringSecurity/assets/101911034/01b07ea6-1998-461d-bcc4-93d2b2c8870d)

