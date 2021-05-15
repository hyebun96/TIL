# View Setting

#### Welcom Page
+ [Spring 공식 문서](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/html/spring-boot-features.html#boot-features-spring-mvc-welcome-page)
>Spring Boot supports both static and templated welcome pages. 
>It first looks for an index.html file in the configured static content locations. 
>If one is not found, it then looks for an index template. If either is found, it is automatically used as the welcome page of the application.

+ thymeleaf 템플릿 엔진
  + [thymeleaf 공식 사이트](https://www.thymeleaf.org/)
  + [스프링 공식 튜토리얼](https://spring.io/guides/gs/serving-web-content/)
  + [스프링부트 메뉴얼](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/)
  + [템플릿 엔진](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/html/spring-boot-features.html#boot-features-spring-mvc-welcome-page)
<br/>

#### 빌드하고 실행하기
[윈도우 버전]
+ 콘솔로 이동 명령 프롬프트(cmd)로 이동
+ ./gradlew gradlew.bat 를 실행
+ 명령 프롬프트에서 gradlew.bat 를 실행하려면 gradlew
+ gradlew build
+ 폴더 목록 확인 ls dir
~~~
gradlew.bat
cd build/libs
java -jar hello-spring-0.0.1-SNAPSHOT.war
~~~