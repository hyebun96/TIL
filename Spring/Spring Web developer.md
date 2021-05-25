# 스프링 웹 개발 기초

### 정적 컨텐츠
+ 파일을 그대로 웹 브라우저(고객)에게 전달해 주는 것

#### 정적 컨텐츠 공식문서
+ [Spring 공식 문서](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/html/spring-bootfeatures.html#boot-features-spring-mvc-static-content)
+ Spring Boot는 클래스 경로에서 /static(또는 /public또는 /resources또는 /META-INF/resources)라는 디렉토리를 찾아감

#### 정적 컨텐츠 흐름
![정적 컨텐츠](정적컨텐츠.PNG)
+ 웹 브라우저에서 'localhost:8080/hello-static.html'을 요청
+ 내장 톰캣 서버에서 스프링 컨테이너에게 전송
+ 스프링 컨테이너(우선순위)는 hello-static이라는 controller를 찾음 => 매핑된 controller 없음
+ resorces안에 static 밑에서 찾아서 있으면 웹 브라우저에게 반환해줌
<br/>


### MVC와 템플릿 엔진
+ 서버에서 변형을 통해 동적인 페이지를 전달하는 것
<br/>

### API
+ JSON 데이터 포맷으로 클라이언트에게 데이터를 전달하는 것